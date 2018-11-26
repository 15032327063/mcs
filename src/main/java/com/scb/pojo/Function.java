package com.scb.pojo;

import java.util.Date;

public class Function {
    /**
     * 功能编号
     */
    private String functionId;

    /**
     * 功能名称
     */
    private String functionName;

    /**
     * 功能更新时间
     */
    private Date functionUpdatedTime;

    /**
     * 功能创建人
     */
    private String functionCreatedUser;

    /**
     * 功能创建时间
     */
    private Date functionCreatedTime;

    /**
     * 功能更新人
     */
    private String functionUpdatedUser;

    /**
     * 功能编号
     * @return function_id 功能编号
     */
    public String getFunctionId() {
        return functionId;
    }

    /**
     * 功能编号
     * @param functionId 功能编号
     */
    public void setFunctionId(String functionId) {
        this.functionId = functionId == null ? null : functionId.trim();
    }

    /**
     * 功能名称
     * @return function_name 功能名称
     */
    public String getFunctionName() {
        return functionName;
    }

    /**
     * 功能名称
     * @param functionName 功能名称
     */
    public void setFunctionName(String functionName) {
        this.functionName = functionName == null ? null : functionName.trim();
    }

    /**
     * 功能更新时间
     * @return function_updated_time 功能更新时间
     */
    public Date getFunctionUpdatedTime() {
        return functionUpdatedTime;
    }

    /**
     * 功能更新时间
     * @param functionUpdatedTime 功能更新时间
     */
    public void setFunctionUpdatedTime(Date functionUpdatedTime) {
        this.functionUpdatedTime = functionUpdatedTime;
    }

    /**
     * 功能创建人
     * @return function_created_user 功能创建人
     */
    public String getFunctionCreatedUser() {
        return functionCreatedUser;
    }

    /**
     * 功能创建人
     * @param functionCreatedUser 功能创建人
     */
    public void setFunctionCreatedUser(String functionCreatedUser) {
        this.functionCreatedUser = functionCreatedUser == null ? null : functionCreatedUser.trim();
    }

    /**
     * 功能创建时间
     * @return function_created_time 功能创建时间
     */
    public Date getFunctionCreatedTime() {
        return functionCreatedTime;
    }

    /**
     * 功能创建时间
     * @param functionCreatedTime 功能创建时间
     */
    public void setFunctionCreatedTime(Date functionCreatedTime) {
        this.functionCreatedTime = functionCreatedTime;
    }

    /**
     * 功能更新人
     * @return function_updated_user 功能更新人
     */
    public String getFunctionUpdatedUser() {
        return functionUpdatedUser;
    }

    /**
     * 功能更新人
     * @param functionUpdatedUser 功能更新人
     */
    public void setFunctionUpdatedUser(String functionUpdatedUser) {
        this.functionUpdatedUser = functionUpdatedUser == null ? null : functionUpdatedUser.trim();
    }
}