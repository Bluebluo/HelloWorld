package com.hlo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hlo.bean.Teacher;
import com.hlo.dao.TeacherMapper;
import com.hlo.webclass.bean.Article;
import com.hlo.webclass.resp.ArticleMessage;
import com.hlo.webclass.utils.WeixinCst;

@Service
public class TeacherManager {

	@Autowired
	TeacherMapper teacherMapper;
	
	@Autowired
	ArticleManager articleManager;
	
	/*
	 * 插入一条教师信息
	 */
	public void insertTeacher(Teacher teacher) {
		teacherMapper.insert(teacher);
	}

	/*
	 * 查询所有教师信息
	 */
	public List<Teacher> getAllTeachers() {
		return teacherMapper.selectByExample(null);
	}
	
	/*
	 *查询某一教师详细信息 
	 */
	public Teacher getOneTeacher(int id) {
		return teacherMapper.selectByPrimaryKey(id);
	}
	
	/*
	 * 构建教师图文消息
	 */
	public ArticleMessage buildOneTeacherMsg(Teacher teacher) {
		String title = "教师信息";
		String description = teacher.getName() + "老师：\n" +
				"职称："+teacher.getLevel() + "\n"+
				"院校："+teacher.getSchool() + "\n"+
				"教授课程"+teacher.getTeachcls() + "\n";
		String url = WeixinCst.PATH + "/teacher.jsp";
		String picUrl = teacher.getPhoto();
		Article article = articleManager.buildArticle(title, description, url, picUrl);
		List<Article> articles = new ArrayList<Article>();
		articles.add(article);
		return articleManager.buildArticleMessage(articles);
				
	}
	
	/*
	 * 构建教师图文消息
	 */
	public ArticleMessage buildTeacherMsg(Teacher... teachers) {
		List<Article> articles = new ArrayList<Article>();
		for(Teacher teacher : teachers) {
			String title = "教师信息";
			String description = teacher.getName() + "老师：\n" +
					"职称："+teacher.getLevel() + "\n"+
					"院校："+teacher.getSchool() + "\n"+
					"教授课程"+teacher.getTeachcls() + "\n";
			String url = WeixinCst.PATH + "/html/teacherDetail.html";
			String picUrl = teacher.getPhoto();
			Article article = articleManager.buildArticle(title, description, url, picUrl);
			articles.add(article);
		}
		return articleManager.buildArticleMessage(articles);
				
	}
	
}
