package com.scb.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class McRecordExample {
    /**
     * mc_record
     */
    protected String orderByClause;

    /**
     * mc_record
     */
    protected boolean distinct;

    /**
     * mc_record
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbg.generated 2018-11-25
     */
    public McRecordExample() {
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
     * mc_record 2018-11-25
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

        public Criteria andMcRecordIdIsNull() {
            addCriterion("mc_record_id is null");
            return (Criteria) this;
        }

        public Criteria andMcRecordIdIsNotNull() {
            addCriterion("mc_record_id is not null");
            return (Criteria) this;
        }

        public Criteria andMcRecordIdEqualTo(String value) {
            addCriterion("mc_record_id =", value, "mcRecordId");
            return (Criteria) this;
        }

        public Criteria andMcRecordIdNotEqualTo(String value) {
            addCriterion("mc_record_id <>", value, "mcRecordId");
            return (Criteria) this;
        }

        public Criteria andMcRecordIdGreaterThan(String value) {
            addCriterion("mc_record_id >", value, "mcRecordId");
            return (Criteria) this;
        }

        public Criteria andMcRecordIdGreaterThanOrEqualTo(String value) {
            addCriterion("mc_record_id >=", value, "mcRecordId");
            return (Criteria) this;
        }

        public Criteria andMcRecordIdLessThan(String value) {
            addCriterion("mc_record_id <", value, "mcRecordId");
            return (Criteria) this;
        }

        public Criteria andMcRecordIdLessThanOrEqualTo(String value) {
            addCriterion("mc_record_id <=", value, "mcRecordId");
            return (Criteria) this;
        }

        public Criteria andMcRecordIdLike(String value) {
            addCriterion("mc_record_id like", value, "mcRecordId");
            return (Criteria) this;
        }

        public Criteria andMcRecordIdNotLike(String value) {
            addCriterion("mc_record_id not like", value, "mcRecordId");
            return (Criteria) this;
        }

        public Criteria andMcRecordIdIn(List<String> values) {
            addCriterion("mc_record_id in", values, "mcRecordId");
            return (Criteria) this;
        }

        public Criteria andMcRecordIdNotIn(List<String> values) {
            addCriterion("mc_record_id not in", values, "mcRecordId");
            return (Criteria) this;
        }

        public Criteria andMcRecordIdBetween(String value1, String value2) {
            addCriterion("mc_record_id between", value1, value2, "mcRecordId");
            return (Criteria) this;
        }

        public Criteria andMcRecordIdNotBetween(String value1, String value2) {
            addCriterion("mc_record_id not between", value1, value2, "mcRecordId");
            return (Criteria) this;
        }

        public Criteria andMcRecordDateIsNull() {
            addCriterion("mc_record_date is null");
            return (Criteria) this;
        }

        public Criteria andMcRecordDateIsNotNull() {
            addCriterion("mc_record_date is not null");
            return (Criteria) this;
        }

        public Criteria andMcRecordDateEqualTo(Date value) {
            addCriterion("mc_record_date =", value, "mcRecordDate");
            return (Criteria) this;
        }

        public Criteria andMcRecordDateNotEqualTo(Date value) {
            addCriterion("mc_record_date <>", value, "mcRecordDate");
            return (Criteria) this;
        }

        public Criteria andMcRecordDateGreaterThan(Date value) {
            addCriterion("mc_record_date >", value, "mcRecordDate");
            return (Criteria) this;
        }

        public Criteria andMcRecordDateGreaterThanOrEqualTo(Date value) {
            addCriterion("mc_record_date >=", value, "mcRecordDate");
            return (Criteria) this;
        }

        public Criteria andMcRecordDateLessThan(Date value) {
            addCriterion("mc_record_date <", value, "mcRecordDate");
            return (Criteria) this;
        }

        public Criteria andMcRecordDateLessThanOrEqualTo(Date value) {
            addCriterion("mc_record_date <=", value, "mcRecordDate");
            return (Criteria) this;
        }

        public Criteria andMcRecordDateIn(List<Date> values) {
            addCriterion("mc_record_date in", values, "mcRecordDate");
            return (Criteria) this;
        }

        public Criteria andMcRecordDateNotIn(List<Date> values) {
            addCriterion("mc_record_date not in", values, "mcRecordDate");
            return (Criteria) this;
        }

        public Criteria andMcRecordDateBetween(Date value1, Date value2) {
            addCriterion("mc_record_date between", value1, value2, "mcRecordDate");
            return (Criteria) this;
        }

        public Criteria andMcRecordDateNotBetween(Date value1, Date value2) {
            addCriterion("mc_record_date not between", value1, value2, "mcRecordDate");
            return (Criteria) this;
        }

        public Criteria andMcRecordSumnumIsNull() {
            addCriterion("mc_record_sumnum is null");
            return (Criteria) this;
        }

        public Criteria andMcRecordSumnumIsNotNull() {
            addCriterion("mc_record_sumnum is not null");
            return (Criteria) this;
        }

        public Criteria andMcRecordSumnumEqualTo(Integer value) {
            addCriterion("mc_record_sumnum =", value, "mcRecordSumnum");
            return (Criteria) this;
        }

        public Criteria andMcRecordSumnumNotEqualTo(Integer value) {
            addCriterion("mc_record_sumnum <>", value, "mcRecordSumnum");
            return (Criteria) this;
        }

        public Criteria andMcRecordSumnumGreaterThan(Integer value) {
            addCriterion("mc_record_sumnum >", value, "mcRecordSumnum");
            return (Criteria) this;
        }

        public Criteria andMcRecordSumnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("mc_record_sumnum >=", value, "mcRecordSumnum");
            return (Criteria) this;
        }

        public Criteria andMcRecordSumnumLessThan(Integer value) {
            addCriterion("mc_record_sumnum <", value, "mcRecordSumnum");
            return (Criteria) this;
        }

        public Criteria andMcRecordSumnumLessThanOrEqualTo(Integer value) {
            addCriterion("mc_record_sumnum <=", value, "mcRecordSumnum");
            return (Criteria) this;
        }

        public Criteria andMcRecordSumnumIn(List<Integer> values) {
            addCriterion("mc_record_sumnum in", values, "mcRecordSumnum");
            return (Criteria) this;
        }

        public Criteria andMcRecordSumnumNotIn(List<Integer> values) {
            addCriterion("mc_record_sumnum not in", values, "mcRecordSumnum");
            return (Criteria) this;
        }

        public Criteria andMcRecordSumnumBetween(Integer value1, Integer value2) {
            addCriterion("mc_record_sumnum between", value1, value2, "mcRecordSumnum");
            return (Criteria) this;
        }

        public Criteria andMcRecordSumnumNotBetween(Integer value1, Integer value2) {
            addCriterion("mc_record_sumnum not between", value1, value2, "mcRecordSumnum");
            return (Criteria) this;
        }

        public Criteria andMcRecordRemainIsNull() {
            addCriterion("mc_record_remain is null");
            return (Criteria) this;
        }

        public Criteria andMcRecordRemainIsNotNull() {
            addCriterion("mc_record_remain is not null");
            return (Criteria) this;
        }

        public Criteria andMcRecordRemainEqualTo(Integer value) {
            addCriterion("mc_record_remain =", value, "mcRecordRemain");
            return (Criteria) this;
        }

        public Criteria andMcRecordRemainNotEqualTo(Integer value) {
            addCriterion("mc_record_remain <>", value, "mcRecordRemain");
            return (Criteria) this;
        }

        public Criteria andMcRecordRemainGreaterThan(Integer value) {
            addCriterion("mc_record_remain >", value, "mcRecordRemain");
            return (Criteria) this;
        }

        public Criteria andMcRecordRemainGreaterThanOrEqualTo(Integer value) {
            addCriterion("mc_record_remain >=", value, "mcRecordRemain");
            return (Criteria) this;
        }

        public Criteria andMcRecordRemainLessThan(Integer value) {
            addCriterion("mc_record_remain <", value, "mcRecordRemain");
            return (Criteria) this;
        }

        public Criteria andMcRecordRemainLessThanOrEqualTo(Integer value) {
            addCriterion("mc_record_remain <=", value, "mcRecordRemain");
            return (Criteria) this;
        }

        public Criteria andMcRecordRemainIn(List<Integer> values) {
            addCriterion("mc_record_remain in", values, "mcRecordRemain");
            return (Criteria) this;
        }

        public Criteria andMcRecordRemainNotIn(List<Integer> values) {
            addCriterion("mc_record_remain not in", values, "mcRecordRemain");
            return (Criteria) this;
        }

        public Criteria andMcRecordRemainBetween(Integer value1, Integer value2) {
            addCriterion("mc_record_remain between", value1, value2, "mcRecordRemain");
            return (Criteria) this;
        }

        public Criteria andMcRecordRemainNotBetween(Integer value1, Integer value2) {
            addCriterion("mc_record_remain not between", value1, value2, "mcRecordRemain");
            return (Criteria) this;
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
    }

    /**
     * mc_record
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * mc_record 2018-11-25
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