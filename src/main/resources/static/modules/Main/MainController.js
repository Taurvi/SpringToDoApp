'use strict';

ToDoModule = angular.module('ToDoModule');

ToDoModule.controller('MainController', ['$scope', function($scope) {
    $scope.test = "Test";
}]);