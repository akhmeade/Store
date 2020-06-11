'use strict';

angular.module('paymentsList', ['ui.router'])
    .config(['$stateProvider', function ($stateProvider) {
        $stateProvider
            .state('payments', {
                parent: 'app',
                url: '/payments',
                template: '<payments></payments>'
            })
    }]);
