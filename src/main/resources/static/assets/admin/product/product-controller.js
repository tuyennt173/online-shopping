app.controller("product-controller", function ($scope, $http) {
    alert('Product controller');
    $scope.items = [];
    $scope.form = {};

    //to load list products and categories
    $scope.initialize = function () {
        $http.get("/api/products")
            .then(response => {
                $scope.items = response.data;
                $scope.items.forEach(item => {
                    item.createDate = new Date(item.createDate);
                })
            });
    }

    $scope.initialize();

    //clear form
    $scope.reset = function () {
        
    }

    //show product to the form for update
    $scope.edit = function (item) {

    }

    //create new product
    $scope.create = function () {
        
    }

    //update product
    $scope.update = function () {
        
    }

    //delete product
    $scope.delete = function () {
        
    }

    //upload the other image
    $scope.imageChange = function (file) {

    }
});