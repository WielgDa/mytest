var phonecatApp = angular.module('phonecatApp', []);

phonecatApp.controller('PhoneListCtrl', function ($scope) {
  $scope.phones = [
    {'name': 'Nexus S',
     'snippet': 'Fast just got faster with Nexus S.'},
    {'name': 'Motorola XOOM™ with Wi-Fi',
     'snippet': 'The Next, Next Generation tablet.'},
    {'name': 'MOTOROLA XOOM™',
     'snippet': 'The Next, Next Generation tablet.'}
  ];
});

phonecatApp.controller('Test', function($scope, $http) {
	  $http.get('./helloRest/json').
	    success(function(data, status, headers, config) {
	      $scope.posts = data;
	    }).
	    error(function(data, status, headers, config) {
	      // log error
	    });
});