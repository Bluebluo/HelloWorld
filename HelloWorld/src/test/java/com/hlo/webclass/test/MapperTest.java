package com.hlo.webclass.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hlo.bean.Course;
import com.hlo.dao.CourseMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class MapperTest {

	@Autowired
	CourseMapper courseMapper;
	
	@Autowired
	SqlSession sqlSession;
	@Test
	public void testCRUD() {
		List<Course> courses = courseMapper.selectByExample(null);
		System.out.println(courses.size());
	}
}
