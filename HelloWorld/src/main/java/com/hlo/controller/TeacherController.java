package com.hlo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hlo.bean.Msg;
import com.hlo.bean.Teacher;
import com.hlo.service.TeacherManager;

@Controller
public class TeacherController {

	@Autowired
	TeacherManager teacherManager;
	
	@ResponseBody
	@RequestMapping("/getAllTeachers")
	public Msg getAllTeachers() {
		List<Teacher> teachers = teacherManager.getAllTeachers();
		if(teachers!=null && teachers.size()>0) {
			return Msg.success().add("teachers", teachers);
		}else {
			return Msg.fail();
		}
	}
	
	@RequestMapping(value="/teacher/{id}",method=RequestMethod.GET)
	public String getBook(@PathVariable()Integer id,Model model) {
		Teacher teacher = teacherManager.getOneTeacher(id);
		model.addAttribute("teacher",teacher);
		return "teacher";
	}
	
	
}
