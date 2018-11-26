package com.scb.pojo;

import java.util.Date;

public class LeaderRequest {
    /**
     * leader请求编号
     */
    private String leaderRequestId;

    /**
     * leader请求时间
     */
    private Date leaderRequestTime;

    /**
     * leader请求的餐券数量
     */
    private Integer leaderRequestNum;

    /**
     * leader请求餐票目标月份
     */
    private Date leaderRequestDate;

    /**
     * leader请求的状态
     */
    private String leaderRequestStatus;

    /**
     * 发出请求的leader的员工编号
     */
    private String employeeId;

    /**
     * leader请求编号
     * @return leader_request_id leader请求编号
     */
    public String getLeaderRequestId() {
        return leaderRequestId;
    }

    /**
     * leader请求编号
     * @param leaderRequestId leader请求编号
     */
    public void setLeaderRequestId(String leaderRequestId) {
        this.leaderRequestId = leaderRequestId == null ? null : leaderRequestId.trim();
    }

    /**
     * leader请求时间
     * @return leader_request_time leader请求时间
     */
    public Date getLeaderRequestTime() {
        return leaderRequestTime;
    }

    /**
     * leader请求时间
     * @param leaderRequestTime leader请求时间
     */
    public void setLeaderRequestTime(Date leaderRequestTime) {
        this.leaderRequestTime = leaderRequestTime;
    }

    /**
     * leader请求的餐券数量
     * @return leader_request_num leader请求的餐券数量
     */
    public Integer getLeaderRequestNum() {
        return leaderRequestNum;
    }

    /**
     * leader请求的餐券数量
     * @param leaderRequestNum leader请求的餐券数量
     */
    public void setLeaderRequestNum(Integer leaderRequestNum) {
        this.leaderRequestNum = leaderRequestNum;
    }

    /**
     * leader请求餐票目标月份
     * @return leader_request_date leader请求餐票目标月份
     */
    public Date getLeaderRequestDate() {
        return leaderRequestDate;
    }

    /**
     * leader请求餐票目标月份
     * @param leaderRequestDate leader请求餐票目标月份
     */
    public void setLeaderRequestDate(Date leaderRequestDate) {
        this.leaderRequestDate = leaderRequestDate;
    }

    /**
     * leader请求的状态
     * @return leader_request_status leader请求的状态
     */
    public String getLeaderRequestStatus() {
        return leaderRequestStatus;
    }

    /**
     * leader请求的状态
     * @param leaderRequestStatus leader请求的状态
     */
    public void setLeaderRequestStatus(String leaderRequestStatus) {
        this.leaderRequestStatus = leaderRequestStatus == null ? null : leaderRequestStatus.trim();
    }

    /**
     * 发出请求的leader的员工编号
     * @return employee_id 发出请求的leader的员工编号
     */
    public String getEmployeeId() {
        return employeeId;
    }

    /**
     * 发出请求的leader的员工编号
     * @param employeeId 发出请求的leader的员工编号
     */
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId == null ? null : employeeId.trim();
    }
}