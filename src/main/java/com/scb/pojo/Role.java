package com.scb.pojo;

import java.util.Date;

public class Role {
    /**
     * 角色编号
     */
    private String roleId;

    /**
     * 角色名称
     */
    private String roleName;

    /**
     * 角色更新时间
     */
    private Date roleUpdatedTime;

    /**
     * 角色创建人
     */
    private String roleCreatedUser;

    /**
     * 角色创建时间
     */
    private Date roleCreatedTime;

    /**
     * 角色更新人
     */
    private String roleUpdatedUser;

    /**
     * 角色编号
     * @return role_id 角色编号
     */
    public String getRoleId() {
        return roleId;
    }

    /**
     * 角色编号
     * @param roleId 角色编号
     */
    public void setRoleId(String roleId) {
        this.roleId = roleId == null ? null : roleId.trim();
    }

    /**
     * 角色名称
     * @return role_name 角色名称
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * 角色名称
     * @param roleName 角色名称
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    /**
     * 角色更新时间
     * @return role_updated_time 角色更新时间
     */
    public Date getRoleUpdatedTime() {
        return roleUpdatedTime;
    }

    /**
     * 角色更新时间
     * @param roleUpdatedTime 角色更新时间
     */
    public void setRoleUpdatedTime(Date roleUpdatedTime) {
        this.roleUpdatedTime = roleUpdatedTime;
    }

    /**
     * 角色创建人
     * @return role_created_user 角色创建人
     */
    public String getRoleCreatedUser() {
        return roleCreatedUser;
    }

    /**
     * 角色创建人
     * @param roleCreatedUser 角色创建人
     */
    public void setRoleCreatedUser(String roleCreatedUser) {
        this.roleCreatedUser = roleCreatedUser == null ? null : roleCreatedUser.trim();
    }

    /**
     * 角色创建时间
     * @return role_created_time 角色创建时间
     */
    public Date getRoleCreatedTime() {
        return roleCreatedTime;
    }

    /**
     * 角色创建时间
     * @param roleCreatedTime 角色创建时间
     */
    public void setRoleCreatedTime(Date roleCreatedTime) {
        this.roleCreatedTime = roleCreatedTime;
    }

    /**
     * 角色更新人
     * @return role_updated_user 角色更新人
     */
    public String getRoleUpdatedUser() {
        return roleUpdatedUser;
    }

    /**
     * 角色更新人
     * @param roleUpdatedUser 角色更新人
     */
    public void setRoleUpdatedUser(String roleUpdatedUser) {
        this.roleUpdatedUser = roleUpdatedUser == null ? null : roleUpdatedUser.trim();
    }
}