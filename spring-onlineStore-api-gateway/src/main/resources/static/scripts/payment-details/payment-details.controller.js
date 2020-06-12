'use strict';

angular.module('paymentDetails')
    .controller('PaymentDetailsController', ['$http', '$stateParams', function ($http, $stateParams) {
        var self = this;

        $http.get('api/gateway/payments/' + $stateParams.paymentId).then(function (resp) {
            self.payment = resp.data;
        });
    }]);
