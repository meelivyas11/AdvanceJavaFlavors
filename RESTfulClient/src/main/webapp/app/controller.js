angular.module('anglrApp', [] )
	.controller('anglrCtrl', ['$scope', '$http', 'anglrRepo', '$location', function ($scope, $http, anglrRepo, $location) {
	
	$scope.AddUser = function () {
		anglrRepo.add($scope.username, $scope.password)
		      .then(function(response){
		    	  $location.path('/');
		      });
	  }
	
	$scope.GetUsers = function () {
		anglrRepo.get()
		      .then(function(response){
		    	  $scope.Users = anglrRepo.Users;
		    	  $location.path('/');
		      });
	  }
	
}]);

