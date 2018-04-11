'use strict';
angular.module('teacher').config(function($stateProvider){
	$stateProvider
		.state('teacher',{
				url:'/teacher/:teacher',
				templateUrl:'/html/teacherDetail.html',
				controller:'teacherCtrl'
		});
});