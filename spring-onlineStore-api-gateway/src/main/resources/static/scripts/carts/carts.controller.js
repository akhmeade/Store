'use strict';

angular.module('cartsList')
    .controller('CartsListController', ['$http', function ($http) {
        var self = this;

        $http.get('api/carts/carts').then(function (resp) {
            self.items = resp.data;
        });
    }]);
