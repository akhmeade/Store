'use strict';

angular.module('cartsList', ['ui.router'])
    .config(['$stateProvider', function ($stateProvider) {
        $stateProvider
            .state('carts', {
                parent: 'app',
                url: '/carts',
                template: '<carts></carts>'
            })
    }]);
