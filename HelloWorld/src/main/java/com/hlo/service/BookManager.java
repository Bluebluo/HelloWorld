package com.hlo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hlo.bean.Book;
import com.hlo.bean.ClassBook;
import com.hlo.bean.ClassBookExample;
import com.hlo.dao.BookMapper;
import com.hlo.dao.ClassBookMapper;

@Service
public class BookManager {
	
	@Autowired
	BookMapper bookMapper;
	
	@Autowired
	ClassBookMapper classBookMapper;
	
	public List<Book> getTeachBook(ClassBookExample classBookExample){
		return classBookMapper.selectBook(classBookExample);
	}
	
	public Book getBook(Integer id) {
		return bookMapper.selectByPrimaryKey(id);
	}
	

}
