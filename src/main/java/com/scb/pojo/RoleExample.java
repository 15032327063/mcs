package com.scb.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RoleExample {
    /**
     * role
     */
    protected String orderByClause;

    /**
     * role
     */
    protected boolean distinct;

    /**
     * role
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbg.generated 2018-11-25
     */
    public RoleExample() {
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
     * role 2018-11-25
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

        public Criteria andRoleIdIsNull() {
            addCriterion("role_id is null");
            return (Criteria) this;
        }

        public Criteria andRoleIdIsNotNull() {
            addCriterion("role_id is not null");
            return (Criteria) this;
        }

        public Criteria andRoleIdEqualTo(String value) {
            addCriterion("role_id =", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotEqualTo(String value) {
            addCriterion("role_id <>", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThan(String value) {
            addCriterion("role_id >", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThanOrEqualTo(String value) {
            addCriterion("role_id >=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThan(String value) {
            addCriterion("role_id <", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThanOrEqualTo(String value) {
            addCriterion("role_id <=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLike(String value) {
            addCriterion("role_id like", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotLike(String value) {
            addCriterion("role_id not like", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdIn(List<String> values) {
            addCriterion("role_id in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotIn(List<String> values) {
            addCriterion("role_id not in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdBetween(String value1, String value2) {
            addCriterion("role_id between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotBetween(String value1, String value2) {
            addCriterion("role_id not between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleNameIsNull() {
            addCriterion("role_name is null");
            return (Criteria) this;
        }

        public Criteria andRoleNameIsNotNull() {
            addCriterion("role_name is not null");
            return (Criteria) this;
        }

        public Criteria andRoleNameEqualTo(String value) {
            addCriterion("role_name =", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotEqualTo(String value) {
            addCriterion("role_name <>", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameGreaterThan(String value) {
            addCriterion("role_name >", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameGreaterThanOrEqualTo(String value) {
            addCriterion("role_name >=", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameLessThan(String value) {
            addCriterion("role_name <", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameLessThanOrEqualTo(String value) {
            addCriterion("role_name <=", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameLike(String value) {
            addCriterion("role_name like", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotLike(String value) {
            addCriterion("role_name not like", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameIn(List<String> values) {
            addCriterion("role_name in", values, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotIn(List<String> values) {
            addCriterion("role_name not in", values, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameBetween(String value1, String value2) {
            addCriterion("role_name between", value1, value2, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotBetween(String value1, String value2) {
            addCriterion("role_name not between", value1, value2, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleUpdatedTimeIsNull() {
            addCriterion("role_updated_time is null");
            return (Criteria) this;
        }

        public Criteria andRoleUpdatedTimeIsNotNull() {
            addCriterion("role_updated_time is not null");
            return (Criteria) this;
        }

        public Criteria andRoleUpdatedTimeEqualTo(Date value) {
            addCriterion("role_updated_time =", value, "roleUpdatedTime");
            return (Criteria) this;
        }

        public Criteria andRoleUpdatedTimeNotEqualTo(Date value) {
            addCriterion("role_updated_time <>", value, "roleUpdatedTime");
            return (Criteria) this;
        }

        public Criteria andRoleUpdatedTimeGreaterThan(Date value) {
            addCriterion("role_updated_time >", value, "roleUpdatedTime");
            return (Criteria) this;
        }

        public Criteria andRoleUpdatedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("role_updated_time >=", value, "roleUpdatedTime");
            return (Criteria) this;
        }

        public Criteria andRoleUpdatedTimeLessThan(Date value) {
            addCriterion("role_updated_time <", value, "roleUpdatedTime");
            return (Criteria) this;
        }

        public Criteria andRoleUpdatedTimeLessThanOrEqualTo(Date value) {
            addCriterion("role_updated_time <=", value, "roleUpdatedTime");
            return (Criteria) this;
        }

        public Criteria andRoleUpdatedTimeIn(List<Date> values) {
            addCriterion("role_updated_time in", values, "roleUpdatedTime");
            return (Criteria) this;
        }

        public Criteria andRoleUpdatedTimeNotIn(List<Date> values) {
            addCriterion("role_updated_time not in", values, "roleUpdatedTime");
            return (Criteria) this;
        }

        public Criteria andRoleUpdatedTimeBetween(Date value1, Date value2) {
            addCriterion("role_updated_time between", value1, value2, "roleUpdatedTime");
            return (Criteria) this;
        }

        public Criteria andRoleUpdatedTimeNotBetween(Date value1, Date value2) {
            addCriterion("role_updated_time not between", value1, value2, "roleUpdatedTime");
            return (Criteria) this;
        }

        public Criteria andRoleCreatedUserIsNull() {
            addCriterion("role_created_user is null");
            return (Criteria) this;
        }

        public Criteria andRoleCreatedUserIsNotNull() {
            addCriterion("role_created_user is not null");
            return (Criteria) this;
        }

        public Criteria andRoleCreatedUserEqualTo(String value) {
            addCriterion("role_created_user =", value, "roleCreatedUser");
            return (Criteria) this;
        }

        public Criteria andRoleCreatedUserNotEqualTo(String value) {
            addCriterion("role_created_user <>", value, "roleCreatedUser");
            return (Criteria) this;
        }

        public Criteria andRoleCreatedUserGreaterThan(String value) {
            addCriterion("role_created_user >", value, "roleCreatedUser");
            return (Criteria) this;
        }

        public Criteria andRoleCreatedUserGreaterThanOrEqualTo(String value) {
            addCriterion("role_created_user >=", value, "roleCreatedUser");
            return (Criteria) this;
        }

        public Criteria andRoleCreatedUserLessThan(String value) {
            addCriterion("role_created_user <", value, "roleCreatedUser");
            return (Criteria) this;
        }

        public Criteria andRoleCreatedUserLessThanOrEqualTo(String value) {
            addCriterion("role_created_user <=", value, "roleCreatedUser");
            return (Criteria) this;
        }

        public Criteria andRoleCreatedUserLike(String value) {
            addCriterion("role_created_user like", value, "roleCreatedUser");
            return (Criteria) this;
        }

        public Criteria andRoleCreatedUserNotLike(String value) {
            addCriterion("role_created_user not like", value, "roleCreatedUser");
            return (Criteria) this;
        }

        public Criteria andRoleCreatedUserIn(List<String> values) {
            addCriterion("role_created_user in", values, "roleCreatedUser");
            return (Criteria) this;
        }

        public Criteria andRoleCreatedUserNotIn(List<String> values) {
            addCriterion("role_created_user not in", values, "roleCreatedUser");
            return (Criteria) this;
        }

        public Criteria andRoleCreatedUserBetween(String value1, String value2) {
            addCriterion("role_created_user between", value1, value2, "roleCreatedUser");
            return (Criteria) this;
        }

        public Criteria andRoleCreatedUserNotBetween(String value1, String value2) {
            addCriterion("role_created_user not between", value1, value2, "roleCreatedUser");
            return (Criteria) this;
        }

        public Criteria andRoleCreatedTimeIsNull() {
            addCriterion("role_created_time is null");
            return (Criteria) this;
        }

        public Criteria andRoleCreatedTimeIsNotNull() {
            addCriterion("role_created_time is not null");
            return (Criteria) this;
        }

        public Criteria andRoleCreatedTimeEqualTo(Date value) {
            addCriterion("role_created_time =", value, "roleCreatedTime");
            return (Criteria) this;
        }

        public Criteria andRoleCreatedTimeNotEqualTo(Date value) {
            addCriterion("role_created_time <>", value, "roleCreatedTime");
            return (Criteria) this;
        }

        public Criteria andRoleCreatedTimeGreaterThan(Date value) {
            addCriterion("role_created_time >", value, "roleCreatedTime");
            return (Criteria) this;
        }

        public Criteria andRoleCreatedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("role_created_time >=", value, "roleCreatedTime");
            return (Criteria) this;
        }

        public Criteria andRoleCreatedTimeLessThan(Date value) {
            addCriterion("role_created_time <", value, "roleCreatedTime");
            return (Criteria) this;
        }

        public Criteria andRoleCreatedTimeLessThanOrEqualTo(Date value) {
            addCriterion("role_created_time <=", value, "roleCreatedTime");
            return (Criteria) this;
        }

        public Criteria andRoleCreatedTimeIn(List<Date> values) {
            addCriterion("role_created_time in", values, "roleCreatedTime");
            return (Criteria) this;
        }

        public Criteria andRoleCreatedTimeNotIn(List<Date> values) {
            addCriterion("role_created_time not in", values, "roleCreatedTime");
            return (Criteria) this;
        }

        public Criteria andRoleCreatedTimeBetween(Date value1, Date value2) {
            addCriterion("role_created_time between", value1, value2, "roleCreatedTime");
            return (Criteria) this;
        }

        public Criteria andRoleCreatedTimeNotBetween(Date value1, Date value2) {
            addCriterion("role_created_time not between", value1, value2, "roleCreatedTime");
            return (Criteria) this;
        }

        public Criteria andRoleUpdatedUserIsNull() {
            addCriterion("role_updated_user is null");
            return (Criteria) this;
        }

        public Criteria andRoleUpdatedUserIsNotNull() {
            addCriterion("role_updated_user is not null");
            return (Criteria) this;
        }

        public Criteria andRoleUpdatedUserEqualTo(String value) {
            addCriterion("role_updated_user =", value, "roleUpdatedUser");
            return (Criteria) this;
        }

        public Criteria andRoleUpdatedUserNotEqualTo(String value) {
            addCriterion("role_updated_user <>", value, "roleUpdatedUser");
            return (Criteria) this;
        }

        public Criteria andRoleUpdatedUserGreaterThan(String value) {
            addCriterion("role_updated_user >", value, "roleUpdatedUser");
            return (Criteria) this;
        }

        public Criteria andRoleUpdatedUserGreaterThanOrEqualTo(String value) {
            addCriterion("role_updated_user >=", value, "roleUpdatedUser");
            return (Criteria) this;
        }

        public Criteria andRoleUpdatedUserLessThan(String value) {
            addCriterion("role_updated_user <", value, "roleUpdatedUser");
            return (Criteria) this;
        }

        public Criteria andRoleUpdatedUserLessThanOrEqualTo(String value) {
            addCriterion("role_updated_user <=", value, "roleUpdatedUser");
            return (Criteria) this;
        }

        public Criteria andRoleUpdatedUserLike(String value) {
            addCriterion("role_updated_user like", value, "roleUpdatedUser");
            return (Criteria) this;
        }

        public Criteria andRoleUpdatedUserNotLike(String value) {
            addCriterion("role_updated_user not like", value, "roleUpdatedUser");
            return (Criteria) this;
        }

        public Criteria andRoleUpdatedUserIn(List<String> values) {
            addCriterion("role_updated_user in", values, "roleUpdatedUser");
            return (Criteria) this;
        }

        public Criteria andRoleUpdatedUserNotIn(List<String> values) {
            addCriterion("role_updated_user not in", values, "roleUpdatedUser");
            return (Criteria) this;
        }

        public Criteria andRoleUpdatedUserBetween(String value1, String value2) {
            addCriterion("role_updated_user between", value1, value2, "roleUpdatedUser");
            return (Criteria) this;
        }

        public Criteria andRoleUpdatedUserNotBetween(String value1, String value2) {
            addCriterion("role_updated_user not between", value1, value2, "roleUpdatedUser");
            return (Criteria) this;
        }
    }

    /**
     * role
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * role 2018-11-25
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