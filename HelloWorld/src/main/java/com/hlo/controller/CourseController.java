package com.hlo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hlo.bean.Book;
import com.hlo.bean.ClassBookExample;
import com.hlo.bean.ClassBookExample.Criteria;
import com.hlo.bean.Course;
import com.hlo.bean.Msg;
import com.hlo.bean.CourseOnlineTest;
import com.hlo.service.BookManager;
import com.hlo.service.CourseManager;
import com.hlo.service.OnlineTestManager;

@Controller
public class CourseController {

	@Autowired
	CourseManager courseManager;
	
	@Autowired
	OnlineTestManager onlineTestManager;
	
	@Autowired
	BookManager bookManager;
	
	@RequestMapping("/introduce")
	@ResponseBody
	public Msg getTeacherDetail() {
		Course course = new Course();
		course = courseManager.getOneCourse(1);
		return Msg.success().add("introduce", course);
	}
	
	@RequestMapping("/book")
	public String getCourseBook(@RequestParam(value="class")Integer classId,Model model) {
		ClassBookExample example = new ClassBookExample();
		Criteria criteria = example.createCriteria();
		criteria.andTypeEqualTo(1);
		criteria.andClassIdEqualTo(classId);
		List<Book> teachBooks = bookManager.getTeachBook(example);
		ClassBookExample example1 = new ClassBookExample();
		Criteria criteria1 = example1.createCriteria();
		criteria1.andTypeEqualTo(2);
		criteria1.andClassIdEqualTo(classId);
		List<Book> guideBooks = bookManager.getTeachBook(example1);
		model.addAttribute("teachBooks",teachBooks);
		model.addAttribute("guideBooks",guideBooks);
		//return Msg.success().add("introduce", books);
		return "teachBook";
	}
	
	@RequestMapping(value="/book/{id}",method=RequestMethod.GET)
	public String getBook(@PathVariable()Integer id,Model model) {
		Book book = this.bookManager.getBook(id);
		model.addAttribute("book",book);
		return "book";
	}
	
	
	@RequestMapping("/insert")
	public void insertOne() {
		Course course = new Course();
		course.setName("《WEB应用开发》");
		course.setIntroduce("《Web应用开发》是计算机科学与技术专业的一门专业必修课。"
				+ "本课程以理论和实际应用相结合，使学生通过本课程的学习，熟悉Web技术的各种基本概念、体系结构和主要组成，并达到一定的应用水平。"
				+ "掌握一种主流的Web集成技术，熟悉其配置和应用环境，能与传统程序设计和数据库开发技术相结合，"
				+ "并能根据实际问题，能独立设计、开发、调试完成一个Web应用。");
		course.setOutLine("http://fiq3j7.natappfree.cc/data/outline.doc");
		course.setTeachBook("《WEB应用开发》");
		course.setTeachGuideBook("《JAVA编程基础》");
		course.setTestGuideBook("《WEB开发实战》");
		course.setTestOutLine("http://fiq3j7.natappfree.cc/data/test_outline.doc");
		courseManager.insertCourse(course);
	}
	
	@SuppressWarnings("unchecked")
	@RequestMapping("/onlineTest")
	public String onLineTest(
		@RequestParam(value = "course")Integer courseId,Model model) {
		Map<String, Object> resultMap = onlineTestManager.getOnlineTests(courseId);
		List<CourseOnlineTest> radioTests = 
				(List<CourseOnlineTest>) resultMap.get("radio");
		
		List<CourseOnlineTest> checkboxTests= 
				(List<CourseOnlineTest>) resultMap.get("checkbox");
		model.addAttribute("radio",radioTests);
		model.addAttribute("checkbox",checkboxTests);
		return "onlineTests";
	}
	
	
}
