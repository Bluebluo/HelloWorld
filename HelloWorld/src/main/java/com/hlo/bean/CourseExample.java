package com.hlo.bean;

import java.util.ArrayList;
import java.util.List;

public class CourseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CourseExample() {
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andIntroduceIsNull() {
            addCriterion("introduce is null");
            return (Criteria) this;
        }

        public Criteria andIntroduceIsNotNull() {
            addCriterion("introduce is not null");
            return (Criteria) this;
        }

        public Criteria andIntroduceEqualTo(String value) {
            addCriterion("introduce =", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceNotEqualTo(String value) {
            addCriterion("introduce <>", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceGreaterThan(String value) {
            addCriterion("introduce >", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceGreaterThanOrEqualTo(String value) {
            addCriterion("introduce >=", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceLessThan(String value) {
            addCriterion("introduce <", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceLessThanOrEqualTo(String value) {
            addCriterion("introduce <=", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceLike(String value) {
            addCriterion("introduce like", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceNotLike(String value) {
            addCriterion("introduce not like", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceIn(List<String> values) {
            addCriterion("introduce in", values, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceNotIn(List<String> values) {
            addCriterion("introduce not in", values, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceBetween(String value1, String value2) {
            addCriterion("introduce between", value1, value2, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceNotBetween(String value1, String value2) {
            addCriterion("introduce not between", value1, value2, "introduce");
            return (Criteria) this;
        }

        public Criteria andOutLineIsNull() {
            addCriterion("out_line is null");
            return (Criteria) this;
        }

        public Criteria andOutLineIsNotNull() {
            addCriterion("out_line is not null");
            return (Criteria) this;
        }

        public Criteria andOutLineEqualTo(String value) {
            addCriterion("out_line =", value, "outLine");
            return (Criteria) this;
        }

        public Criteria andOutLineNotEqualTo(String value) {
            addCriterion("out_line <>", value, "outLine");
            return (Criteria) this;
        }

        public Criteria andOutLineGreaterThan(String value) {
            addCriterion("out_line >", value, "outLine");
            return (Criteria) this;
        }

        public Criteria andOutLineGreaterThanOrEqualTo(String value) {
            addCriterion("out_line >=", value, "outLine");
            return (Criteria) this;
        }

        public Criteria andOutLineLessThan(String value) {
            addCriterion("out_line <", value, "outLine");
            return (Criteria) this;
        }

        public Criteria andOutLineLessThanOrEqualTo(String value) {
            addCriterion("out_line <=", value, "outLine");
            return (Criteria) this;
        }

        public Criteria andOutLineLike(String value) {
            addCriterion("out_line like", value, "outLine");
            return (Criteria) this;
        }

        public Criteria andOutLineNotLike(String value) {
            addCriterion("out_line not like", value, "outLine");
            return (Criteria) this;
        }

        public Criteria andOutLineIn(List<String> values) {
            addCriterion("out_line in", values, "outLine");
            return (Criteria) this;
        }

        public Criteria andOutLineNotIn(List<String> values) {
            addCriterion("out_line not in", values, "outLine");
            return (Criteria) this;
        }

        public Criteria andOutLineBetween(String value1, String value2) {
            addCriterion("out_line between", value1, value2, "outLine");
            return (Criteria) this;
        }

        public Criteria andOutLineNotBetween(String value1, String value2) {
            addCriterion("out_line not between", value1, value2, "outLine");
            return (Criteria) this;
        }

        public Criteria andTestOutLineIsNull() {
            addCriterion("test_out_line is null");
            return (Criteria) this;
        }

        public Criteria andTestOutLineIsNotNull() {
            addCriterion("test_out_line is not null");
            return (Criteria) this;
        }

        public Criteria andTestOutLineEqualTo(String value) {
            addCriterion("test_out_line =", value, "testOutLine");
            return (Criteria) this;
        }

        public Criteria andTestOutLineNotEqualTo(String value) {
            addCriterion("test_out_line <>", value, "testOutLine");
            return (Criteria) this;
        }

        public Criteria andTestOutLineGreaterThan(String value) {
            addCriterion("test_out_line >", value, "testOutLine");
            return (Criteria) this;
        }

        public Criteria andTestOutLineGreaterThanOrEqualTo(String value) {
            addCriterion("test_out_line >=", value, "testOutLine");
            return (Criteria) this;
        }

        public Criteria andTestOutLineLessThan(String value) {
            addCriterion("test_out_line <", value, "testOutLine");
            return (Criteria) this;
        }

        public Criteria andTestOutLineLessThanOrEqualTo(String value) {
            addCriterion("test_out_line <=", value, "testOutLine");
            return (Criteria) this;
        }

        public Criteria andTestOutLineLike(String value) {
            addCriterion("test_out_line like", value, "testOutLine");
            return (Criteria) this;
        }

        public Criteria andTestOutLineNotLike(String value) {
            addCriterion("test_out_line not like", value, "testOutLine");
            return (Criteria) this;
        }

        public Criteria andTestOutLineIn(List<String> values) {
            addCriterion("test_out_line in", values, "testOutLine");
            return (Criteria) this;
        }

        public Criteria andTestOutLineNotIn(List<String> values) {
            addCriterion("test_out_line not in", values, "testOutLine");
            return (Criteria) this;
        }

        public Criteria andTestOutLineBetween(String value1, String value2) {
            addCriterion("test_out_line between", value1, value2, "testOutLine");
            return (Criteria) this;
        }

        public Criteria andTestOutLineNotBetween(String value1, String value2) {
            addCriterion("test_out_line not between", value1, value2, "testOutLine");
            return (Criteria) this;
        }

        public Criteria andTestGuideBookIsNull() {
            addCriterion("test_guide_book is null");
            return (Criteria) this;
        }

        public Criteria andTestGuideBookIsNotNull() {
            addCriterion("test_guide_book is not null");
            return (Criteria) this;
        }

        public Criteria andTestGuideBookEqualTo(String value) {
            addCriterion("test_guide_book =", value, "testGuideBook");
            return (Criteria) this;
        }

        public Criteria andTestGuideBookNotEqualTo(String value) {
            addCriterion("test_guide_book <>", value, "testGuideBook");
            return (Criteria) this;
        }

        public Criteria andTestGuideBookGreaterThan(String value) {
            addCriterion("test_guide_book >", value, "testGuideBook");
            return (Criteria) this;
        }

        public Criteria andTestGuideBookGreaterThanOrEqualTo(String value) {
            addCriterion("test_guide_book >=", value, "testGuideBook");
            return (Criteria) this;
        }

        public Criteria andTestGuideBookLessThan(String value) {
            addCriterion("test_guide_book <", value, "testGuideBook");
            return (Criteria) this;
        }

        public Criteria andTestGuideBookLessThanOrEqualTo(String value) {
            addCriterion("test_guide_book <=", value, "testGuideBook");
            return (Criteria) this;
        }

        public Criteria andTestGuideBookLike(String value) {
            addCriterion("test_guide_book like", value, "testGuideBook");
            return (Criteria) this;
        }

        public Criteria andTestGuideBookNotLike(String value) {
            addCriterion("test_guide_book not like", value, "testGuideBook");
            return (Criteria) this;
        }

        public Criteria andTestGuideBookIn(List<String> values) {
            addCriterion("test_guide_book in", values, "testGuideBook");
            return (Criteria) this;
        }

        public Criteria andTestGuideBookNotIn(List<String> values) {
            addCriterion("test_guide_book not in", values, "testGuideBook");
            return (Criteria) this;
        }

        public Criteria andTestGuideBookBetween(String value1, String value2) {
            addCriterion("test_guide_book between", value1, value2, "testGuideBook");
            return (Criteria) this;
        }

        public Criteria andTestGuideBookNotBetween(String value1, String value2) {
            addCriterion("test_guide_book not between", value1, value2, "testGuideBook");
            return (Criteria) this;
        }

        public Criteria andTeachBookIsNull() {
            addCriterion("teach_book is null");
            return (Criteria) this;
        }

        public Criteria andTeachBookIsNotNull() {
            addCriterion("teach_book is not null");
            return (Criteria) this;
        }

        public Criteria andTeachBookEqualTo(String value) {
            addCriterion("teach_book =", value, "teachBook");
            return (Criteria) this;
        }

        public Criteria andTeachBookNotEqualTo(String value) {
            addCriterion("teach_book <>", value, "teachBook");
            return (Criteria) this;
        }

        public Criteria andTeachBookGreaterThan(String value) {
            addCriterion("teach_book >", value, "teachBook");
            return (Criteria) this;
        }

        public Criteria andTeachBookGreaterThanOrEqualTo(String value) {
            addCriterion("teach_book >=", value, "teachBook");
            return (Criteria) this;
        }

        public Criteria andTeachBookLessThan(String value) {
            addCriterion("teach_book <", value, "teachBook");
            return (Criteria) this;
        }

        public Criteria andTeachBookLessThanOrEqualTo(String value) {
            addCriterion("teach_book <=", value, "teachBook");
            return (Criteria) this;
        }

        public Criteria andTeachBookLike(String value) {
            addCriterion("teach_book like", value, "teachBook");
            return (Criteria) this;
        }

        public Criteria andTeachBookNotLike(String value) {
            addCriterion("teach_book not like", value, "teachBook");
            return (Criteria) this;
        }

        public Criteria andTeachBookIn(List<String> values) {
            addCriterion("teach_book in", values, "teachBook");
            return (Criteria) this;
        }

        public Criteria andTeachBookNotIn(List<String> values) {
            addCriterion("teach_book not in", values, "teachBook");
            return (Criteria) this;
        }

        public Criteria andTeachBookBetween(String value1, String value2) {
            addCriterion("teach_book between", value1, value2, "teachBook");
            return (Criteria) this;
        }

        public Criteria andTeachBookNotBetween(String value1, String value2) {
            addCriterion("teach_book not between", value1, value2, "teachBook");
            return (Criteria) this;
        }

        public Criteria andTeachGuideBookIsNull() {
            addCriterion("teach_guide_book is null");
            return (Criteria) this;
        }

        public Criteria andTeachGuideBookIsNotNull() {
            addCriterion("teach_guide_book is not null");
            return (Criteria) this;
        }

        public Criteria andTeachGuideBookEqualTo(String value) {
            addCriterion("teach_guide_book =", value, "teachGuideBook");
            return (Criteria) this;
        }

        public Criteria andTeachGuideBookNotEqualTo(String value) {
            addCriterion("teach_guide_book <>", value, "teachGuideBook");
            return (Criteria) this;
        }

        public Criteria andTeachGuideBookGreaterThan(String value) {
            addCriterion("teach_guide_book >", value, "teachGuideBook");
            return (Criteria) this;
        }

        public Criteria andTeachGuideBookGreaterThanOrEqualTo(String value) {
            addCriterion("teach_guide_book >=", value, "teachGuideBook");
            return (Criteria) this;
        }

        public Criteria andTeachGuideBookLessThan(String value) {
            addCriterion("teach_guide_book <", value, "teachGuideBook");
            return (Criteria) this;
        }

        public Criteria andTeachGuideBookLessThanOrEqualTo(String value) {
            addCriterion("teach_guide_book <=", value, "teachGuideBook");
            return (Criteria) this;
        }

        public Criteria andTeachGuideBookLike(String value) {
            addCriterion("teach_guide_book like", value, "teachGuideBook");
            return (Criteria) this;
        }

        public Criteria andTeachGuideBookNotLike(String value) {
            addCriterion("teach_guide_book not like", value, "teachGuideBook");
            return (Criteria) this;
        }

        public Criteria andTeachGuideBookIn(List<String> values) {
            addCriterion("teach_guide_book in", values, "teachGuideBook");
            return (Criteria) this;
        }

        public Criteria andTeachGuideBookNotIn(List<String> values) {
            addCriterion("teach_guide_book not in", values, "teachGuideBook");
            return (Criteria) this;
        }

        public Criteria andTeachGuideBookBetween(String value1, String value2) {
            addCriterion("teach_guide_book between", value1, value2, "teachGuideBook");
            return (Criteria) this;
        }

        public Criteria andTeachGuideBookNotBetween(String value1, String value2) {
            addCriterion("teach_guide_book not between", value1, value2, "teachGuideBook");
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