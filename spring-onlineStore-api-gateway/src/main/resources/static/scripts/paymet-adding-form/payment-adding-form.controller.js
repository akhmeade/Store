'use strict';

angular.module('paymentForm')
    .controller('PaymentAddingFormController', ["$http", '$state', '$stateParams', function ($http, $state, $stateParams) {
        var self = this;

        $http.get("api/payments/new").then(function (resp) {
            self.payments = resp.data;
        });

        self.submitPaymentForm = function ()
        {
            var id = self.payments.id;
            var req;
            if (id) {
                req = $http.put("api/payment/payments/" + id, self.payments);
            } else {
                req = $http.post("api/payment/payments", self.payments);
            }

            req.then(function () {
                $state.go('payments');
            }, function (response) {
                var error = response.data;
                alert(error.error + "\r\n" + error.errors.map(function (e) {
                        return e.field + ": " + e.defaultMessage;
                    }).join("\r\n"));
            });
        };
    }]);
