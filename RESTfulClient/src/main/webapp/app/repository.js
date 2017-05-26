angular.module('anglrApp')
	.factory('anglrRepo', ['$q', '$http', function ($q, $http) {
		
		var anglrRepo = {}; 
		anglrRepo.Users = null;
		
		anglrRepo.add = function (username, pass) {
	        var deferred = $q.defer();
	        var inputData = JSON.stringify({'userName': username, 'password': pass });
	        //console.log(inputData);
	        $http.post('http://localhost:8081/RESTful/webapi/users', inputData).then(
	            function (response) {
	                deferred.resolve({success: true, message: response.status});
	                deferred.resolve();
	            },
	            function (response) {
	                deferred.reject({success: false, message: 'An error has occurred while login : ' + response.status});
	            });
	        return deferred.promise;
	    };
    
		anglrRepo.get = function () {
	        var deferred = $q.defer();
	         $http.get('http://localhost:8081/RESTful/webapi/users').then(
	            function (response) {
	            	anglrRepo.Users = response.data;
	                deferred.resolve({success: true, message: response.status});
	                deferred.resolve();
	            },
	            function (response) {
	                deferred.reject({success: false, message: 'An error has occurred while login : ' + response.status});
	            });
	        return deferred.promise;
	    };
	    
		return anglrRepo;
}]);



