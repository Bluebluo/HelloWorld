package com.hlo.bean;

public class CourseSection {
    private Integer id;

    private String title;

    private Integer courseId;

    private String coursePpt;

    private String courseVideo;

    private String moreData;

    private String pointAnalyze;

    private String courseOgg;

    private String niceCase;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getCoursePpt() {
        return coursePpt;
    }

    public void setCoursePpt(String coursePpt) {
        this.coursePpt = coursePpt == null ? null : coursePpt.trim();
    }

    public String getCourseVideo() {
        return courseVideo;
    }

    public void setCourseVideo(String courseVideo) {
        this.courseVideo = courseVideo == null ? null : courseVideo.trim();
    }

    public String getMoreData() {
        return moreData;
    }

    public void setMoreData(String moreData) {
        this.moreData = moreData == null ? null : moreData.trim();
    }

    public String getPointAnalyze() {
        return pointAnalyze;
    }

    public void setPointAnalyze(String pointAnalyze) {
        this.pointAnalyze = pointAnalyze == null ? null : pointAnalyze.trim();
    }

    public String getCourseOgg() {
        return courseOgg;
    }

    public void setCourseOgg(String courseOgg) {
        this.courseOgg = courseOgg == null ? null : courseOgg.trim();
    }

    public String getNiceCase() {
        return niceCase;
    }

    public void setNiceCase(String niceCase) {
        this.niceCase = niceCase == null ? null : niceCase.trim();
    }
}