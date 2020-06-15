'use strict';

angular.module('discountsDetails', ['ui.router'])
    .config(['$stateProvider', function ($stateProvider) {
        $stateProvider
            .state('discountsDetails', {
                parent: 'app',
                url: '/discounts/details/:discountId',
                template: '<discounts-details></discounts-details>'
            })
    }]);
