'use strict';

angular.module('discountsList', ['ui.router'])
    .config(['$stateProvider', function ($stateProvider) {
        $stateProvider
            .state('discounts', {
                parent: 'app',
                url: '/discounts',
                template: '<discounts-main></discounts-main>'
            })
    }]);
