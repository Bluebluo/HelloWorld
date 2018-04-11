'use stict';

angulat.module('teacher')
	.controller('teacherCtrl',function($state,$scope,$http,Push,$stateParams){
		$http({
            method: 'post',
            url: "http://localhost:8080/HelloWorld/hello"
        }).then(function successCallback(response) {
        		console.log(response);
                $scope.teachers = response.data;
            }, function errorCallback(response) {
            	
        });
        $scope.toDetail = function (teacher){
        	$state.go('teacher',{teacher:teacher});
        }
        var teacher = $stateParams.teacher;
	})