const app = angular.module("shopping-cart-app", []);

app.controller("shopping-cart-controller", function ($scope, $http) {
    $scope.cart = {
        items: [],

        add(id) {
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
    $scope.order = {
        createDate: new Date(),
        address: "",
        purchase() {
            alert('purchase')
        }
    }
})