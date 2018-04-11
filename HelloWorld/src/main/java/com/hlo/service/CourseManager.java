package com.hlo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hlo.bean.Course;
import com.hlo.bean.CourseExample;
import com.hlo.dao.CourseMapper;
import com.hlo.webclass.bean.Article;
import com.hlo.webclass.resp.ArticleMessage;
import com.hlo.webclass.utils.WeixinCst;

@Service
public class CourseManager {

	@Autowired
	CourseMapper courseMapper;
	
	@Autowired
	ArticleManager articleManager;
	
	public Course getOneCourse(int id) {
		return courseMapper.selectByPrimaryKey(id);
	}
	
	public List<Course> getAllCourse(CourseExample courseExample){
		return courseMapper.selectByExample(courseExample);
	}
	
	public void insertCourse(Course course) {
		System.out.println(courseMapper);
		courseMapper.insert(course);
	}

	public ArticleMessage buildInroduce(Course course) {
		String title = course.getName() + "课程简介及大纲";
		String description = "课程简介：+\n"+course.getIntroduce() + "\n大纲：\n"+course.getOutLine();
		String url = WeixinCst.PATH+"/introduce.jsp";
		String picUrl = "";
		Article article = articleManager.buildArticle(title, description, url, picUrl);
		List<Article> articles = new ArrayList<Article>();
		articles.add(article);
		return articleManager.buildArticleMessage(articles);
	}

	public ArticleMessage buildOutline(Course course) {
		String title = course.getName() + "实验大纲与指导书";
		String description = "试验大纲：\n"+course.getOutLine() + "\n指导书：\n"+course.getTestGuideBook();
		String url = WeixinCst.PATH+"/course.jsp";
		String picUrl = "";
		Article article = articleManager.buildArticle(title, description, url, picUrl);
		List<Article> articles = new ArrayList<Article>();
		articles.add(article);
		return articleManager.buildArticleMessage(articles);
	}
	
}
