'use strict';
angular.module('herotale').config(function($urlRouterProvider, $stateProvider, $httpProvider) {
    $urlRouterProvider.otherwise('/main');
    //Main Primary Section
    $stateProvider.state('login', {
        url: '/login',
        templateUrl: '/views/login.html',
        controller: 'LoginCtrl as vm'
    });
    $stateProvider.state('main', {
        url: '/main',
        templateUrl: '/views/index.html',
        controller: "WriterController as vm"
    });

    //Authentication Section
    //$httpProvider.interceptors.push('authInterceptor');

});