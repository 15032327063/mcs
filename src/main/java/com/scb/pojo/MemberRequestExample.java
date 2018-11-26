package com.scb.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MemberRequestExample {
    /**
     * member_request
     */
    protected String orderByClause;

    /**
     * member_request
     */
    protected boolean distinct;

    /**
     * member_request
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbg.generated 2018-11-25
     */
    public MemberRequestExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *
     * @mbg.generated 2018-11-25
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *
     * @mbg.generated 2018-11-25
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *
     * @mbg.generated 2018-11-25
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *
     * @mbg.generated 2018-11-25
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *
     * @mbg.generated 2018-11-25
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     *
     * @mbg.generated 2018-11-25
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     *
     * @mbg.generated 2018-11-25
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *
     * @mbg.generated 2018-11-25
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     *
     * @mbg.generated 2018-11-25
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *
     * @mbg.generated 2018-11-25
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * member_request 2018-11-25
     */
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

        public Criteria andMemberRequestIdIsNull() {
            addCriterion("member_request_id is null");
            return (Criteria) this;
        }

        public Criteria andMemberRequestIdIsNotNull() {
            addCriterion("member_request_id is not null");
            return (Criteria) this;
        }

        public Criteria andMemberRequestIdEqualTo(String value) {
            addCriterion("member_request_id =", value, "memberRequestId");
            return (Criteria) this;
        }

        public Criteria andMemberRequestIdNotEqualTo(String value) {
            addCriterion("member_request_id <>", value, "memberRequestId");
            return (Criteria) this;
        }

        public Criteria andMemberRequestIdGreaterThan(String value) {
            addCriterion("member_request_id >", value, "memberRequestId");
            return (Criteria) this;
        }

        public Criteria andMemberRequestIdGreaterThanOrEqualTo(String value) {
            addCriterion("member_request_id >=", value, "memberRequestId");
            return (Criteria) this;
        }

        public Criteria andMemberRequestIdLessThan(String value) {
            addCriterion("member_request_id <", value, "memberRequestId");
            return (Criteria) this;
        }

        public Criteria andMemberRequestIdLessThanOrEqualTo(String value) {
            addCriterion("member_request_id <=", value, "memberRequestId");
            return (Criteria) this;
        }

        public Criteria andMemberRequestIdLike(String value) {
            addCriterion("member_request_id like", value, "memberRequestId");
            return (Criteria) this;
        }

        public Criteria andMemberRequestIdNotLike(String value) {
            addCriterion("member_request_id not like", value, "memberRequestId");
            return (Criteria) this;
        }

        public Criteria andMemberRequestIdIn(List<String> values) {
            addCriterion("member_request_id in", values, "memberRequestId");
            return (Criteria) this;
        }

        public Criteria andMemberRequestIdNotIn(List<String> values) {
            addCriterion("member_request_id not in", values, "memberRequestId");
            return (Criteria) this;
        }

        public Criteria andMemberRequestIdBetween(String value1, String value2) {
            addCriterion("member_request_id between", value1, value2, "memberRequestId");
            return (Criteria) this;
        }

        public Criteria andMemberRequestIdNotBetween(String value1, String value2) {
            addCriterion("member_request_id not between", value1, value2, "memberRequestId");
            return (Criteria) this;
        }

        public Criteria andMemberRequestTimeIsNull() {
            addCriterion("member_request_time is null");
            return (Criteria) this;
        }

        public Criteria andMemberRequestTimeIsNotNull() {
            addCriterion("member_request_time is not null");
            return (Criteria) this;
        }

        public Criteria andMemberRequestTimeEqualTo(Date value) {
            addCriterion("member_request_time =", value, "memberRequestTime");
            return (Criteria) this;
        }

        public Criteria andMemberRequestTimeNotEqualTo(Date value) {
            addCriterion("member_request_time <>", value, "memberRequestTime");
            return (Criteria) this;
        }

        public Criteria andMemberRequestTimeGreaterThan(Date value) {
            addCriterion("member_request_time >", value, "memberRequestTime");
            return (Criteria) this;
        }

        public Criteria andMemberRequestTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("member_request_time >=", value, "memberRequestTime");
            return (Criteria) this;
        }

        public Criteria andMemberRequestTimeLessThan(Date value) {
            addCriterion("member_request_time <", value, "memberRequestTime");
            return (Criteria) this;
        }

        public Criteria andMemberRequestTimeLessThanOrEqualTo(Date value) {
            addCriterion("member_request_time <=", value, "memberRequestTime");
            return (Criteria) this;
        }

        public Criteria andMemberRequestTimeIn(List<Date> values) {
            addCriterion("member_request_time in", values, "memberRequestTime");
            return (Criteria) this;
        }

        public Criteria andMemberRequestTimeNotIn(List<Date> values) {
            addCriterion("member_request_time not in", values, "memberRequestTime");
            return (Criteria) this;
        }

        public Criteria andMemberRequestTimeBetween(Date value1, Date value2) {
            addCriterion("member_request_time between", value1, value2, "memberRequestTime");
            return (Criteria) this;
        }

        public Criteria andMemberRequestTimeNotBetween(Date value1, Date value2) {
            addCriterion("member_request_time not between", value1, value2, "memberRequestTime");
            return (Criteria) this;
        }

        public Criteria andMemberRequestNumIsNull() {
            addCriterion("member_request_num is null");
            return (Criteria) this;
        }

        public Criteria andMemberRequestNumIsNotNull() {
            addCriterion("member_request_num is not null");
            return (Criteria) this;
        }

        public Criteria andMemberRequestNumEqualTo(Integer value) {
            addCriterion("member_request_num =", value, "memberRequestNum");
            return (Criteria) this;
        }

        public Criteria andMemberRequestNumNotEqualTo(Integer value) {
            addCriterion("member_request_num <>", value, "memberRequestNum");
            return (Criteria) this;
        }

        public Criteria andMemberRequestNumGreaterThan(Integer value) {
            addCriterion("member_request_num >", value, "memberRequestNum");
            return (Criteria) this;
        }

        public Criteria andMemberRequestNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("member_request_num >=", value, "memberRequestNum");
            return (Criteria) this;
        }

        public Criteria andMemberRequestNumLessThan(Integer value) {
            addCriterion("member_request_num <", value, "memberRequestNum");
            return (Criteria) this;
        }

        public Criteria andMemberRequestNumLessThanOrEqualTo(Integer value) {
            addCriterion("member_request_num <=", value, "memberRequestNum");
            return (Criteria) this;
        }

        public Criteria andMemberRequestNumIn(List<Integer> values) {
            addCriterion("member_request_num in", values, "memberRequestNum");
            return (Criteria) this;
        }

        public Criteria andMemberRequestNumNotIn(List<Integer> values) {
            addCriterion("member_request_num not in", values, "memberRequestNum");
            return (Criteria) this;
        }

        public Criteria andMemberRequestNumBetween(Integer value1, Integer value2) {
            addCriterion("member_request_num between", value1, value2, "memberRequestNum");
            return (Criteria) this;
        }

        public Criteria andMemberRequestNumNotBetween(Integer value1, Integer value2) {
            addCriterion("member_request_num not between", value1, value2, "memberRequestNum");
            return (Criteria) this;
        }

        public Criteria andMemberRequestStartIsNull() {
            addCriterion("member_request_start is null");
            return (Criteria) this;
        }

        public Criteria andMemberRequestStartIsNotNull() {
            addCriterion("member_request_start is not null");
            return (Criteria) this;
        }

        public Criteria andMemberRequestStartEqualTo(Date value) {
            addCriterion("member_request_start =", value, "memberRequestStart");
            return (Criteria) this;
        }

        public Criteria andMemberRequestStartNotEqualTo(Date value) {
            addCriterion("member_request_start <>", value, "memberRequestStart");
            return (Criteria) this;
        }

        public Criteria andMemberRequestStartGreaterThan(Date value) {
            addCriterion("member_request_start >", value, "memberRequestStart");
            return (Criteria) this;
        }

        public Criteria andMemberRequestStartGreaterThanOrEqualTo(Date value) {
            addCriterion("member_request_start >=", value, "memberRequestStart");
            return (Criteria) this;
        }

        public Criteria andMemberRequestStartLessThan(Date value) {
            addCriterion("member_request_start <", value, "memberRequestStart");
            return (Criteria) this;
        }

        public Criteria andMemberRequestStartLessThanOrEqualTo(Date value) {
            addCriterion("member_request_start <=", value, "memberRequestStart");
            return (Criteria) this;
        }

        public Criteria andMemberRequestStartIn(List<Date> values) {
            addCriterion("member_request_start in", values, "memberRequestStart");
            return (Criteria) this;
        }

        public Criteria andMemberRequestStartNotIn(List<Date> values) {
            addCriterion("member_request_start not in", values, "memberRequestStart");
            return (Criteria) this;
        }

        public Criteria andMemberRequestStartBetween(Date value1, Date value2) {
            addCriterion("member_request_start between", value1, value2, "memberRequestStart");
            return (Criteria) this;
        }

        public Criteria andMemberRequestStartNotBetween(Date value1, Date value2) {
            addCriterion("member_request_start not between", value1, value2, "memberRequestStart");
            return (Criteria) this;
        }

        public Criteria andMemberRequestEndIsNull() {
            addCriterion("member_request_end is null");
            return (Criteria) this;
        }

        public Criteria andMemberRequestEndIsNotNull() {
            addCriterion("member_request_end is not null");
            return (Criteria) this;
        }

        public Criteria andMemberRequestEndEqualTo(Date value) {
            addCriterion("member_request_end =", value, "memberRequestEnd");
            return (Criteria) this;
        }

        public Criteria andMemberRequestEndNotEqualTo(Date value) {
            addCriterion("member_request_end <>", value, "memberRequestEnd");
            return (Criteria) this;
        }

        public Criteria andMemberRequestEndGreaterThan(Date value) {
            addCriterion("member_request_end >", value, "memberRequestEnd");
            return (Criteria) this;
        }

        public Criteria andMemberRequestEndGreaterThanOrEqualTo(Date value) {
            addCriterion("member_request_end >=", value, "memberRequestEnd");
            return (Criteria) this;
        }

        public Criteria andMemberRequestEndLessThan(Date value) {
            addCriterion("member_request_end <", value, "memberRequestEnd");
            return (Criteria) this;
        }

        public Criteria andMemberRequestEndLessThanOrEqualTo(Date value) {
            addCriterion("member_request_end <=", value, "memberRequestEnd");
            return (Criteria) this;
        }

        public Criteria andMemberRequestEndIn(List<Date> values) {
            addCriterion("member_request_end in", values, "memberRequestEnd");
            return (Criteria) this;
        }

        public Criteria andMemberRequestEndNotIn(List<Date> values) {
            addCriterion("member_request_end not in", values, "memberRequestEnd");
            return (Criteria) this;
        }

        public Criteria andMemberRequestEndBetween(Date value1, Date value2) {
            addCriterion("member_request_end between", value1, value2, "memberRequestEnd");
            return (Criteria) this;
        }

        public Criteria andMemberRequestEndNotBetween(Date value1, Date value2) {
            addCriterion("member_request_end not between", value1, value2, "memberRequestEnd");
            return (Criteria) this;
        }

        public Criteria andMemberRequestStatusIsNull() {
            addCriterion("member_request_status is null");
            return (Criteria) this;
        }

        public Criteria andMemberRequestStatusIsNotNull() {
            addCriterion("member_request_status is not null");
            return (Criteria) this;
        }

        public Criteria andMemberRequestStatusEqualTo(String value) {
            addCriterion("member_request_status =", value, "memberRequestStatus");
            return (Criteria) this;
        }

        public Criteria andMemberRequestStatusNotEqualTo(String value) {
            addCriterion("member_request_status <>", value, "memberRequestStatus");
            return (Criteria) this;
        }

        public Criteria andMemberRequestStatusGreaterThan(String value) {
            addCriterion("member_request_status >", value, "memberRequestStatus");
            return (Criteria) this;
        }

        public Criteria andMemberRequestStatusGreaterThanOrEqualTo(String value) {
            addCriterion("member_request_status >=", value, "memberRequestStatus");
            return (Criteria) this;
        }

        public Criteria andMemberRequestStatusLessThan(String value) {
            addCriterion("member_request_status <", value, "memberRequestStatus");
            return (Criteria) this;
        }

        public Criteria andMemberRequestStatusLessThanOrEqualTo(String value) {
            addCriterion("member_request_status <=", value, "memberRequestStatus");
            return (Criteria) this;
        }

        public Criteria andMemberRequestStatusLike(String value) {
            addCriterion("member_request_status like", value, "memberRequestStatus");
            return (Criteria) this;
        }

        public Criteria andMemberRequestStatusNotLike(String value) {
            addCriterion("member_request_status not like", value, "memberRequestStatus");
            return (Criteria) this;
        }

        public Criteria andMemberRequestStatusIn(List<String> values) {
            addCriterion("member_request_status in", values, "memberRequestStatus");
            return (Criteria) this;
        }

        public Criteria andMemberRequestStatusNotIn(List<String> values) {
            addCriterion("member_request_status not in", values, "memberRequestStatus");
            return (Criteria) this;
        }

        public Criteria andMemberRequestStatusBetween(String value1, String value2) {
            addCriterion("member_request_status between", value1, value2, "memberRequestStatus");
            return (Criteria) this;
        }

        public Criteria andMemberRequestStatusNotBetween(String value1, String value2) {
            addCriterion("member_request_status not between", value1, value2, "memberRequestStatus");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdIsNull() {
            addCriterion("employee_id is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdIsNotNull() {
            addCriterion("employee_id is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdEqualTo(String value) {
            addCriterion("employee_id =", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotEqualTo(String value) {
            addCriterion("employee_id <>", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdGreaterThan(String value) {
            addCriterion("employee_id >", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdGreaterThanOrEqualTo(String value) {
            addCriterion("employee_id >=", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdLessThan(String value) {
            addCriterion("employee_id <", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdLessThanOrEqualTo(String value) {
            addCriterion("employee_id <=", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdLike(String value) {
            addCriterion("employee_id like", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotLike(String value) {
            addCriterion("employee_id not like", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdIn(List<String> values) {
            addCriterion("employee_id in", values, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotIn(List<String> values) {
            addCriterion("employee_id not in", values, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdBetween(String value1, String value2) {
            addCriterion("employee_id between", value1, value2, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotBetween(String value1, String value2) {
            addCriterion("employee_id not between", value1, value2, "employeeId");
            return (Criteria) this;
        }
    }

    /**
     * member_request
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * member_request 2018-11-25
     */
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