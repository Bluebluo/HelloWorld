package com.hlo.bean;

import java.util.ArrayList;
import java.util.List;

public class CourseSectionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CourseSectionExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andCourseIdIsNull() {
            addCriterion("course_id is null");
            return (Criteria) this;
        }

        public Criteria andCourseIdIsNotNull() {
            addCriterion("course_id is not null");
            return (Criteria) this;
        }

        public Criteria andCourseIdEqualTo(Integer value) {
            addCriterion("course_id =", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotEqualTo(Integer value) {
            addCriterion("course_id <>", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdGreaterThan(Integer value) {
            addCriterion("course_id >", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("course_id >=", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdLessThan(Integer value) {
            addCriterion("course_id <", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdLessThanOrEqualTo(Integer value) {
            addCriterion("course_id <=", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdIn(List<Integer> values) {
            addCriterion("course_id in", values, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotIn(List<Integer> values) {
            addCriterion("course_id not in", values, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdBetween(Integer value1, Integer value2) {
            addCriterion("course_id between", value1, value2, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("course_id not between", value1, value2, "courseId");
            return (Criteria) this;
        }

        public Criteria andCoursePptIsNull() {
            addCriterion("course_ppt is null");
            return (Criteria) this;
        }

        public Criteria andCoursePptIsNotNull() {
            addCriterion("course_ppt is not null");
            return (Criteria) this;
        }

        public Criteria andCoursePptEqualTo(String value) {
            addCriterion("course_ppt =", value, "coursePpt");
            return (Criteria) this;
        }

        public Criteria andCoursePptNotEqualTo(String value) {
            addCriterion("course_ppt <>", value, "coursePpt");
            return (Criteria) this;
        }

        public Criteria andCoursePptGreaterThan(String value) {
            addCriterion("course_ppt >", value, "coursePpt");
            return (Criteria) this;
        }

        public Criteria andCoursePptGreaterThanOrEqualTo(String value) {
            addCriterion("course_ppt >=", value, "coursePpt");
            return (Criteria) this;
        }

        public Criteria andCoursePptLessThan(String value) {
            addCriterion("course_ppt <", value, "coursePpt");
            return (Criteria) this;
        }

        public Criteria andCoursePptLessThanOrEqualTo(String value) {
            addCriterion("course_ppt <=", value, "coursePpt");
            return (Criteria) this;
        }

        public Criteria andCoursePptLike(String value) {
            addCriterion("course_ppt like", value, "coursePpt");
            return (Criteria) this;
        }

        public Criteria andCoursePptNotLike(String value) {
            addCriterion("course_ppt not like", value, "coursePpt");
            return (Criteria) this;
        }

        public Criteria andCoursePptIn(List<String> values) {
            addCriterion("course_ppt in", values, "coursePpt");
            return (Criteria) this;
        }

        public Criteria andCoursePptNotIn(List<String> values) {
            addCriterion("course_ppt not in", values, "coursePpt");
            return (Criteria) this;
        }

        public Criteria andCoursePptBetween(String value1, String value2) {
            addCriterion("course_ppt between", value1, value2, "coursePpt");
            return (Criteria) this;
        }

        public Criteria andCoursePptNotBetween(String value1, String value2) {
            addCriterion("course_ppt not between", value1, value2, "coursePpt");
            return (Criteria) this;
        }

        public Criteria andCourseVideoIsNull() {
            addCriterion("course_video is null");
            return (Criteria) this;
        }

        public Criteria andCourseVideoIsNotNull() {
            addCriterion("course_video is not null");
            return (Criteria) this;
        }

        public Criteria andCourseVideoEqualTo(String value) {
            addCriterion("course_video =", value, "courseVideo");
            return (Criteria) this;
        }

        public Criteria andCourseVideoNotEqualTo(String value) {
            addCriterion("course_video <>", value, "courseVideo");
            return (Criteria) this;
        }

        public Criteria andCourseVideoGreaterThan(String value) {
            addCriterion("course_video >", value, "courseVideo");
            return (Criteria) this;
        }

        public Criteria andCourseVideoGreaterThanOrEqualTo(String value) {
            addCriterion("course_video >=", value, "courseVideo");
            return (Criteria) this;
        }

        public Criteria andCourseVideoLessThan(String value) {
            addCriterion("course_video <", value, "courseVideo");
            return (Criteria) this;
        }

        public Criteria andCourseVideoLessThanOrEqualTo(String value) {
            addCriterion("course_video <=", value, "courseVideo");
            return (Criteria) this;
        }

        public Criteria andCourseVideoLike(String value) {
            addCriterion("course_video like", value, "courseVideo");
            return (Criteria) this;
        }

        public Criteria andCourseVideoNotLike(String value) {
            addCriterion("course_video not like", value, "courseVideo");
            return (Criteria) this;
        }

        public Criteria andCourseVideoIn(List<String> values) {
            addCriterion("course_video in", values, "courseVideo");
            return (Criteria) this;
        }

        public Criteria andCourseVideoNotIn(List<String> values) {
            addCriterion("course_video not in", values, "courseVideo");
            return (Criteria) this;
        }

        public Criteria andCourseVideoBetween(String value1, String value2) {
            addCriterion("course_video between", value1, value2, "courseVideo");
            return (Criteria) this;
        }

        public Criteria andCourseVideoNotBetween(String value1, String value2) {
            addCriterion("course_video not between", value1, value2, "courseVideo");
            return (Criteria) this;
        }

        public Criteria andMoreDataIsNull() {
            addCriterion("more_data is null");
            return (Criteria) this;
        }

        public Criteria andMoreDataIsNotNull() {
            addCriterion("more_data is not null");
            return (Criteria) this;
        }

        public Criteria andMoreDataEqualTo(String value) {
            addCriterion("more_data =", value, "moreData");
            return (Criteria) this;
        }

        public Criteria andMoreDataNotEqualTo(String value) {
            addCriterion("more_data <>", value, "moreData");
            return (Criteria) this;
        }

        public Criteria andMoreDataGreaterThan(String value) {
            addCriterion("more_data >", value, "moreData");
            return (Criteria) this;
        }

        public Criteria andMoreDataGreaterThanOrEqualTo(String value) {
            addCriterion("more_data >=", value, "moreData");
            return (Criteria) this;
        }

        public Criteria andMoreDataLessThan(String value) {
            addCriterion("more_data <", value, "moreData");
            return (Criteria) this;
        }

        public Criteria andMoreDataLessThanOrEqualTo(String value) {
            addCriterion("more_data <=", value, "moreData");
            return (Criteria) this;
        }

        public Criteria andMoreDataLike(String value) {
            addCriterion("more_data like", value, "moreData");
            return (Criteria) this;
        }

        public Criteria andMoreDataNotLike(String value) {
            addCriterion("more_data not like", value, "moreData");
            return (Criteria) this;
        }

        public Criteria andMoreDataIn(List<String> values) {
            addCriterion("more_data in", values, "moreData");
            return (Criteria) this;
        }

        public Criteria andMoreDataNotIn(List<String> values) {
            addCriterion("more_data not in", values, "moreData");
            return (Criteria) this;
        }

        public Criteria andMoreDataBetween(String value1, String value2) {
            addCriterion("more_data between", value1, value2, "moreData");
            return (Criteria) this;
        }

        public Criteria andMoreDataNotBetween(String value1, String value2) {
            addCriterion("more_data not between", value1, value2, "moreData");
            return (Criteria) this;
        }

        public Criteria andPointAnalyzeIsNull() {
            addCriterion("point_analyze is null");
            return (Criteria) this;
        }

        public Criteria andPointAnalyzeIsNotNull() {
            addCriterion("point_analyze is not null");
            return (Criteria) this;
        }

        public Criteria andPointAnalyzeEqualTo(String value) {
            addCriterion("point_analyze =", value, "pointAnalyze");
            return (Criteria) this;
        }

        public Criteria andPointAnalyzeNotEqualTo(String value) {
            addCriterion("point_analyze <>", value, "pointAnalyze");
            return (Criteria) this;
        }

        public Criteria andPointAnalyzeGreaterThan(String value) {
            addCriterion("point_analyze >", value, "pointAnalyze");
            return (Criteria) this;
        }

        public Criteria andPointAnalyzeGreaterThanOrEqualTo(String value) {
            addCriterion("point_analyze >=", value, "pointAnalyze");
            return (Criteria) this;
        }

        public Criteria andPointAnalyzeLessThan(String value) {
            addCriterion("point_analyze <", value, "pointAnalyze");
            return (Criteria) this;
        }

        public Criteria andPointAnalyzeLessThanOrEqualTo(String value) {
            addCriterion("point_analyze <=", value, "pointAnalyze");
            return (Criteria) this;
        }

        public Criteria andPointAnalyzeLike(String value) {
            addCriterion("point_analyze like", value, "pointAnalyze");
            return (Criteria) this;
        }

        public Criteria andPointAnalyzeNotLike(String value) {
            addCriterion("point_analyze not like", value, "pointAnalyze");
            return (Criteria) this;
        }

        public Criteria andPointAnalyzeIn(List<String> values) {
            addCriterion("point_analyze in", values, "pointAnalyze");
            return (Criteria) this;
        }

        public Criteria andPointAnalyzeNotIn(List<String> values) {
            addCriterion("point_analyze not in", values, "pointAnalyze");
            return (Criteria) this;
        }

        public Criteria andPointAnalyzeBetween(String value1, String value2) {
            addCriterion("point_analyze between", value1, value2, "pointAnalyze");
            return (Criteria) this;
        }

        public Criteria andPointAnalyzeNotBetween(String value1, String value2) {
            addCriterion("point_analyze not between", value1, value2, "pointAnalyze");
            return (Criteria) this;
        }

        public Criteria andCourseOggIsNull() {
            addCriterion("course_ogg is null");
            return (Criteria) this;
        }

        public Criteria andCourseOggIsNotNull() {
            addCriterion("course_ogg is not null");
            return (Criteria) this;
        }

        public Criteria andCourseOggEqualTo(String value) {
            addCriterion("course_ogg =", value, "courseOgg");
            return (Criteria) this;
        }

        public Criteria andCourseOggNotEqualTo(String value) {
            addCriterion("course_ogg <>", value, "courseOgg");
            return (Criteria) this;
        }

        public Criteria andCourseOggGreaterThan(String value) {
            addCriterion("course_ogg >", value, "courseOgg");
            return (Criteria) this;
        }

        public Criteria andCourseOggGreaterThanOrEqualTo(String value) {
            addCriterion("course_ogg >=", value, "courseOgg");
            return (Criteria) this;
        }

        public Criteria andCourseOggLessThan(String value) {
            addCriterion("course_ogg <", value, "courseOgg");
            return (Criteria) this;
        }

        public Criteria andCourseOggLessThanOrEqualTo(String value) {
            addCriterion("course_ogg <=", value, "courseOgg");
            return (Criteria) this;
        }

        public Criteria andCourseOggLike(String value) {
            addCriterion("course_ogg like", value, "courseOgg");
            return (Criteria) this;
        }

        public Criteria andCourseOggNotLike(String value) {
            addCriterion("course_ogg not like", value, "courseOgg");
            return (Criteria) this;
        }

        public Criteria andCourseOggIn(List<String> values) {
            addCriterion("course_ogg in", values, "courseOgg");
            return (Criteria) this;
        }

        public Criteria andCourseOggNotIn(List<String> values) {
            addCriterion("course_ogg not in", values, "courseOgg");
            return (Criteria) this;
        }

        public Criteria andCourseOggBetween(String value1, String value2) {
            addCriterion("course_ogg between", value1, value2, "courseOgg");
            return (Criteria) this;
        }

        public Criteria andCourseOggNotBetween(String value1, String value2) {
            addCriterion("course_ogg not between", value1, value2, "courseOgg");
            return (Criteria) this;
        }

        public Criteria andNiceCaseIsNull() {
            addCriterion("nice_case is null");
            return (Criteria) this;
        }

        public Criteria andNiceCaseIsNotNull() {
            addCriterion("nice_case is not null");
            return (Criteria) this;
        }

        public Criteria andNiceCaseEqualTo(String value) {
            addCriterion("nice_case =", value, "niceCase");
            return (Criteria) this;
        }

        public Criteria andNiceCaseNotEqualTo(String value) {
            addCriterion("nice_case <>", value, "niceCase");
            return (Criteria) this;
        }

        public Criteria andNiceCaseGreaterThan(String value) {
            addCriterion("nice_case >", value, "niceCase");
            return (Criteria) this;
        }

        public Criteria andNiceCaseGreaterThanOrEqualTo(String value) {
            addCriterion("nice_case >=", value, "niceCase");
            return (Criteria) this;
        }

        public Criteria andNiceCaseLessThan(String value) {
            addCriterion("nice_case <", value, "niceCase");
            return (Criteria) this;
        }

        public Criteria andNiceCaseLessThanOrEqualTo(String value) {
            addCriterion("nice_case <=", value, "niceCase");
            return (Criteria) this;
        }

        public Criteria andNiceCaseLike(String value) {
            addCriterion("nice_case like", value, "niceCase");
            return (Criteria) this;
        }

        public Criteria andNiceCaseNotLike(String value) {
            addCriterion("nice_case not like", value, "niceCase");
            return (Criteria) this;
        }

        public Criteria andNiceCaseIn(List<String> values) {
            addCriterion("nice_case in", values, "niceCase");
            return (Criteria) this;
        }

        public Criteria andNiceCaseNotIn(List<String> values) {
            addCriterion("nice_case not in", values, "niceCase");
            return (Criteria) this;
        }

        public Criteria andNiceCaseBetween(String value1, String value2) {
            addCriterion("nice_case between", value1, value2, "niceCase");
            return (Criteria) this;
        }

        public Criteria andNiceCaseNotBetween(String value1, String value2) {
            addCriterion("nice_case not between", value1, value2, "niceCase");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}