package com.hlo.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hlo.bean.Teacher;
import com.hlo.dao.TeacherMapper;

@Controller
public class HelloController {
	
	@Autowired
	HttpServletRequest request;
	
	@Autowired
	HttpServletResponse response;
	
	@Autowired
	TeacherMapper teacherMapper;
	
	@RequestMapping("/hello")
	@ResponseBody
	public List<Teacher> Hello() {
		
		Map<String, String[]> map = request.getParameterMap();
		List<Teacher> teachers = teacherMapper.selectByExample(null);
		
		return teachers;
	}
}
