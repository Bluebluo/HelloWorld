package com.hlo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hlo.bean.CourseSection;
import com.hlo.bean.CourseSectionExample;
import com.hlo.dao.CourseSectionMapper;

@Service
public class SectionManager {

	@Autowired
	CourseSectionMapper courseSectionMapper;
	
	/*
	 * 按条件查询章节数据
	 */
	public List<CourseSection> getSomeSections(CourseSectionExample sectionExample){
		return courseSectionMapper.selectByExample(sectionExample);
	}
	/*
	 * 按主键查询一个章节数据
	 */
	public CourseSection getOneSection(int id) {
		return courseSectionMapper.selectByPrimaryKey(id);
	}
}
