package com.scb.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LeaderRequestExample {
    /**
     * leader_request
     */
    protected String orderByClause;

    /**
     * leader_request
     */
    protected boolean distinct;

    /**
     * leader_request
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbg.generated 2018-11-25
     */
    public LeaderRequestExample() {
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
     * leader_request 2018-11-25
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

        public Criteria andLeaderRequestIdIsNull() {
            addCriterion("leader_request_id is null");
            return (Criteria) this;
        }

        public Criteria andLeaderRequestIdIsNotNull() {
            addCriterion("leader_request_id is not null");
            return (Criteria) this;
        }

        public Criteria andLeaderRequestIdEqualTo(String value) {
            addCriterion("leader_request_id =", value, "leaderRequestId");
            return (Criteria) this;
        }

        public Criteria andLeaderRequestIdNotEqualTo(String value) {
            addCriterion("leader_request_id <>", value, "leaderRequestId");
            return (Criteria) this;
        }

        public Criteria andLeaderRequestIdGreaterThan(String value) {
            addCriterion("leader_request_id >", value, "leaderRequestId");
            return (Criteria) this;
        }

        public Criteria andLeaderRequestIdGreaterThanOrEqualTo(String value) {
            addCriterion("leader_request_id >=", value, "leaderRequestId");
            return (Criteria) this;
        }

        public Criteria andLeaderRequestIdLessThan(String value) {
            addCriterion("leader_request_id <", value, "leaderRequestId");
            return (Criteria) this;
        }

        public Criteria andLeaderRequestIdLessThanOrEqualTo(String value) {
            addCriterion("leader_request_id <=", value, "leaderRequestId");
            return (Criteria) this;
        }

        public Criteria andLeaderRequestIdLike(String value) {
            addCriterion("leader_request_id like", value, "leaderRequestId");
            return (Criteria) this;
        }

        public Criteria andLeaderRequestIdNotLike(String value) {
            addCriterion("leader_request_id not like", value, "leaderRequestId");
            return (Criteria) this;
        }

        public Criteria andLeaderRequestIdIn(List<String> values) {
            addCriterion("leader_request_id in", values, "leaderRequestId");
            return (Criteria) this;
        }

        public Criteria andLeaderRequestIdNotIn(List<String> values) {
            addCriterion("leader_request_id not in", values, "leaderRequestId");
            return (Criteria) this;
        }

        public Criteria andLeaderRequestIdBetween(String value1, String value2) {
            addCriterion("leader_request_id between", value1, value2, "leaderRequestId");
            return (Criteria) this;
        }

        public Criteria andLeaderRequestIdNotBetween(String value1, String value2) {
            addCriterion("leader_request_id not between", value1, value2, "leaderRequestId");
            return (Criteria) this;
        }

        public Criteria andLeaderRequestTimeIsNull() {
            addCriterion("leader_request_time is null");
            return (Criteria) this;
        }

        public Criteria andLeaderRequestTimeIsNotNull() {
            addCriterion("leader_request_time is not null");
            return (Criteria) this;
        }

        public Criteria andLeaderRequestTimeEqualTo(Date value) {
            addCriterion("leader_request_time =", value, "leaderRequestTime");
            return (Criteria) this;
        }

        public Criteria andLeaderRequestTimeNotEqualTo(Date value) {
            addCriterion("leader_request_time <>", value, "leaderRequestTime");
            return (Criteria) this;
        }

        public Criteria andLeaderRequestTimeGreaterThan(Date value) {
            addCriterion("leader_request_time >", value, "leaderRequestTime");
            return (Criteria) this;
        }

        public Criteria andLeaderRequestTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("leader_request_time >=", value, "leaderRequestTime");
            return (Criteria) this;
        }

        public Criteria andLeaderRequestTimeLessThan(Date value) {
            addCriterion("leader_request_time <", value, "leaderRequestTime");
            return (Criteria) this;
        }

        public Criteria andLeaderRequestTimeLessThanOrEqualTo(Date value) {
            addCriterion("leader_request_time <=", value, "leaderRequestTime");
            return (Criteria) this;
        }

        public Criteria andLeaderRequestTimeIn(List<Date> values) {
            addCriterion("leader_request_time in", values, "leaderRequestTime");
            return (Criteria) this;
        }

        public Criteria andLeaderRequestTimeNotIn(List<Date> values) {
            addCriterion("leader_request_time not in", values, "leaderRequestTime");
            return (Criteria) this;
        }

        public Criteria andLeaderRequestTimeBetween(Date value1, Date value2) {
            addCriterion("leader_request_time between", value1, value2, "leaderRequestTime");
            return (Criteria) this;
        }

        public Criteria andLeaderRequestTimeNotBetween(Date value1, Date value2) {
            addCriterion("leader_request_time not between", value1, value2, "leaderRequestTime");
            return (Criteria) this;
        }

        public Criteria andLeaderRequestNumIsNull() {
            addCriterion("leader_request_num is null");
            return (Criteria) this;
        }

        public Criteria andLeaderRequestNumIsNotNull() {
            addCriterion("leader_request_num is not null");
            return (Criteria) this;
        }

        public Criteria andLeaderRequestNumEqualTo(Integer value) {
            addCriterion("leader_request_num =", value, "leaderRequestNum");
            return (Criteria) this;
        }

        public Criteria andLeaderRequestNumNotEqualTo(Integer value) {
            addCriterion("leader_request_num <>", value, "leaderRequestNum");
            return (Criteria) this;
        }

        public Criteria andLeaderRequestNumGreaterThan(Integer value) {
            addCriterion("leader_request_num >", value, "leaderRequestNum");
            return (Criteria) this;
        }

        public Criteria andLeaderRequestNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("leader_request_num >=", value, "leaderRequestNum");
            return (Criteria) this;
        }

        public Criteria andLeaderRequestNumLessThan(Integer value) {
            addCriterion("leader_request_num <", value, "leaderRequestNum");
            return (Criteria) this;
        }

        public Criteria andLeaderRequestNumLessThanOrEqualTo(Integer value) {
            addCriterion("leader_request_num <=", value, "leaderRequestNum");
            return (Criteria) this;
        }

        public Criteria andLeaderRequestNumIn(List<Integer> values) {
            addCriterion("leader_request_num in", values, "leaderRequestNum");
            return (Criteria) this;
        }

        public Criteria andLeaderRequestNumNotIn(List<Integer> values) {
            addCriterion("leader_request_num not in", values, "leaderRequestNum");
            return (Criteria) this;
        }

        public Criteria andLeaderRequestNumBetween(Integer value1, Integer value2) {
            addCriterion("leader_request_num between", value1, value2, "leaderRequestNum");
            return (Criteria) this;
        }

        public Criteria andLeaderRequestNumNotBetween(Integer value1, Integer value2) {
            addCriterion("leader_request_num not between", value1, value2, "leaderRequestNum");
            return (Criteria) this;
        }

        public Criteria andLeaderRequestDateIsNull() {
            addCriterion("leader_request_date is null");
            return (Criteria) this;
        }

        public Criteria andLeaderRequestDateIsNotNull() {
            addCriterion("leader_request_date is not null");
            return (Criteria) this;
        }

        public Criteria andLeaderRequestDateEqualTo(Date value) {
            addCriterion("leader_request_date =", value, "leaderRequestDate");
            return (Criteria) this;
        }

        public Criteria andLeaderRequestDateNotEqualTo(Date value) {
            addCriterion("leader_request_date <>", value, "leaderRequestDate");
            return (Criteria) this;
        }

        public Criteria andLeaderRequestDateGreaterThan(Date value) {
            addCriterion("leader_request_date >", value, "leaderRequestDate");
            return (Criteria) this;
        }

        public Criteria andLeaderRequestDateGreaterThanOrEqualTo(Date value) {
            addCriterion("leader_request_date >=", value, "leaderRequestDate");
            return (Criteria) this;
        }

        public Criteria andLeaderRequestDateLessThan(Date value) {
            addCriterion("leader_request_date <", value, "leaderRequestDate");
            return (Criteria) this;
        }

        public Criteria andLeaderRequestDateLessThanOrEqualTo(Date value) {
            addCriterion("leader_request_date <=", value, "leaderRequestDate");
            return (Criteria) this;
        }

        public Criteria andLeaderRequestDateIn(List<Date> values) {
            addCriterion("leader_request_date in", values, "leaderRequestDate");
            return (Criteria) this;
        }

        public Criteria andLeaderRequestDateNotIn(List<Date> values) {
            addCriterion("leader_request_date not in", values, "leaderRequestDate");
            return (Criteria) this;
        }

        public Criteria andLeaderRequestDateBetween(Date value1, Date value2) {
            addCriterion("leader_request_date between", value1, value2, "leaderRequestDate");
            return (Criteria) this;
        }

        public Criteria andLeaderRequestDateNotBetween(Date value1, Date value2) {
            addCriterion("leader_request_date not between", value1, value2, "leaderRequestDate");
            return (Criteria) this;
        }

        public Criteria andLeaderRequestStatusIsNull() {
            addCriterion("leader_request_status is null");
            return (Criteria) this;
        }

        public Criteria andLeaderRequestStatusIsNotNull() {
            addCriterion("leader_request_status is not null");
            return (Criteria) this;
        }

        public Criteria andLeaderRequestStatusEqualTo(String value) {
            addCriterion("leader_request_status =", value, "leaderRequestStatus");
            return (Criteria) this;
        }

        public Criteria andLeaderRequestStatusNotEqualTo(String value) {
            addCriterion("leader_request_status <>", value, "leaderRequestStatus");
            return (Criteria) this;
        }

        public Criteria andLeaderRequestStatusGreaterThan(String value) {
            addCriterion("leader_request_status >", value, "leaderRequestStatus");
            return (Criteria) this;
        }

        public Criteria andLeaderRequestStatusGreaterThanOrEqualTo(String value) {
            addCriterion("leader_request_status >=", value, "leaderRequestStatus");
            return (Criteria) this;
        }

        public Criteria andLeaderRequestStatusLessThan(String value) {
            addCriterion("leader_request_status <", value, "leaderRequestStatus");
            return (Criteria) this;
        }

        public Criteria andLeaderRequestStatusLessThanOrEqualTo(String value) {
            addCriterion("leader_request_status <=", value, "leaderRequestStatus");
            return (Criteria) this;
        }

        public Criteria andLeaderRequestStatusLike(String value) {
            addCriterion("leader_request_status like", value, "leaderRequestStatus");
            return (Criteria) this;
        }

        public Criteria andLeaderRequestStatusNotLike(String value) {
            addCriterion("leader_request_status not like", value, "leaderRequestStatus");
            return (Criteria) this;
        }

        public Criteria andLeaderRequestStatusIn(List<String> values) {
            addCriterion("leader_request_status in", values, "leaderRequestStatus");
            return (Criteria) this;
        }

        public Criteria andLeaderRequestStatusNotIn(List<String> values) {
            addCriterion("leader_request_status not in", values, "leaderRequestStatus");
            return (Criteria) this;
        }

        public Criteria andLeaderRequestStatusBetween(String value1, String value2) {
            addCriterion("leader_request_status between", value1, value2, "leaderRequestStatus");
            return (Criteria) this;
        }

        public Criteria andLeaderRequestStatusNotBetween(String value1, String value2) {
            addCriterion("leader_request_status not between", value1, value2, "leaderRequestStatus");
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
     * leader_request
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * leader_request 2018-11-25
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