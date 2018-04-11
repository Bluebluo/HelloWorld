package com.hlo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hlo.bean.Course;
import com.hlo.bean.CourseExercise;
import com.hlo.bean.CourseExerciseExample;
import com.hlo.dao.CourseExerciseMapper;

@Service
public class ExerciseManager {

	@Autowired
	CourseExerciseMapper courseExerciseMapper;
	
	/*
	 * 按条件查询练习题列表
	 */
	public List<CourseExercise> getAllExercises(CourseExerciseExample courseExerciseExample){
		return courseExerciseMapper.selectByExample(courseExerciseExample);
	}
	
	/*
	 * 按主键查询一个练习题
	 */
	public CourseExercise getOneExercise(int id) {
		return courseExerciseMapper.selectByPrimaryKey(id);
	}
	
}
