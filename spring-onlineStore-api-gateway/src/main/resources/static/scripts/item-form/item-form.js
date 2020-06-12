'use strict';

angular.module('itemForm', ['ui.router'])
    .config(['$stateProvider', function ($stateProvider) {
        $stateProvider
            .state('petNew', {
                parent: 'app',
                url: '/items/:itemId/new-pet',
                template: '<pet-form></pet-form>'
            })
            .state('itemEdit', {
                parent: 'app',
                url: '/items/:itemId/edit',
                template: '<item-form></item-form>'
            })
    }]);
