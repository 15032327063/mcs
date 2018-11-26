package com.scb.pojo;

import java.util.Date;

public class Employee {
    /**
     * 员工编号
     */
    private String employeeId;

    /**
     * 员工姓名
     */
    private String employeeName;

    /**
     * 员工昵称
     */
    private String employeeNickname;

    /**
     * 员工性别
     */
    private String employeeGender;

    /**
     * 员工角色编号
     */
    private String roleId;

    /**
     * 员工状态
     */
    private String employeeStatus;

    /**
     * 员工照片
     */
    private String employeeImage;

    /**
     * 员工入职时间
     */
    private Date employeeEntrytime;

    /**
     * 员工team编号
     */
    private String teamId;

    /**
     * 员工手机号
     */
    private String employeePhone;

    /**
     * 员工邮箱
     */
    private String employeeEmail;

    /**
     * 员工座机号
     */
    private String employeeLandline;

    /**
     * 员工更新时间
     */
    private Date employeeUpdatedTime;

    /**
     * 员工创建人
     */
    private String employeeCreatedUser;

    /**
     * 员工创建时间
     */
    private Date employeeCreatedTime;

    /**
     * 员工更新人
     */
    private String employeeUpdatedUser;

    /**
     * 员工编号
     * @return employee_id 员工编号
     */
    public String getEmployeeId() {
        return employeeId;
    }

    /**
     * 员工编号
     * @param employeeId 员工编号
     */
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId == null ? null : employeeId.trim();
    }

    /**
     * 员工姓名
     * @return employee_name 员工姓名
     */
    public String getEmployeeName() {
        return employeeName;
    }

    /**
     * 员工姓名
     * @param employeeName 员工姓名
     */
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName == null ? null : employeeName.trim();
    }

    /**
     * 员工昵称
     * @return employee_nickname 员工昵称
     */
    public String getEmployeeNickname() {
        return employeeNickname;
    }

    /**
     * 员工昵称
     * @param employeeNickname 员工昵称
     */
    public void setEmployeeNickname(String employeeNickname) {
        this.employeeNickname = employeeNickname == null ? null : employeeNickname.trim();
    }

    /**
     * 员工性别
     * @return employee_gender 员工性别
     */
    public String getEmployeeGender() {
        return employeeGender;
    }

    /**
     * 员工性别
     * @param employeeGender 员工性别
     */
    public void setEmployeeGender(String employeeGender) {
        this.employeeGender = employeeGender == null ? null : employeeGender.trim();
    }

    /**
     * 员工角色编号
     * @return role_id 员工角色编号
     */
    public String getRoleId() {
        return roleId;
    }

    /**
     * 员工角色编号
     * @param roleId 员工角色编号
     */
    public void setRoleId(String roleId) {
        this.roleId = roleId == null ? null : roleId.trim();
    }

    /**
     * 员工状态
     * @return employee_status 员工状态
     */
    public String getEmployeeStatus() {
        return employeeStatus;
    }

    /**
     * 员工状态
     * @param employeeStatus 员工状态
     */
    public void setEmployeeStatus(String employeeStatus) {
        this.employeeStatus = employeeStatus == null ? null : employeeStatus.trim();
    }

    /**
     * 员工照片
     * @return employee_image 员工照片
     */
    public String getEmployeeImage() {
        return employeeImage;
    }

    /**
     * 员工照片
     * @param employeeImage 员工照片
     */
    public void setEmployeeImage(String employeeImage) {
        this.employeeImage = employeeImage == null ? null : employeeImage.trim();
    }

    /**
     * 员工入职时间
     * @return employee_entrytime 员工入职时间
     */
    public Date getEmployeeEntrytime() {
        return employeeEntrytime;
    }

    /**
     * 员工入职时间
     * @param employeeEntrytime 员工入职时间
     */
    public void setEmployeeEntrytime(Date employeeEntrytime) {
        this.employeeEntrytime = employeeEntrytime;
    }

    /**
     * 员工team编号
     * @return team_id 员工team编号
     */
    public String getTeamId() {
        return teamId;
    }

    /**
     * 员工team编号
     * @param teamId 员工team编号
     */
    public void setTeamId(String teamId) {
        this.teamId = teamId == null ? null : teamId.trim();
    }

    /**
     * 
     * @return employee_phone 
     */
    public String getEmployeePhone() {
        return employeePhone;
    }

    /**
     * 
     * @param employeePhone 
     */
    public void setEmployeePhone(String employeePhone) {
        this.employeePhone = employeePhone == null ? null : employeePhone.trim();
    }

    /**
     * 
     * @return employee_email 
     */
    public String getEmployeeEmail() {
        return employeeEmail;
    }

    /**
     * 
     * @param employeeEmail 
     */
    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail == null ? null : employeeEmail.trim();
    }

    /**
     * 
     * @return employee_landline 
     */
    public String getEmployeeLandline() {
        return employeeLandline;
    }

    /**
     * 
     * @param employeeLandline 
     */
    public void setEmployeeLandline(String employeeLandline) {
        this.employeeLandline = employeeLandline == null ? null : employeeLandline.trim();
    }

    /**
     * 员工更新时间
     * @return employee_updated_time 员工更新时间
     */
    public Date getEmployeeUpdatedTime() {
        return employeeUpdatedTime;
    }

    /**
     * 员工更新时间
     * @param employeeUpdatedTime 员工更新时间
     */
    public void setEmployeeUpdatedTime(Date employeeUpdatedTime) {
        this.employeeUpdatedTime = employeeUpdatedTime;
    }

    /**
     * 员工创建人
     * @return employee_created_user 员工创建人
     */
    public String getEmployeeCreatedUser() {
        return employeeCreatedUser;
    }

    /**
     * 员工创建人
     * @param employeeCreatedUser 员工创建人
     */
    public void setEmployeeCreatedUser(String employeeCreatedUser) {
        this.employeeCreatedUser = employeeCreatedUser == null ? null : employeeCreatedUser.trim();
    }

    /**
     * 员工创建时间
     * @return employee_created_time 员工创建时间
     */
    public Date getEmployeeCreatedTime() {
        return employeeCreatedTime;
    }

    /**
     * 员工创建时间
     * @param employeeCreatedTime 员工创建时间
     */
    public void setEmployeeCreatedTime(Date employeeCreatedTime) {
        this.employeeCreatedTime = employeeCreatedTime;
    }

    /**
     * 员工更新人
     * @return employee_updated_user 员工更新人
     */
    public String getEmployeeUpdatedUser() {
        return employeeUpdatedUser;
    }

    /**
     * 员工更新人
     * @param employeeUpdatedUser 员工更新人
     */
    public void setEmployeeUpdatedUser(String employeeUpdatedUser) {
        this.employeeUpdatedUser = employeeUpdatedUser == null ? null : employeeUpdatedUser.trim();
    }
}