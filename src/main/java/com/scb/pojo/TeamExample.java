package com.scb.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TeamExample {
    /**
     * team
     */
    protected String orderByClause;

    /**
     * team
     */
    protected boolean distinct;

    /**
     * team
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbg.generated 2018-11-25
     */
    public TeamExample() {
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
     * team 2018-11-25
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

        public Criteria andTeamIdIsNull() {
            addCriterion("team_id is null");
            return (Criteria) this;
        }

        public Criteria andTeamIdIsNotNull() {
            addCriterion("team_id is not null");
            return (Criteria) this;
        }

        public Criteria andTeamIdEqualTo(String value) {
            addCriterion("team_id =", value, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdNotEqualTo(String value) {
            addCriterion("team_id <>", value, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdGreaterThan(String value) {
            addCriterion("team_id >", value, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdGreaterThanOrEqualTo(String value) {
            addCriterion("team_id >=", value, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdLessThan(String value) {
            addCriterion("team_id <", value, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdLessThanOrEqualTo(String value) {
            addCriterion("team_id <=", value, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdLike(String value) {
            addCriterion("team_id like", value, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdNotLike(String value) {
            addCriterion("team_id not like", value, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdIn(List<String> values) {
            addCriterion("team_id in", values, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdNotIn(List<String> values) {
            addCriterion("team_id not in", values, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdBetween(String value1, String value2) {
            addCriterion("team_id between", value1, value2, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdNotBetween(String value1, String value2) {
            addCriterion("team_id not between", value1, value2, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamNameIsNull() {
            addCriterion("team_name is null");
            return (Criteria) this;
        }

        public Criteria andTeamNameIsNotNull() {
            addCriterion("team_name is not null");
            return (Criteria) this;
        }

        public Criteria andTeamNameEqualTo(String value) {
            addCriterion("team_name =", value, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameNotEqualTo(String value) {
            addCriterion("team_name <>", value, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameGreaterThan(String value) {
            addCriterion("team_name >", value, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameGreaterThanOrEqualTo(String value) {
            addCriterion("team_name >=", value, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameLessThan(String value) {
            addCriterion("team_name <", value, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameLessThanOrEqualTo(String value) {
            addCriterion("team_name <=", value, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameLike(String value) {
            addCriterion("team_name like", value, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameNotLike(String value) {
            addCriterion("team_name not like", value, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameIn(List<String> values) {
            addCriterion("team_name in", values, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameNotIn(List<String> values) {
            addCriterion("team_name not in", values, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameBetween(String value1, String value2) {
            addCriterion("team_name between", value1, value2, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameNotBetween(String value1, String value2) {
            addCriterion("team_name not between", value1, value2, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamUpdatedTimeIsNull() {
            addCriterion("team_updated_time is null");
            return (Criteria) this;
        }

        public Criteria andTeamUpdatedTimeIsNotNull() {
            addCriterion("team_updated_time is not null");
            return (Criteria) this;
        }

        public Criteria andTeamUpdatedTimeEqualTo(Date value) {
            addCriterion("team_updated_time =", value, "teamUpdatedTime");
            return (Criteria) this;
        }

        public Criteria andTeamUpdatedTimeNotEqualTo(Date value) {
            addCriterion("team_updated_time <>", value, "teamUpdatedTime");
            return (Criteria) this;
        }

        public Criteria andTeamUpdatedTimeGreaterThan(Date value) {
            addCriterion("team_updated_time >", value, "teamUpdatedTime");
            return (Criteria) this;
        }

        public Criteria andTeamUpdatedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("team_updated_time >=", value, "teamUpdatedTime");
            return (Criteria) this;
        }

        public Criteria andTeamUpdatedTimeLessThan(Date value) {
            addCriterion("team_updated_time <", value, "teamUpdatedTime");
            return (Criteria) this;
        }

        public Criteria andTeamUpdatedTimeLessThanOrEqualTo(Date value) {
            addCriterion("team_updated_time <=", value, "teamUpdatedTime");
            return (Criteria) this;
        }

        public Criteria andTeamUpdatedTimeIn(List<Date> values) {
            addCriterion("team_updated_time in", values, "teamUpdatedTime");
            return (Criteria) this;
        }

        public Criteria andTeamUpdatedTimeNotIn(List<Date> values) {
            addCriterion("team_updated_time not in", values, "teamUpdatedTime");
            return (Criteria) this;
        }

        public Criteria andTeamUpdatedTimeBetween(Date value1, Date value2) {
            addCriterion("team_updated_time between", value1, value2, "teamUpdatedTime");
            return (Criteria) this;
        }

        public Criteria andTeamUpdatedTimeNotBetween(Date value1, Date value2) {
            addCriterion("team_updated_time not between", value1, value2, "teamUpdatedTime");
            return (Criteria) this;
        }

        public Criteria andTeamCreatedUserIsNull() {
            addCriterion("team_created_user is null");
            return (Criteria) this;
        }

        public Criteria andTeamCreatedUserIsNotNull() {
            addCriterion("team_created_user is not null");
            return (Criteria) this;
        }

        public Criteria andTeamCreatedUserEqualTo(String value) {
            addCriterion("team_created_user =", value, "teamCreatedUser");
            return (Criteria) this;
        }

        public Criteria andTeamCreatedUserNotEqualTo(String value) {
            addCriterion("team_created_user <>", value, "teamCreatedUser");
            return (Criteria) this;
        }

        public Criteria andTeamCreatedUserGreaterThan(String value) {
            addCriterion("team_created_user >", value, "teamCreatedUser");
            return (Criteria) this;
        }

        public Criteria andTeamCreatedUserGreaterThanOrEqualTo(String value) {
            addCriterion("team_created_user >=", value, "teamCreatedUser");
            return (Criteria) this;
        }

        public Criteria andTeamCreatedUserLessThan(String value) {
            addCriterion("team_created_user <", value, "teamCreatedUser");
            return (Criteria) this;
        }

        public Criteria andTeamCreatedUserLessThanOrEqualTo(String value) {
            addCriterion("team_created_user <=", value, "teamCreatedUser");
            return (Criteria) this;
        }

        public Criteria andTeamCreatedUserLike(String value) {
            addCriterion("team_created_user like", value, "teamCreatedUser");
            return (Criteria) this;
        }

        public Criteria andTeamCreatedUserNotLike(String value) {
            addCriterion("team_created_user not like", value, "teamCreatedUser");
            return (Criteria) this;
        }

        public Criteria andTeamCreatedUserIn(List<String> values) {
            addCriterion("team_created_user in", values, "teamCreatedUser");
            return (Criteria) this;
        }

        public Criteria andTeamCreatedUserNotIn(List<String> values) {
            addCriterion("team_created_user not in", values, "teamCreatedUser");
            return (Criteria) this;
        }

        public Criteria andTeamCreatedUserBetween(String value1, String value2) {
            addCriterion("team_created_user between", value1, value2, "teamCreatedUser");
            return (Criteria) this;
        }

        public Criteria andTeamCreatedUserNotBetween(String value1, String value2) {
            addCriterion("team_created_user not between", value1, value2, "teamCreatedUser");
            return (Criteria) this;
        }

        public Criteria andTeamCreatedTimeIsNull() {
            addCriterion("team_created_time is null");
            return (Criteria) this;
        }

        public Criteria andTeamCreatedTimeIsNotNull() {
            addCriterion("team_created_time is not null");
            return (Criteria) this;
        }

        public Criteria andTeamCreatedTimeEqualTo(Date value) {
            addCriterion("team_created_time =", value, "teamCreatedTime");
            return (Criteria) this;
        }

        public Criteria andTeamCreatedTimeNotEqualTo(Date value) {
            addCriterion("team_created_time <>", value, "teamCreatedTime");
            return (Criteria) this;
        }

        public Criteria andTeamCreatedTimeGreaterThan(Date value) {
            addCriterion("team_created_time >", value, "teamCreatedTime");
            return (Criteria) this;
        }

        public Criteria andTeamCreatedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("team_created_time >=", value, "teamCreatedTime");
            return (Criteria) this;
        }

        public Criteria andTeamCreatedTimeLessThan(Date value) {
            addCriterion("team_created_time <", value, "teamCreatedTime");
            return (Criteria) this;
        }

        public Criteria andTeamCreatedTimeLessThanOrEqualTo(Date value) {
            addCriterion("team_created_time <=", value, "teamCreatedTime");
            return (Criteria) this;
        }

        public Criteria andTeamCreatedTimeIn(List<Date> values) {
            addCriterion("team_created_time in", values, "teamCreatedTime");
            return (Criteria) this;
        }

        public Criteria andTeamCreatedTimeNotIn(List<Date> values) {
            addCriterion("team_created_time not in", values, "teamCreatedTime");
            return (Criteria) this;
        }

        public Criteria andTeamCreatedTimeBetween(Date value1, Date value2) {
            addCriterion("team_created_time between", value1, value2, "teamCreatedTime");
            return (Criteria) this;
        }

        public Criteria andTeamCreatedTimeNotBetween(Date value1, Date value2) {
            addCriterion("team_created_time not between", value1, value2, "teamCreatedTime");
            return (Criteria) this;
        }

        public Criteria andTeamUpdatedUserIsNull() {
            addCriterion("team_updated_user is null");
            return (Criteria) this;
        }

        public Criteria andTeamUpdatedUserIsNotNull() {
            addCriterion("team_updated_user is not null");
            return (Criteria) this;
        }

        public Criteria andTeamUpdatedUserEqualTo(String value) {
            addCriterion("team_updated_user =", value, "teamUpdatedUser");
            return (Criteria) this;
        }

        public Criteria andTeamUpdatedUserNotEqualTo(String value) {
            addCriterion("team_updated_user <>", value, "teamUpdatedUser");
            return (Criteria) this;
        }

        public Criteria andTeamUpdatedUserGreaterThan(String value) {
            addCriterion("team_updated_user >", value, "teamUpdatedUser");
            return (Criteria) this;
        }

        public Criteria andTeamUpdatedUserGreaterThanOrEqualTo(String value) {
            addCriterion("team_updated_user >=", value, "teamUpdatedUser");
            return (Criteria) this;
        }

        public Criteria andTeamUpdatedUserLessThan(String value) {
            addCriterion("team_updated_user <", value, "teamUpdatedUser");
            return (Criteria) this;
        }

        public Criteria andTeamUpdatedUserLessThanOrEqualTo(String value) {
            addCriterion("team_updated_user <=", value, "teamUpdatedUser");
            return (Criteria) this;
        }

        public Criteria andTeamUpdatedUserLike(String value) {
            addCriterion("team_updated_user like", value, "teamUpdatedUser");
            return (Criteria) this;
        }

        public Criteria andTeamUpdatedUserNotLike(String value) {
            addCriterion("team_updated_user not like", value, "teamUpdatedUser");
            return (Criteria) this;
        }

        public Criteria andTeamUpdatedUserIn(List<String> values) {
            addCriterion("team_updated_user in", values, "teamUpdatedUser");
            return (Criteria) this;
        }

        public Criteria andTeamUpdatedUserNotIn(List<String> values) {
            addCriterion("team_updated_user not in", values, "teamUpdatedUser");
            return (Criteria) this;
        }

        public Criteria andTeamUpdatedUserBetween(String value1, String value2) {
            addCriterion("team_updated_user between", value1, value2, "teamUpdatedUser");
            return (Criteria) this;
        }

        public Criteria andTeamUpdatedUserNotBetween(String value1, String value2) {
            addCriterion("team_updated_user not between", value1, value2, "teamUpdatedUser");
            return (Criteria) this;
        }
    }

    /**
     * team
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * team 2018-11-25
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