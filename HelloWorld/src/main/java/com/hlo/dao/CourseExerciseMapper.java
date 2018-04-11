package com.hlo.dao;

import com.hlo.bean.CourseExercise;
import com.hlo.bean.CourseExerciseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CourseExerciseMapper {
    long countByExample(CourseExerciseExample example);

    int deleteByExample(CourseExerciseExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CourseExercise record);

    int insertSelective(CourseExercise record);

    List<CourseExercise> selectByExample(CourseExerciseExample example);

    CourseExercise selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CourseExercise record, @Param("example") CourseExerciseExample example);

    int updateByExample(@Param("record") CourseExercise record, @Param("example") CourseExerciseExample example);

    int updateByPrimaryKeySelective(CourseExercise record);

    int updateByPrimaryKey(CourseExercise record);
    
    List<CourseExercise> selectRandomByExample(Integer sectionId);

}