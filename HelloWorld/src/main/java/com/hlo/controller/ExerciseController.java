package com.hlo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hlo.bean.CourseExercise;
import com.hlo.bean.CourseExerciseExample;
import com.hlo.bean.CourseExerciseExample.Criteria;
import com.hlo.bean.Msg;
import com.hlo.service.ExerciseManager;

@Controller
public class ExerciseController {

	@Autowired
	ExerciseManager exerciseManager;
	
	
	@RequestMapping("/exercises")
	public String getExercisesBySection(
			@RequestParam(value = "section")String section,Model model) {
		CourseExerciseExample courseExerciseExample = new CourseExerciseExample();
		Criteria criteria = courseExerciseExample.createCriteria();
		criteria.andSectionIdEqualTo(Integer.parseInt(section));
		List<CourseExercise> exercises = exerciseManager.getAllExercises(courseExerciseExample);
		model.addAttribute("exercises",exercises);
		return "exercises";
	}
	
}
