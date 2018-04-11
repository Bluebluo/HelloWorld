package com.hlo.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hlo.bean.CourseOnlineTest;
import com.hlo.bean.CourseOnlineTestExample;
import com.hlo.dao.CourseOnlineTestMapper;

@Service
public class OnlineTestManager {

	@Autowired
	CourseOnlineTestMapper courseOnlineTestMapper;
	
	/*
	 * 按条件查询一组在线测试题
	 */
	public List<CourseOnlineTest> getSomeTests(CourseOnlineTestExample courseOnlineTestExample){
		return courseOnlineTestMapper.selectByExample(courseOnlineTestExample);
	}
	
	/*
	 * 根据主键查询一道在线测试题
	 */
	public CourseOnlineTest getOneTest(int id) {
		return courseOnlineTestMapper.selectByPrimaryKey(id);
	}
	/*
	 * 根据课程ID随机查10条单选题和5条多选题
	 */
	public Map<String, Object> getOnlineTests(int courseId){
		Map<String, Object> map = new HashMap<String, Object>();
		List<CourseOnlineTest> radioTests = new ArrayList<CourseOnlineTest>();
		List<CourseOnlineTest> checkboxTest = new ArrayList<CourseOnlineTest>();
		radioTests = courseOnlineTestMapper.selectTenRadioByCourseId(courseId);
		checkboxTest = courseOnlineTestMapper.selectFiveCheckboxByCourseId(courseId);
		map.put("radio", radioTests);
		map.put("checkbox",checkboxTest);
		return map;
	}
}
