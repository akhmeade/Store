'use strict';

angular.module('paymentDetails', ['ui.router'])
    .config(['$stateProvider', function ($stateProvider) {
        $stateProvider
            .state('paymentDetails', {
                parent: 'app',
                url: '/payments/details/:paymentId',
                template: '<payment-details></payment-details>'
            })
    }]);
