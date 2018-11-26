package com.scb.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AccountExample {
    /**
     * account
     */
    protected String orderByClause;

    /**
     * account
     */
    protected boolean distinct;

    /**
     * account
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbg.generated 2018-11-25
     */
    public AccountExample() {
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
     * account 2018-11-25
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

        public Criteria andAccountIdIsNull() {
            addCriterion("account_id is null");
            return (Criteria) this;
        }

        public Criteria andAccountIdIsNotNull() {
            addCriterion("account_id is not null");
            return (Criteria) this;
        }

        public Criteria andAccountIdEqualTo(String value) {
            addCriterion("account_id =", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotEqualTo(String value) {
            addCriterion("account_id <>", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdGreaterThan(String value) {
            addCriterion("account_id >", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdGreaterThanOrEqualTo(String value) {
            addCriterion("account_id >=", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLessThan(String value) {
            addCriterion("account_id <", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLessThanOrEqualTo(String value) {
            addCriterion("account_id <=", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLike(String value) {
            addCriterion("account_id like", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotLike(String value) {
            addCriterion("account_id not like", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdIn(List<String> values) {
            addCriterion("account_id in", values, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotIn(List<String> values) {
            addCriterion("account_id not in", values, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdBetween(String value1, String value2) {
            addCriterion("account_id between", value1, value2, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotBetween(String value1, String value2) {
            addCriterion("account_id not between", value1, value2, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountPasswordIsNull() {
            addCriterion("account_password is null");
            return (Criteria) this;
        }

        public Criteria andAccountPasswordIsNotNull() {
            addCriterion("account_password is not null");
            return (Criteria) this;
        }

        public Criteria andAccountPasswordEqualTo(String value) {
            addCriterion("account_password =", value, "accountPassword");
            return (Criteria) this;
        }

        public Criteria andAccountPasswordNotEqualTo(String value) {
            addCriterion("account_password <>", value, "accountPassword");
            return (Criteria) this;
        }

        public Criteria andAccountPasswordGreaterThan(String value) {
            addCriterion("account_password >", value, "accountPassword");
            return (Criteria) this;
        }

        public Criteria andAccountPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("account_password >=", value, "accountPassword");
            return (Criteria) this;
        }

        public Criteria andAccountPasswordLessThan(String value) {
            addCriterion("account_password <", value, "accountPassword");
            return (Criteria) this;
        }

        public Criteria andAccountPasswordLessThanOrEqualTo(String value) {
            addCriterion("account_password <=", value, "accountPassword");
            return (Criteria) this;
        }

        public Criteria andAccountPasswordLike(String value) {
            addCriterion("account_password like", value, "accountPassword");
            return (Criteria) this;
        }

        public Criteria andAccountPasswordNotLike(String value) {
            addCriterion("account_password not like", value, "accountPassword");
            return (Criteria) this;
        }

        public Criteria andAccountPasswordIn(List<String> values) {
            addCriterion("account_password in", values, "accountPassword");
            return (Criteria) this;
        }

        public Criteria andAccountPasswordNotIn(List<String> values) {
            addCriterion("account_password not in", values, "accountPassword");
            return (Criteria) this;
        }

        public Criteria andAccountPasswordBetween(String value1, String value2) {
            addCriterion("account_password between", value1, value2, "accountPassword");
            return (Criteria) this;
        }

        public Criteria andAccountPasswordNotBetween(String value1, String value2) {
            addCriterion("account_password not between", value1, value2, "accountPassword");
            return (Criteria) this;
        }

        public Criteria andAccountUpdatedUserIsNull() {
            addCriterion("account_updated_user is null");
            return (Criteria) this;
        }

        public Criteria andAccountUpdatedUserIsNotNull() {
            addCriterion("account_updated_user is not null");
            return (Criteria) this;
        }

        public Criteria andAccountUpdatedUserEqualTo(String value) {
            addCriterion("account_updated_user =", value, "accountUpdatedUser");
            return (Criteria) this;
        }

        public Criteria andAccountUpdatedUserNotEqualTo(String value) {
            addCriterion("account_updated_user <>", value, "accountUpdatedUser");
            return (Criteria) this;
        }

        public Criteria andAccountUpdatedUserGreaterThan(String value) {
            addCriterion("account_updated_user >", value, "accountUpdatedUser");
            return (Criteria) this;
        }

        public Criteria andAccountUpdatedUserGreaterThanOrEqualTo(String value) {
            addCriterion("account_updated_user >=", value, "accountUpdatedUser");
            return (Criteria) this;
        }

        public Criteria andAccountUpdatedUserLessThan(String value) {
            addCriterion("account_updated_user <", value, "accountUpdatedUser");
            return (Criteria) this;
        }

        public Criteria andAccountUpdatedUserLessThanOrEqualTo(String value) {
            addCriterion("account_updated_user <=", value, "accountUpdatedUser");
            return (Criteria) this;
        }

        public Criteria andAccountUpdatedUserLike(String value) {
            addCriterion("account_updated_user like", value, "accountUpdatedUser");
            return (Criteria) this;
        }

        public Criteria andAccountUpdatedUserNotLike(String value) {
            addCriterion("account_updated_user not like", value, "accountUpdatedUser");
            return (Criteria) this;
        }

        public Criteria andAccountUpdatedUserIn(List<String> values) {
            addCriterion("account_updated_user in", values, "accountUpdatedUser");
            return (Criteria) this;
        }

        public Criteria andAccountUpdatedUserNotIn(List<String> values) {
            addCriterion("account_updated_user not in", values, "accountUpdatedUser");
            return (Criteria) this;
        }

        public Criteria andAccountUpdatedUserBetween(String value1, String value2) {
            addCriterion("account_updated_user between", value1, value2, "accountUpdatedUser");
            return (Criteria) this;
        }

        public Criteria andAccountUpdatedUserNotBetween(String value1, String value2) {
            addCriterion("account_updated_user not between", value1, value2, "accountUpdatedUser");
            return (Criteria) this;
        }

        public Criteria andAccountUpdatedTimeIsNull() {
            addCriterion("account_updated_time is null");
            return (Criteria) this;
        }

        public Criteria andAccountUpdatedTimeIsNotNull() {
            addCriterion("account_updated_time is not null");
            return (Criteria) this;
        }

        public Criteria andAccountUpdatedTimeEqualTo(Date value) {
            addCriterion("account_updated_time =", value, "accountUpdatedTime");
            return (Criteria) this;
        }

        public Criteria andAccountUpdatedTimeNotEqualTo(Date value) {
            addCriterion("account_updated_time <>", value, "accountUpdatedTime");
            return (Criteria) this;
        }

        public Criteria andAccountUpdatedTimeGreaterThan(Date value) {
            addCriterion("account_updated_time >", value, "accountUpdatedTime");
            return (Criteria) this;
        }

        public Criteria andAccountUpdatedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("account_updated_time >=", value, "accountUpdatedTime");
            return (Criteria) this;
        }

        public Criteria andAccountUpdatedTimeLessThan(Date value) {
            addCriterion("account_updated_time <", value, "accountUpdatedTime");
            return (Criteria) this;
        }

        public Criteria andAccountUpdatedTimeLessThanOrEqualTo(Date value) {
            addCriterion("account_updated_time <=", value, "accountUpdatedTime");
            return (Criteria) this;
        }

        public Criteria andAccountUpdatedTimeIn(List<Date> values) {
            addCriterion("account_updated_time in", values, "accountUpdatedTime");
            return (Criteria) this;
        }

        public Criteria andAccountUpdatedTimeNotIn(List<Date> values) {
            addCriterion("account_updated_time not in", values, "accountUpdatedTime");
            return (Criteria) this;
        }

        public Criteria andAccountUpdatedTimeBetween(Date value1, Date value2) {
            addCriterion("account_updated_time between", value1, value2, "accountUpdatedTime");
            return (Criteria) this;
        }

        public Criteria andAccountUpdatedTimeNotBetween(Date value1, Date value2) {
            addCriterion("account_updated_time not between", value1, value2, "accountUpdatedTime");
            return (Criteria) this;
        }
    }

    /**
     * account
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * account 2018-11-25
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