'use strict';

angular.module('accountsList', ['ui.router'])
    .config(['$stateProvider', function ($stateProvider) {
        $stateProvider
            .state('accounts', {
                parent: 'app',
                url: '/accounts',
                template: '<accounts></accounts>'
            })
    }]);
