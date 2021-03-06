package com.hlo.dao;

import com.hlo.bean.CourseSection;
import com.hlo.bean.CourseSectionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CourseSectionMapper {
    long countByExample(CourseSectionExample example);

    int deleteByExample(CourseSectionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CourseSection record);

    int insertSelective(CourseSection record);

    List<CourseSection> selectByExample(CourseSectionExample example);

    CourseSection selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CourseSection record, @Param("example") CourseSectionExample example);

    int updateByExample(@Param("record") CourseSection record, @Param("example") CourseSectionExample example);

    int updateByPrimaryKeySelective(CourseSection record);

    int updateByPrimaryKey(CourseSection record);
}