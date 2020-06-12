'use strict';

angular.module('paymentForm')
    .controller('PaymentAddingFormController', ["$http", '$state', '$stateParams', function ($http, $state, $stateParams) {
        var self = this;

        var paymentId = $stateParams.paymentId || 0;

        if (!paymentId) {
            self.payment = {};
        } else {
            $http.get("api/payment/payments/" + paymentId).then(function (resp) {
                self.payment = resp.data;
            });
        }

        self.submitPaymentForm = function ()
        {
            var id = self.payment.id;
            var req;
            if (id) {
                req = $http.put("api/payment/payments/" + id, self.payment);
            } else {
                req = $http.post("api/payment/payments", self.payment);
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
