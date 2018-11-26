package com.scb.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EmployeeExample {
    /**
     * employee
     */
    protected String orderByClause;

    /**
     * employee
     */
    protected boolean distinct;

    /**
     * employee
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbg.generated 2018-11-25
     */
    public EmployeeExample() {
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
     * employee 2018-11-25
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

        public Criteria andEmployeeNameIsNull() {
            addCriterion("employee_name is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameIsNotNull() {
            addCriterion("employee_name is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameEqualTo(String value) {
            addCriterion("employee_name =", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameNotEqualTo(String value) {
            addCriterion("employee_name <>", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameGreaterThan(String value) {
            addCriterion("employee_name >", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameGreaterThanOrEqualTo(String value) {
            addCriterion("employee_name >=", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameLessThan(String value) {
            addCriterion("employee_name <", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameLessThanOrEqualTo(String value) {
            addCriterion("employee_name <=", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameLike(String value) {
            addCriterion("employee_name like", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameNotLike(String value) {
            addCriterion("employee_name not like", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameIn(List<String> values) {
            addCriterion("employee_name in", values, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameNotIn(List<String> values) {
            addCriterion("employee_name not in", values, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameBetween(String value1, String value2) {
            addCriterion("employee_name between", value1, value2, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameNotBetween(String value1, String value2) {
            addCriterion("employee_name not between", value1, value2, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNicknameIsNull() {
            addCriterion("employee_nickname is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeNicknameIsNotNull() {
            addCriterion("employee_nickname is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeNicknameEqualTo(String value) {
            addCriterion("employee_nickname =", value, "employeeNickname");
            return (Criteria) this;
        }

        public Criteria andEmployeeNicknameNotEqualTo(String value) {
            addCriterion("employee_nickname <>", value, "employeeNickname");
            return (Criteria) this;
        }

        public Criteria andEmployeeNicknameGreaterThan(String value) {
            addCriterion("employee_nickname >", value, "employeeNickname");
            return (Criteria) this;
        }

        public Criteria andEmployeeNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("employee_nickname >=", value, "employeeNickname");
            return (Criteria) this;
        }

        public Criteria andEmployeeNicknameLessThan(String value) {
            addCriterion("employee_nickname <", value, "employeeNickname");
            return (Criteria) this;
        }

        public Criteria andEmployeeNicknameLessThanOrEqualTo(String value) {
            addCriterion("employee_nickname <=", value, "employeeNickname");
            return (Criteria) this;
        }

        public Criteria andEmployeeNicknameLike(String value) {
            addCriterion("employee_nickname like", value, "employeeNickname");
            return (Criteria) this;
        }

        public Criteria andEmployeeNicknameNotLike(String value) {
            addCriterion("employee_nickname not like", value, "employeeNickname");
            return (Criteria) this;
        }

        public Criteria andEmployeeNicknameIn(List<String> values) {
            addCriterion("employee_nickname in", values, "employeeNickname");
            return (Criteria) this;
        }

        public Criteria andEmployeeNicknameNotIn(List<String> values) {
            addCriterion("employee_nickname not in", values, "employeeNickname");
            return (Criteria) this;
        }

        public Criteria andEmployeeNicknameBetween(String value1, String value2) {
            addCriterion("employee_nickname between", value1, value2, "employeeNickname");
            return (Criteria) this;
        }

        public Criteria andEmployeeNicknameNotBetween(String value1, String value2) {
            addCriterion("employee_nickname not between", value1, value2, "employeeNickname");
            return (Criteria) this;
        }

        public Criteria andEmployeeGenderIsNull() {
            addCriterion("employee_gender is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeGenderIsNotNull() {
            addCriterion("employee_gender is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeGenderEqualTo(String value) {
            addCriterion("employee_gender =", value, "employeeGender");
            return (Criteria) this;
        }

        public Criteria andEmployeeGenderNotEqualTo(String value) {
            addCriterion("employee_gender <>", value, "employeeGender");
            return (Criteria) this;
        }

        public Criteria andEmployeeGenderGreaterThan(String value) {
            addCriterion("employee_gender >", value, "employeeGender");
            return (Criteria) this;
        }

        public Criteria andEmployeeGenderGreaterThanOrEqualTo(String value) {
            addCriterion("employee_gender >=", value, "employeeGender");
            return (Criteria) this;
        }

        public Criteria andEmployeeGenderLessThan(String value) {
            addCriterion("employee_gender <", value, "employeeGender");
            return (Criteria) this;
        }

        public Criteria andEmployeeGenderLessThanOrEqualTo(String value) {
            addCriterion("employee_gender <=", value, "employeeGender");
            return (Criteria) this;
        }

        public Criteria andEmployeeGenderLike(String value) {
            addCriterion("employee_gender like", value, "employeeGender");
            return (Criteria) this;
        }

        public Criteria andEmployeeGenderNotLike(String value) {
            addCriterion("employee_gender not like", value, "employeeGender");
            return (Criteria) this;
        }

        public Criteria andEmployeeGenderIn(List<String> values) {
            addCriterion("employee_gender in", values, "employeeGender");
            return (Criteria) this;
        }

        public Criteria andEmployeeGenderNotIn(List<String> values) {
            addCriterion("employee_gender not in", values, "employeeGender");
            return (Criteria) this;
        }

        public Criteria andEmployeeGenderBetween(String value1, String value2) {
            addCriterion("employee_gender between", value1, value2, "employeeGender");
            return (Criteria) this;
        }

        public Criteria andEmployeeGenderNotBetween(String value1, String value2) {
            addCriterion("employee_gender not between", value1, value2, "employeeGender");
            return (Criteria) this;
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

        public Criteria andEmployeeStatusIsNull() {
            addCriterion("employee_status is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeStatusIsNotNull() {
            addCriterion("employee_status is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeStatusEqualTo(String value) {
            addCriterion("employee_status =", value, "employeeStatus");
            return (Criteria) this;
        }

        public Criteria andEmployeeStatusNotEqualTo(String value) {
            addCriterion("employee_status <>", value, "employeeStatus");
            return (Criteria) this;
        }

        public Criteria andEmployeeStatusGreaterThan(String value) {
            addCriterion("employee_status >", value, "employeeStatus");
            return (Criteria) this;
        }

        public Criteria andEmployeeStatusGreaterThanOrEqualTo(String value) {
            addCriterion("employee_status >=", value, "employeeStatus");
            return (Criteria) this;
        }

        public Criteria andEmployeeStatusLessThan(String value) {
            addCriterion("employee_status <", value, "employeeStatus");
            return (Criteria) this;
        }

        public Criteria andEmployeeStatusLessThanOrEqualTo(String value) {
            addCriterion("employee_status <=", value, "employeeStatus");
            return (Criteria) this;
        }

        public Criteria andEmployeeStatusLike(String value) {
            addCriterion("employee_status like", value, "employeeStatus");
            return (Criteria) this;
        }

        public Criteria andEmployeeStatusNotLike(String value) {
            addCriterion("employee_status not like", value, "employeeStatus");
            return (Criteria) this;
        }

        public Criteria andEmployeeStatusIn(List<String> values) {
            addCriterion("employee_status in", values, "employeeStatus");
            return (Criteria) this;
        }

        public Criteria andEmployeeStatusNotIn(List<String> values) {
            addCriterion("employee_status not in", values, "employeeStatus");
            return (Criteria) this;
        }

        public Criteria andEmployeeStatusBetween(String value1, String value2) {
            addCriterion("employee_status between", value1, value2, "employeeStatus");
            return (Criteria) this;
        }

        public Criteria andEmployeeStatusNotBetween(String value1, String value2) {
            addCriterion("employee_status not between", value1, value2, "employeeStatus");
            return (Criteria) this;
        }

        public Criteria andEmployeeImageIsNull() {
            addCriterion("employee_image is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeImageIsNotNull() {
            addCriterion("employee_image is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeImageEqualTo(String value) {
            addCriterion("employee_image =", value, "employeeImage");
            return (Criteria) this;
        }

        public Criteria andEmployeeImageNotEqualTo(String value) {
            addCriterion("employee_image <>", value, "employeeImage");
            return (Criteria) this;
        }

        public Criteria andEmployeeImageGreaterThan(String value) {
            addCriterion("employee_image >", value, "employeeImage");
            return (Criteria) this;
        }

        public Criteria andEmployeeImageGreaterThanOrEqualTo(String value) {
            addCriterion("employee_image >=", value, "employeeImage");
            return (Criteria) this;
        }

        public Criteria andEmployeeImageLessThan(String value) {
            addCriterion("employee_image <", value, "employeeImage");
            return (Criteria) this;
        }

        public Criteria andEmployeeImageLessThanOrEqualTo(String value) {
            addCriterion("employee_image <=", value, "employeeImage");
            return (Criteria) this;
        }

        public Criteria andEmployeeImageLike(String value) {
            addCriterion("employee_image like", value, "employeeImage");
            return (Criteria) this;
        }

        public Criteria andEmployeeImageNotLike(String value) {
            addCriterion("employee_image not like", value, "employeeImage");
            return (Criteria) this;
        }

        public Criteria andEmployeeImageIn(List<String> values) {
            addCriterion("employee_image in", values, "employeeImage");
            return (Criteria) this;
        }

        public Criteria andEmployeeImageNotIn(List<String> values) {
            addCriterion("employee_image not in", values, "employeeImage");
            return (Criteria) this;
        }

        public Criteria andEmployeeImageBetween(String value1, String value2) {
            addCriterion("employee_image between", value1, value2, "employeeImage");
            return (Criteria) this;
        }

        public Criteria andEmployeeImageNotBetween(String value1, String value2) {
            addCriterion("employee_image not between", value1, value2, "employeeImage");
            return (Criteria) this;
        }

        public Criteria andEmployeeEntrytimeIsNull() {
            addCriterion("employee_entrytime is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeEntrytimeIsNotNull() {
            addCriterion("employee_entrytime is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeEntrytimeEqualTo(Date value) {
            addCriterion("employee_entrytime =", value, "employeeEntrytime");
            return (Criteria) this;
        }

        public Criteria andEmployeeEntrytimeNotEqualTo(Date value) {
            addCriterion("employee_entrytime <>", value, "employeeEntrytime");
            return (Criteria) this;
        }

        public Criteria andEmployeeEntrytimeGreaterThan(Date value) {
            addCriterion("employee_entrytime >", value, "employeeEntrytime");
            return (Criteria) this;
        }

        public Criteria andEmployeeEntrytimeGreaterThanOrEqualTo(Date value) {
            addCriterion("employee_entrytime >=", value, "employeeEntrytime");
            return (Criteria) this;
        }

        public Criteria andEmployeeEntrytimeLessThan(Date value) {
            addCriterion("employee_entrytime <", value, "employeeEntrytime");
            return (Criteria) this;
        }

        public Criteria andEmployeeEntrytimeLessThanOrEqualTo(Date value) {
            addCriterion("employee_entrytime <=", value, "employeeEntrytime");
            return (Criteria) this;
        }

        public Criteria andEmployeeEntrytimeIn(List<Date> values) {
            addCriterion("employee_entrytime in", values, "employeeEntrytime");
            return (Criteria) this;
        }

        public Criteria andEmployeeEntrytimeNotIn(List<Date> values) {
            addCriterion("employee_entrytime not in", values, "employeeEntrytime");
            return (Criteria) this;
        }

        public Criteria andEmployeeEntrytimeBetween(Date value1, Date value2) {
            addCriterion("employee_entrytime between", value1, value2, "employeeEntrytime");
            return (Criteria) this;
        }

        public Criteria andEmployeeEntrytimeNotBetween(Date value1, Date value2) {
            addCriterion("employee_entrytime not between", value1, value2, "employeeEntrytime");
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

        public Criteria andEmployeePhoneIsNull() {
            addCriterion("employee_phone is null");
            return (Criteria) this;
        }

        public Criteria andEmployeePhoneIsNotNull() {
            addCriterion("employee_phone is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeePhoneEqualTo(String value) {
            addCriterion("employee_phone =", value, "employeePhone");
            return (Criteria) this;
        }

        public Criteria andEmployeePhoneNotEqualTo(String value) {
            addCriterion("employee_phone <>", value, "employeePhone");
            return (Criteria) this;
        }

        public Criteria andEmployeePhoneGreaterThan(String value) {
            addCriterion("employee_phone >", value, "employeePhone");
            return (Criteria) this;
        }

        public Criteria andEmployeePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("employee_phone >=", value, "employeePhone");
            return (Criteria) this;
        }

        public Criteria andEmployeePhoneLessThan(String value) {
            addCriterion("employee_phone <", value, "employeePhone");
            return (Criteria) this;
        }

        public Criteria andEmployeePhoneLessThanOrEqualTo(String value) {
            addCriterion("employee_phone <=", value, "employeePhone");
            return (Criteria) this;
        }

        public Criteria andEmployeePhoneLike(String value) {
            addCriterion("employee_phone like", value, "employeePhone");
            return (Criteria) this;
        }

        public Criteria andEmployeePhoneNotLike(String value) {
            addCriterion("employee_phone not like", value, "employeePhone");
            return (Criteria) this;
        }

        public Criteria andEmployeePhoneIn(List<String> values) {
            addCriterion("employee_phone in", values, "employeePhone");
            return (Criteria) this;
        }

        public Criteria andEmployeePhoneNotIn(List<String> values) {
            addCriterion("employee_phone not in", values, "employeePhone");
            return (Criteria) this;
        }

        public Criteria andEmployeePhoneBetween(String value1, String value2) {
            addCriterion("employee_phone between", value1, value2, "employeePhone");
            return (Criteria) this;
        }

        public Criteria andEmployeePhoneNotBetween(String value1, String value2) {
            addCriterion("employee_phone not between", value1, value2, "employeePhone");
            return (Criteria) this;
        }

        public Criteria andEmployeeEmailIsNull() {
            addCriterion("employee_email is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeEmailIsNotNull() {
            addCriterion("employee_email is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeEmailEqualTo(String value) {
            addCriterion("employee_email =", value, "employeeEmail");
            return (Criteria) this;
        }

        public Criteria andEmployeeEmailNotEqualTo(String value) {
            addCriterion("employee_email <>", value, "employeeEmail");
            return (Criteria) this;
        }

        public Criteria andEmployeeEmailGreaterThan(String value) {
            addCriterion("employee_email >", value, "employeeEmail");
            return (Criteria) this;
        }

        public Criteria andEmployeeEmailGreaterThanOrEqualTo(String value) {
            addCriterion("employee_email >=", value, "employeeEmail");
            return (Criteria) this;
        }

        public Criteria andEmployeeEmailLessThan(String value) {
            addCriterion("employee_email <", value, "employeeEmail");
            return (Criteria) this;
        }

        public Criteria andEmployeeEmailLessThanOrEqualTo(String value) {
            addCriterion("employee_email <=", value, "employeeEmail");
            return (Criteria) this;
        }

        public Criteria andEmployeeEmailLike(String value) {
            addCriterion("employee_email like", value, "employeeEmail");
            return (Criteria) this;
        }

        public Criteria andEmployeeEmailNotLike(String value) {
            addCriterion("employee_email not like", value, "employeeEmail");
            return (Criteria) this;
        }

        public Criteria andEmployeeEmailIn(List<String> values) {
            addCriterion("employee_email in", values, "employeeEmail");
            return (Criteria) this;
        }

        public Criteria andEmployeeEmailNotIn(List<String> values) {
            addCriterion("employee_email not in", values, "employeeEmail");
            return (Criteria) this;
        }

        public Criteria andEmployeeEmailBetween(String value1, String value2) {
            addCriterion("employee_email between", value1, value2, "employeeEmail");
            return (Criteria) this;
        }

        public Criteria andEmployeeEmailNotBetween(String value1, String value2) {
            addCriterion("employee_email not between", value1, value2, "employeeEmail");
            return (Criteria) this;
        }

        public Criteria andEmployeeLandlineIsNull() {
            addCriterion("employee_landline is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeLandlineIsNotNull() {
            addCriterion("employee_landline is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeLandlineEqualTo(String value) {
            addCriterion("employee_landline =", value, "employeeLandline");
            return (Criteria) this;
        }

        public Criteria andEmployeeLandlineNotEqualTo(String value) {
            addCriterion("employee_landline <>", value, "employeeLandline");
            return (Criteria) this;
        }

        public Criteria andEmployeeLandlineGreaterThan(String value) {
            addCriterion("employee_landline >", value, "employeeLandline");
            return (Criteria) this;
        }

        public Criteria andEmployeeLandlineGreaterThanOrEqualTo(String value) {
            addCriterion("employee_landline >=", value, "employeeLandline");
            return (Criteria) this;
        }

        public Criteria andEmployeeLandlineLessThan(String value) {
            addCriterion("employee_landline <", value, "employeeLandline");
            return (Criteria) this;
        }

        public Criteria andEmployeeLandlineLessThanOrEqualTo(String value) {
            addCriterion("employee_landline <=", value, "employeeLandline");
            return (Criteria) this;
        }

        public Criteria andEmployeeLandlineLike(String value) {
            addCriterion("employee_landline like", value, "employeeLandline");
            return (Criteria) this;
        }

        public Criteria andEmployeeLandlineNotLike(String value) {
            addCriterion("employee_landline not like", value, "employeeLandline");
            return (Criteria) this;
        }

        public Criteria andEmployeeLandlineIn(List<String> values) {
            addCriterion("employee_landline in", values, "employeeLandline");
            return (Criteria) this;
        }

        public Criteria andEmployeeLandlineNotIn(List<String> values) {
            addCriterion("employee_landline not in", values, "employeeLandline");
            return (Criteria) this;
        }

        public Criteria andEmployeeLandlineBetween(String value1, String value2) {
            addCriterion("employee_landline between", value1, value2, "employeeLandline");
            return (Criteria) this;
        }

        public Criteria andEmployeeLandlineNotBetween(String value1, String value2) {
            addCriterion("employee_landline not between", value1, value2, "employeeLandline");
            return (Criteria) this;
        }

        public Criteria andEmployeeUpdatedTimeIsNull() {
            addCriterion("employee_updated_time is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeUpdatedTimeIsNotNull() {
            addCriterion("employee_updated_time is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeUpdatedTimeEqualTo(Date value) {
            addCriterion("employee_updated_time =", value, "employeeUpdatedTime");
            return (Criteria) this;
        }

        public Criteria andEmployeeUpdatedTimeNotEqualTo(Date value) {
            addCriterion("employee_updated_time <>", value, "employeeUpdatedTime");
            return (Criteria) this;
        }

        public Criteria andEmployeeUpdatedTimeGreaterThan(Date value) {
            addCriterion("employee_updated_time >", value, "employeeUpdatedTime");
            return (Criteria) this;
        }

        public Criteria andEmployeeUpdatedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("employee_updated_time >=", value, "employeeUpdatedTime");
            return (Criteria) this;
        }

        public Criteria andEmployeeUpdatedTimeLessThan(Date value) {
            addCriterion("employee_updated_time <", value, "employeeUpdatedTime");
            return (Criteria) this;
        }

        public Criteria andEmployeeUpdatedTimeLessThanOrEqualTo(Date value) {
            addCriterion("employee_updated_time <=", value, "employeeUpdatedTime");
            return (Criteria) this;
        }

        public Criteria andEmployeeUpdatedTimeIn(List<Date> values) {
            addCriterion("employee_updated_time in", values, "employeeUpdatedTime");
            return (Criteria) this;
        }

        public Criteria andEmployeeUpdatedTimeNotIn(List<Date> values) {
            addCriterion("employee_updated_time not in", values, "employeeUpdatedTime");
            return (Criteria) this;
        }

        public Criteria andEmployeeUpdatedTimeBetween(Date value1, Date value2) {
            addCriterion("employee_updated_time between", value1, value2, "employeeUpdatedTime");
            return (Criteria) this;
        }

        public Criteria andEmployeeUpdatedTimeNotBetween(Date value1, Date value2) {
            addCriterion("employee_updated_time not between", value1, value2, "employeeUpdatedTime");
            return (Criteria) this;
        }

        public Criteria andEmployeeCreatedUserIsNull() {
            addCriterion("employee_created_user is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeCreatedUserIsNotNull() {
            addCriterion("employee_created_user is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeCreatedUserEqualTo(String value) {
            addCriterion("employee_created_user =", value, "employeeCreatedUser");
            return (Criteria) this;
        }

        public Criteria andEmployeeCreatedUserNotEqualTo(String value) {
            addCriterion("employee_created_user <>", value, "employeeCreatedUser");
            return (Criteria) this;
        }

        public Criteria andEmployeeCreatedUserGreaterThan(String value) {
            addCriterion("employee_created_user >", value, "employeeCreatedUser");
            return (Criteria) this;
        }

        public Criteria andEmployeeCreatedUserGreaterThanOrEqualTo(String value) {
            addCriterion("employee_created_user >=", value, "employeeCreatedUser");
            return (Criteria) this;
        }

        public Criteria andEmployeeCreatedUserLessThan(String value) {
            addCriterion("employee_created_user <", value, "employeeCreatedUser");
            return (Criteria) this;
        }

        public Criteria andEmployeeCreatedUserLessThanOrEqualTo(String value) {
            addCriterion("employee_created_user <=", value, "employeeCreatedUser");
            return (Criteria) this;
        }

        public Criteria andEmployeeCreatedUserLike(String value) {
            addCriterion("employee_created_user like", value, "employeeCreatedUser");
            return (Criteria) this;
        }

        public Criteria andEmployeeCreatedUserNotLike(String value) {
            addCriterion("employee_created_user not like", value, "employeeCreatedUser");
            return (Criteria) this;
        }

        public Criteria andEmployeeCreatedUserIn(List<String> values) {
            addCriterion("employee_created_user in", values, "employeeCreatedUser");
            return (Criteria) this;
        }

        public Criteria andEmployeeCreatedUserNotIn(List<String> values) {
            addCriterion("employee_created_user not in", values, "employeeCreatedUser");
            return (Criteria) this;
        }

        public Criteria andEmployeeCreatedUserBetween(String value1, String value2) {
            addCriterion("employee_created_user between", value1, value2, "employeeCreatedUser");
            return (Criteria) this;
        }

        public Criteria andEmployeeCreatedUserNotBetween(String value1, String value2) {
            addCriterion("employee_created_user not between", value1, value2, "employeeCreatedUser");
            return (Criteria) this;
        }

        public Criteria andEmployeeCreatedTimeIsNull() {
            addCriterion("employee_created_time is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeCreatedTimeIsNotNull() {
            addCriterion("employee_created_time is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeCreatedTimeEqualTo(Date value) {
            addCriterion("employee_created_time =", value, "employeeCreatedTime");
            return (Criteria) this;
        }

        public Criteria andEmployeeCreatedTimeNotEqualTo(Date value) {
            addCriterion("employee_created_time <>", value, "employeeCreatedTime");
            return (Criteria) this;
        }

        public Criteria andEmployeeCreatedTimeGreaterThan(Date value) {
            addCriterion("employee_created_time >", value, "employeeCreatedTime");
            return (Criteria) this;
        }

        public Criteria andEmployeeCreatedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("employee_created_time >=", value, "employeeCreatedTime");
            return (Criteria) this;
        }

        public Criteria andEmployeeCreatedTimeLessThan(Date value) {
            addCriterion("employee_created_time <", value, "employeeCreatedTime");
            return (Criteria) this;
        }

        public Criteria andEmployeeCreatedTimeLessThanOrEqualTo(Date value) {
            addCriterion("employee_created_time <=", value, "employeeCreatedTime");
            return (Criteria) this;
        }

        public Criteria andEmployeeCreatedTimeIn(List<Date> values) {
            addCriterion("employee_created_time in", values, "employeeCreatedTime");
            return (Criteria) this;
        }

        public Criteria andEmployeeCreatedTimeNotIn(List<Date> values) {
            addCriterion("employee_created_time not in", values, "employeeCreatedTime");
            return (Criteria) this;
        }

        public Criteria andEmployeeCreatedTimeBetween(Date value1, Date value2) {
            addCriterion("employee_created_time between", value1, value2, "employeeCreatedTime");
            return (Criteria) this;
        }

        public Criteria andEmployeeCreatedTimeNotBetween(Date value1, Date value2) {
            addCriterion("employee_created_time not between", value1, value2, "employeeCreatedTime");
            return (Criteria) this;
        }

        public Criteria andEmployeeUpdatedUserIsNull() {
            addCriterion("employee_updated_user is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeUpdatedUserIsNotNull() {
            addCriterion("employee_updated_user is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeUpdatedUserEqualTo(String value) {
            addCriterion("employee_updated_user =", value, "employeeUpdatedUser");
            return (Criteria) this;
        }

        public Criteria andEmployeeUpdatedUserNotEqualTo(String value) {
            addCriterion("employee_updated_user <>", value, "employeeUpdatedUser");
            return (Criteria) this;
        }

        public Criteria andEmployeeUpdatedUserGreaterThan(String value) {
            addCriterion("employee_updated_user >", value, "employeeUpdatedUser");
            return (Criteria) this;
        }

        public Criteria andEmployeeUpdatedUserGreaterThanOrEqualTo(String value) {
            addCriterion("employee_updated_user >=", value, "employeeUpdatedUser");
            return (Criteria) this;
        }

        public Criteria andEmployeeUpdatedUserLessThan(String value) {
            addCriterion("employee_updated_user <", value, "employeeUpdatedUser");
            return (Criteria) this;
        }

        public Criteria andEmployeeUpdatedUserLessThanOrEqualTo(String value) {
            addCriterion("employee_updated_user <=", value, "employeeUpdatedUser");
            return (Criteria) this;
        }

        public Criteria andEmployeeUpdatedUserLike(String value) {
            addCriterion("employee_updated_user like", value, "employeeUpdatedUser");
            return (Criteria) this;
        }

        public Criteria andEmployeeUpdatedUserNotLike(String value) {
            addCriterion("employee_updated_user not like", value, "employeeUpdatedUser");
            return (Criteria) this;
        }

        public Criteria andEmployeeUpdatedUserIn(List<String> values) {
            addCriterion("employee_updated_user in", values, "employeeUpdatedUser");
            return (Criteria) this;
        }

        public Criteria andEmployeeUpdatedUserNotIn(List<String> values) {
            addCriterion("employee_updated_user not in", values, "employeeUpdatedUser");
            return (Criteria) this;
        }

        public Criteria andEmployeeUpdatedUserBetween(String value1, String value2) {
            addCriterion("employee_updated_user between", value1, value2, "employeeUpdatedUser");
            return (Criteria) this;
        }

        public Criteria andEmployeeUpdatedUserNotBetween(String value1, String value2) {
            addCriterion("employee_updated_user not between", value1, value2, "employeeUpdatedUser");
            return (Criteria) this;
        }
    }

    /**
     * employee
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * employee 2018-11-25
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