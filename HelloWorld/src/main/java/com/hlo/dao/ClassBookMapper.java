package com.hlo.dao;

import com.hlo.bean.Book;
import com.hlo.bean.ClassBook;
import com.hlo.bean.ClassBookExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClassBookMapper {
    long countByExample(ClassBookExample example);

    int deleteByExample(ClassBookExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ClassBook record);

    int insertSelective(ClassBook record);

    List<ClassBook> selectByExample(ClassBookExample example);

    //查书
    List<Book> selectBook(ClassBookExample example);
  
    ClassBook selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ClassBook record, @Param("example") ClassBookExample example);

    int updateByExample(@Param("record") ClassBook record, @Param("example") ClassBookExample example);

    int updateByPrimaryKeySelective(ClassBook record);

    int updateByPrimaryKey(ClassBook record);
}