'use strict';

angular.module('paymentsList')
    .controller('PaymentListController', ['$http', function ($http) {
        var self = this;

        $http.get('api/payments/payments').then(function (resp) {
            self.items = resp.data;
        });
    }]);

