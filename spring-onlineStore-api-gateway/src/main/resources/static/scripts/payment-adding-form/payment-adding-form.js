'use strict';

angular.module('paymentForm', ['ui.router'])
    .config(['$stateProvider', function ($stateProvider) {
        $stateProvider
            .state('paymentNew', {
                parent: 'app',
                url: '/payments/new',
                template: '<payment-adding-form></payment-adding-form>'
            })
    }]);
