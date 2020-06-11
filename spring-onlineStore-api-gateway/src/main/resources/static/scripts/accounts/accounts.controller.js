'use strict';

angular.module('accountsList')
    .controller('AccountListController', ['$http', function ($http) {
        var self = this;

        $http.get('api/accounts/accounts').then(function (resp) {
            self.items = resp.data;
        });
    }]);
