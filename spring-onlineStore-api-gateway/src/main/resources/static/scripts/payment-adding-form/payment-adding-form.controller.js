'use strict';

angular.module('paymentForm')
    .controller('PaymentAddingFormController', ["$http", '$state', '$stateParams', function ($http, $state, $stateParams) {
        var self = this;

        /* $http.get('api/payments/payments').then(function (resp) {
            self.items = resp.data;
        }); */

        $http.get('api/payments/types').then(function (resp) {
            self.types = resp.data;
        }).then ( function () {
            var paymentId = $stateParams.paymentId || 0;

            if (!paymentId) {
                self.payment = {};
            } else {
                $http.get("api/payments/payments/" + paymentId).then(function (resp) {
                    self.payment = resp.data;
                });
            }
        });

        self.submitPaymentForm = function () {
            var id = self.payment.id;
            var req;
            if (id) {
                req = $http.put("api/payments/payments/" + id, self.payment);
            } else {
                req = $http.post("api/payments/payments", self.payment);
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
