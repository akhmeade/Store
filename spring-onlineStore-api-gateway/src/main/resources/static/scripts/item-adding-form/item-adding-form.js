'use strict';

angular.module('itemAddForm', ['ui.router'])
    .config(['$stateProvider', function ($stateProvider) {
        $stateProvider
            .state('itemAdd', {
                parent: 'app',
                url: '/items/add',
                template: '<item-adding-form></item-adding-form>'
            })
    }]);
