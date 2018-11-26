package com.scb.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FunctionExample {
    /**
     * function
     */
    protected String orderByClause;

    /**
     * function
     */
    protected boolean distinct;

    /**
     * function
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbg.generated 2018-11-25
     */
    public FunctionExample() {
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
     * function 2018-11-25
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

        public Criteria andFunctionIdIsNull() {
            addCriterion("function_id is null");
            return (Criteria) this;
        }

        public Criteria andFunctionIdIsNotNull() {
            addCriterion("function_id is not null");
            return (Criteria) this;
        }

        public Criteria andFunctionIdEqualTo(String value) {
            addCriterion("function_id =", value, "functionId");
            return (Criteria) this;
        }

        public Criteria andFunctionIdNotEqualTo(String value) {
            addCriterion("function_id <>", value, "functionId");
            return (Criteria) this;
        }

        public Criteria andFunctionIdGreaterThan(String value) {
            addCriterion("function_id >", value, "functionId");
            return (Criteria) this;
        }

        public Criteria andFunctionIdGreaterThanOrEqualTo(String value) {
            addCriterion("function_id >=", value, "functionId");
            return (Criteria) this;
        }

        public Criteria andFunctionIdLessThan(String value) {
            addCriterion("function_id <", value, "functionId");
            return (Criteria) this;
        }

        public Criteria andFunctionIdLessThanOrEqualTo(String value) {
            addCriterion("function_id <=", value, "functionId");
            return (Criteria) this;
        }

        public Criteria andFunctionIdLike(String value) {
            addCriterion("function_id like", value, "functionId");
            return (Criteria) this;
        }

        public Criteria andFunctionIdNotLike(String value) {
            addCriterion("function_id not like", value, "functionId");
            return (Criteria) this;
        }

        public Criteria andFunctionIdIn(List<String> values) {
            addCriterion("function_id in", values, "functionId");
            return (Criteria) this;
        }

        public Criteria andFunctionIdNotIn(List<String> values) {
            addCriterion("function_id not in", values, "functionId");
            return (Criteria) this;
        }

        public Criteria andFunctionIdBetween(String value1, String value2) {
            addCriterion("function_id between", value1, value2, "functionId");
            return (Criteria) this;
        }

        public Criteria andFunctionIdNotBetween(String value1, String value2) {
            addCriterion("function_id not between", value1, value2, "functionId");
            return (Criteria) this;
        }

        public Criteria andFunctionNameIsNull() {
            addCriterion("function_name is null");
            return (Criteria) this;
        }

        public Criteria andFunctionNameIsNotNull() {
            addCriterion("function_name is not null");
            return (Criteria) this;
        }

        public Criteria andFunctionNameEqualTo(String value) {
            addCriterion("function_name =", value, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameNotEqualTo(String value) {
            addCriterion("function_name <>", value, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameGreaterThan(String value) {
            addCriterion("function_name >", value, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameGreaterThanOrEqualTo(String value) {
            addCriterion("function_name >=", value, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameLessThan(String value) {
            addCriterion("function_name <", value, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameLessThanOrEqualTo(String value) {
            addCriterion("function_name <=", value, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameLike(String value) {
            addCriterion("function_name like", value, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameNotLike(String value) {
            addCriterion("function_name not like", value, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameIn(List<String> values) {
            addCriterion("function_name in", values, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameNotIn(List<String> values) {
            addCriterion("function_name not in", values, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameBetween(String value1, String value2) {
            addCriterion("function_name between", value1, value2, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameNotBetween(String value1, String value2) {
            addCriterion("function_name not between", value1, value2, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionUpdatedTimeIsNull() {
            addCriterion("function_updated_time is null");
            return (Criteria) this;
        }

        public Criteria andFunctionUpdatedTimeIsNotNull() {
            addCriterion("function_updated_time is not null");
            return (Criteria) this;
        }

        public Criteria andFunctionUpdatedTimeEqualTo(Date value) {
            addCriterion("function_updated_time =", value, "functionUpdatedTime");
            return (Criteria) this;
        }

        public Criteria andFunctionUpdatedTimeNotEqualTo(Date value) {
            addCriterion("function_updated_time <>", value, "functionUpdatedTime");
            return (Criteria) this;
        }

        public Criteria andFunctionUpdatedTimeGreaterThan(Date value) {
            addCriterion("function_updated_time >", value, "functionUpdatedTime");
            return (Criteria) this;
        }

        public Criteria andFunctionUpdatedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("function_updated_time >=", value, "functionUpdatedTime");
            return (Criteria) this;
        }

        public Criteria andFunctionUpdatedTimeLessThan(Date value) {
            addCriterion("function_updated_time <", value, "functionUpdatedTime");
            return (Criteria) this;
        }

        public Criteria andFunctionUpdatedTimeLessThanOrEqualTo(Date value) {
            addCriterion("function_updated_time <=", value, "functionUpdatedTime");
            return (Criteria) this;
        }

        public Criteria andFunctionUpdatedTimeIn(List<Date> values) {
            addCriterion("function_updated_time in", values, "functionUpdatedTime");
            return (Criteria) this;
        }

        public Criteria andFunctionUpdatedTimeNotIn(List<Date> values) {
            addCriterion("function_updated_time not in", values, "functionUpdatedTime");
            return (Criteria) this;
        }

        public Criteria andFunctionUpdatedTimeBetween(Date value1, Date value2) {
            addCriterion("function_updated_time between", value1, value2, "functionUpdatedTime");
            return (Criteria) this;
        }

        public Criteria andFunctionUpdatedTimeNotBetween(Date value1, Date value2) {
            addCriterion("function_updated_time not between", value1, value2, "functionUpdatedTime");
            return (Criteria) this;
        }

        public Criteria andFunctionCreatedUserIsNull() {
            addCriterion("function_created_user is null");
            return (Criteria) this;
        }

        public Criteria andFunctionCreatedUserIsNotNull() {
            addCriterion("function_created_user is not null");
            return (Criteria) this;
        }

        public Criteria andFunctionCreatedUserEqualTo(String value) {
            addCriterion("function_created_user =", value, "functionCreatedUser");
            return (Criteria) this;
        }

        public Criteria andFunctionCreatedUserNotEqualTo(String value) {
            addCriterion("function_created_user <>", value, "functionCreatedUser");
            return (Criteria) this;
        }

        public Criteria andFunctionCreatedUserGreaterThan(String value) {
            addCriterion("function_created_user >", value, "functionCreatedUser");
            return (Criteria) this;
        }

        public Criteria andFunctionCreatedUserGreaterThanOrEqualTo(String value) {
            addCriterion("function_created_user >=", value, "functionCreatedUser");
            return (Criteria) this;
        }

        public Criteria andFunctionCreatedUserLessThan(String value) {
            addCriterion("function_created_user <", value, "functionCreatedUser");
            return (Criteria) this;
        }

        public Criteria andFunctionCreatedUserLessThanOrEqualTo(String value) {
            addCriterion("function_created_user <=", value, "functionCreatedUser");
            return (Criteria) this;
        }

        public Criteria andFunctionCreatedUserLike(String value) {
            addCriterion("function_created_user like", value, "functionCreatedUser");
            return (Criteria) this;
        }

        public Criteria andFunctionCreatedUserNotLike(String value) {
            addCriterion("function_created_user not like", value, "functionCreatedUser");
            return (Criteria) this;
        }

        public Criteria andFunctionCreatedUserIn(List<String> values) {
            addCriterion("function_created_user in", values, "functionCreatedUser");
            return (Criteria) this;
        }

        public Criteria andFunctionCreatedUserNotIn(List<String> values) {
            addCriterion("function_created_user not in", values, "functionCreatedUser");
            return (Criteria) this;
        }

        public Criteria andFunctionCreatedUserBetween(String value1, String value2) {
            addCriterion("function_created_user between", value1, value2, "functionCreatedUser");
            return (Criteria) this;
        }

        public Criteria andFunctionCreatedUserNotBetween(String value1, String value2) {
            addCriterion("function_created_user not between", value1, value2, "functionCreatedUser");
            return (Criteria) this;
        }

        public Criteria andFunctionCreatedTimeIsNull() {
            addCriterion("function_created_time is null");
            return (Criteria) this;
        }

        public Criteria andFunctionCreatedTimeIsNotNull() {
            addCriterion("function_created_time is not null");
            return (Criteria) this;
        }

        public Criteria andFunctionCreatedTimeEqualTo(Date value) {
            addCriterion("function_created_time =", value, "functionCreatedTime");
            return (Criteria) this;
        }

        public Criteria andFunctionCreatedTimeNotEqualTo(Date value) {
            addCriterion("function_created_time <>", value, "functionCreatedTime");
            return (Criteria) this;
        }

        public Criteria andFunctionCreatedTimeGreaterThan(Date value) {
            addCriterion("function_created_time >", value, "functionCreatedTime");
            return (Criteria) this;
        }

        public Criteria andFunctionCreatedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("function_created_time >=", value, "functionCreatedTime");
            return (Criteria) this;
        }

        public Criteria andFunctionCreatedTimeLessThan(Date value) {
            addCriterion("function_created_time <", value, "functionCreatedTime");
            return (Criteria) this;
        }

        public Criteria andFunctionCreatedTimeLessThanOrEqualTo(Date value) {
            addCriterion("function_created_time <=", value, "functionCreatedTime");
            return (Criteria) this;
        }

        public Criteria andFunctionCreatedTimeIn(List<Date> values) {
            addCriterion("function_created_time in", values, "functionCreatedTime");
            return (Criteria) this;
        }

        public Criteria andFunctionCreatedTimeNotIn(List<Date> values) {
            addCriterion("function_created_time not in", values, "functionCreatedTime");
            return (Criteria) this;
        }

        public Criteria andFunctionCreatedTimeBetween(Date value1, Date value2) {
            addCriterion("function_created_time between", value1, value2, "functionCreatedTime");
            return (Criteria) this;
        }

        public Criteria andFunctionCreatedTimeNotBetween(Date value1, Date value2) {
            addCriterion("function_created_time not between", value1, value2, "functionCreatedTime");
            return (Criteria) this;
        }

        public Criteria andFunctionUpdatedUserIsNull() {
            addCriterion("function_updated_user is null");
            return (Criteria) this;
        }

        public Criteria andFunctionUpdatedUserIsNotNull() {
            addCriterion("function_updated_user is not null");
            return (Criteria) this;
        }

        public Criteria andFunctionUpdatedUserEqualTo(String value) {
            addCriterion("function_updated_user =", value, "functionUpdatedUser");
            return (Criteria) this;
        }

        public Criteria andFunctionUpdatedUserNotEqualTo(String value) {
            addCriterion("function_updated_user <>", value, "functionUpdatedUser");
            return (Criteria) this;
        }

        public Criteria andFunctionUpdatedUserGreaterThan(String value) {
            addCriterion("function_updated_user >", value, "functionUpdatedUser");
            return (Criteria) this;
        }

        public Criteria andFunctionUpdatedUserGreaterThanOrEqualTo(String value) {
            addCriterion("function_updated_user >=", value, "functionUpdatedUser");
            return (Criteria) this;
        }

        public Criteria andFunctionUpdatedUserLessThan(String value) {
            addCriterion("function_updated_user <", value, "functionUpdatedUser");
            return (Criteria) this;
        }

        public Criteria andFunctionUpdatedUserLessThanOrEqualTo(String value) {
            addCriterion("function_updated_user <=", value, "functionUpdatedUser");
            return (Criteria) this;
        }

        public Criteria andFunctionUpdatedUserLike(String value) {
            addCriterion("function_updated_user like", value, "functionUpdatedUser");
            return (Criteria) this;
        }

        public Criteria andFunctionUpdatedUserNotLike(String value) {
            addCriterion("function_updated_user not like", value, "functionUpdatedUser");
            return (Criteria) this;
        }

        public Criteria andFunctionUpdatedUserIn(List<String> values) {
            addCriterion("function_updated_user in", values, "functionUpdatedUser");
            return (Criteria) this;
        }

        public Criteria andFunctionUpdatedUserNotIn(List<String> values) {
            addCriterion("function_updated_user not in", values, "functionUpdatedUser");
            return (Criteria) this;
        }

        public Criteria andFunctionUpdatedUserBetween(String value1, String value2) {
            addCriterion("function_updated_user between", value1, value2, "functionUpdatedUser");
            return (Criteria) this;
        }

        public Criteria andFunctionUpdatedUserNotBetween(String value1, String value2) {
            addCriterion("function_updated_user not between", value1, value2, "functionUpdatedUser");
            return (Criteria) this;
        }
    }

    /**
     * function
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * function 2018-11-25
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