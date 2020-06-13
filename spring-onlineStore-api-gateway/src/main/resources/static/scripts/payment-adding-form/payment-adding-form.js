'use strict';

angular.module('paymentForm', ['ui.router'])
    .config(['$stateProvider', function ($stateProvider) {
        $stateProvider
            .state('paymentNew', {
                parent: 'app',
                url: '/payments/new',
                template: '<payment-form></payment-form>'
            })
            .state('paymentEdit', {
                parent: 'app',
                url: '/payments/:paymentId/edit',
                template: '<payment-form></payment-form>'
            })
    }]);
