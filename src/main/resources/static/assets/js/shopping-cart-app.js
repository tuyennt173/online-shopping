const app = angular.module("shopping-cart-app", []);

app.controller("shopping-cart-controller", function ($scope, $http) {
    $scope.cart = {
        items: [],

        add(id) {
            console.log(id);
            let cf = confirm('Add to cart?');
            if (cf) {
                let itemFound = this.items.find(item => item.id == id);
                if (itemFound) {
                    itemFound.quantity++;
                    this.saveToLocalStorage();
                } else {
                    $http.get(`/api/products/${id}`)
                        .then(response => {
                            response.data.quantity = 1;
                            this.items.push(response.data);
                            this.saveToLocalStorage();
                        })
                }
                // Swal.fire({
                //     title: "Action successfully",
                //     icon: "success"
                // });
            }
        },

        remove(id) {
            let cf = confirm('Delete it from cart?')
            if(cf) {
                let index = this.items.findIndex((item) => {
                    console.log(item)
                    return item.id === id
                });
                this.items.splice(index, 1);
                this.saveToLocalStorage();
            }
        },

        clear() {
            let cf = confirm('Clear all?');
            if(cf) {
                this.items = [];
                this.saveToLocalStorage();
            }
        },

        countProductsInCart() {
            return this.items
                .map(item => item.quantity)
                .reduce((total, quantity) => total += quantity, 0);
        },

        totalPrice() {
            return this.items
                .map(item => item.quantity * item.price)
                .reduce((totalPrice, productPrice) => totalPrice += productPrice, 0.0);
        },

        saveToLocalStorage() {
            let jsonData = JSON.stringify(angular.copy(this.items));
            localStorage.setItem("cart", jsonData);
        },

        loadProductsFromLocalStorage() {
            let json = localStorage.getItem("cart");
            this.items = json ? JSON.parse(json) : [];
        }
    }

    $scope.cart.loadProductsFromLocalStorage();
    $scope.orders = {
        createDate: new Date(),
        address: "",
        account: {
            userName: 'staff'
        },
        get orderDetails() {
            return $scope.cart.items.map(
                item => {
                    return {
                        product: {
                            id: item.id
                        },
                        price: item.price,
                        quantity: item.quantity
                    }
                });
        },
        handlePurchase() {
            let order = angular.copy(this);
            $http.post("/api/orders/create", order)
                .then(resp => {
                    alert('Ordered Successfully.');
                    console.log(resp.data)
                    $scope.cart.clear();
                    location.href = "/order/detail/" + resp.data.id;
                })
                .catch(error => {
                    alert("Ordered Fail, Please Try Again");
                    console.log(error);
                });
        }
    }
})