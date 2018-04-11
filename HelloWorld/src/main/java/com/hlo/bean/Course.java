package com.hlo.bean;

public class Course {
    private Integer id;

    private String name;

    private String introduce;

    private String outLine;

    private String testOutLine;

    private String testGuideBook;

    private String teachBook;

    private String teachGuideBook;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce == null ? null : introduce.trim();
    }

    public String getOutLine() {
        return outLine;
    }

    public void setOutLine(String outLine) {
        this.outLine = outLine == null ? null : outLine.trim();
    }

    public String getTestOutLine() {
        return testOutLine;
    }

    public void setTestOutLine(String testOutLine) {
        this.testOutLine = testOutLine == null ? null : testOutLine.trim();
    }

    public String getTestGuideBook() {
        return testGuideBook;
    }

    public void setTestGuideBook(String testGuideBook) {
        this.testGuideBook = testGuideBook == null ? null : testGuideBook.trim();
    }

    public String getTeachBook() {
        return teachBook;
    }

    public void setTeachBook(String teachBook) {
        this.teachBook = teachBook == null ? null : teachBook.trim();
    }

    public String getTeachGuideBook() {
        return teachGuideBook;
    }

    public void setTeachGuideBook(String teachGuideBook) {
        this.teachGuideBook = teachGuideBook == null ? null : teachGuideBook.trim();
    }
}