'use strict';

angular.module('paymentDetails', ['ui.router'])
    .config(['$stateProvider', function ($stateProvider) {
        $stateProvider
            .state('paymentNew', {
                parent: 'app',
                url: '/payments/new',
                template: '<payment-details></payment-details>'
            })
            .state('paymentDetails', {
                parent: 'app',
                url: '/payments/details/:paymentId',
                template: '<payment-details></payment-details>'
            })
    }]);
