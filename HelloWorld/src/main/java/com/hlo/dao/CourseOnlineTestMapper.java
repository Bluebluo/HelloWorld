package com.hlo.dao;

import com.hlo.bean.CourseOnlineTest;
import com.hlo.bean.CourseOnlineTestExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CourseOnlineTestMapper {
    long countByExample(CourseOnlineTestExample example);

    int deleteByExample(CourseOnlineTestExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CourseOnlineTest record);

    int insertSelective(CourseOnlineTest record);

    List<CourseOnlineTest> selectByExample(CourseOnlineTestExample example);

    CourseOnlineTest selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CourseOnlineTest record, @Param("example") CourseOnlineTestExample example);

    int updateByExample(@Param("record") CourseOnlineTest record, @Param("example") CourseOnlineTestExample example);

    int updateByPrimaryKeySelective(CourseOnlineTest record);

    int updateByPrimaryKey(CourseOnlineTest record);

	List<CourseOnlineTest> selectTenRadioByCourseId(int courseId);

	List<CourseOnlineTest> selectFiveCheckboxByCourseId(int courseId);
}