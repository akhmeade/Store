'use strict';

angular.module('discountsList')
    .controller('DiscountsListController', ['$http', function ($http) {
        var self = this;
        $http.get('api/discounts/discounts').then(function (resp) {
            self.items = resp.data;
        });
    }]);
