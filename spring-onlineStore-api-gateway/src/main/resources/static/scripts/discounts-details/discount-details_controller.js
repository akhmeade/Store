'use strict';

angular.module('discountsDetails')
    .controller('discountsDetailsController', ['$http', '$stateParams', function ($http, $stateParams) {
        var self = this;

        $http.get('api/gateway/discounts/' + $stateParams.discountId).then(function (resp) {
            self.item = resp.data;
        });
    }]);
