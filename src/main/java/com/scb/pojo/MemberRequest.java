package com.scb.pojo;

import java.util.Date;

public class MemberRequest {
    /**
     * 成员请求编号
     */
    private String memberRequestId;

    /**
     * 成员请求时间
     */
    private Date memberRequestTime;

    /**
     * 成员请求餐券数量
     */
    private Integer memberRequestNum;

    /**
     * 成员加班开始时间
     */
    private Date memberRequestStart;

    /**
     * 成员加班结束时间
     */
    private Date memberRequestEnd;

    /**
     * 成员请求状态
     */
    private String memberRequestStatus;

    /**
     * 成员的员工编号
     */
    private String employeeId;

    /**
     * 成员请求编号
     * @return member_request_id 成员请求编号
     */
    public String getMemberRequestId() {
        return memberRequestId;
    }

    /**
     * 成员请求编号
     * @param memberRequestId 成员请求编号
     */
    public void setMemberRequestId(String memberRequestId) {
        this.memberRequestId = memberRequestId == null ? null : memberRequestId.trim();
    }

    /**
     * 成员请求时间
     * @return member_request_time 成员请求时间
     */
    public Date getMemberRequestTime() {
        return memberRequestTime;
    }

    /**
     * 成员请求时间
     * @param memberRequestTime 成员请求时间
     */
    public void setMemberRequestTime(Date memberRequestTime) {
        this.memberRequestTime = memberRequestTime;
    }

    /**
     * 成员请求餐券数量
     * @return member_request_num 成员请求餐券数量
     */
    public Integer getMemberRequestNum() {
        return memberRequestNum;
    }

    /**
     * 成员请求餐券数量
     * @param memberRequestNum 成员请求餐券数量
     */
    public void setMemberRequestNum(Integer memberRequestNum) {
        this.memberRequestNum = memberRequestNum;
    }

    /**
     * 成员加班开始时间
     * @return member_request_start 成员加班开始时间
     */
    public Date getMemberRequestStart() {
        return memberRequestStart;
    }

    /**
     * 成员加班开始时间
     * @param memberRequestStart 成员加班开始时间
     */
    public void setMemberRequestStart(Date memberRequestStart) {
        this.memberRequestStart = memberRequestStart;
    }

    /**
     * 成员加班结束时间
     * @return member_request_end 成员加班结束时间
     */
    public Date getMemberRequestEnd() {
        return memberRequestEnd;
    }

    /**
     * 成员加班结束时间
     * @param memberRequestEnd 成员加班结束时间
     */
    public void setMemberRequestEnd(Date memberRequestEnd) {
        this.memberRequestEnd = memberRequestEnd;
    }

    /**
     * 成员请求状态
     * @return member_request_status 成员请求状态
     */
    public String getMemberRequestStatus() {
        return memberRequestStatus;
    }

    /**
     * 成员请求状态
     * @param memberRequestStatus 成员请求状态
     */
    public void setMemberRequestStatus(String memberRequestStatus) {
        this.memberRequestStatus = memberRequestStatus == null ? null : memberRequestStatus.trim();
    }

    /**
     * 成员的员工编号
     * @return employee_id 成员的员工编号
     */
    public String getEmployeeId() {
        return employeeId;
    }

    /**
     * 成员的员工编号
     * @param employeeId 成员的员工编号
     */
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId == null ? null : employeeId.trim();
    }
}