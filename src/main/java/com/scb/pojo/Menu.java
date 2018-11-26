package com.scb.pojo;

import java.util.Date;

public class Menu {
    /**
     * 菜单编号
     */
    private String menuId;

    /**
     * 菜单名称
     */
    private String menuName;

    /**
     * 菜单更新时间
     */
    private Date menuUpdatedTime;

    /**
     * 菜单创建人
     */
    private String menuCreatedUser;

    /**
     * 菜单创建时间
     */
    private Date menuCreatedTime;

    /**
     * 菜单更新人
     */
    private String menuUpdatedUser;

    /**
     * 菜单编号
     * @return menu_id 菜单编号
     */
    public String getMenuId() {
        return menuId;
    }

    /**
     * 菜单编号
     * @param menuId 菜单编号
     */
    public void setMenuId(String menuId) {
        this.menuId = menuId == null ? null : menuId.trim();
    }

    /**
     * 菜单名称
     * @return menu_name 菜单名称
     */
    public String getMenuName() {
        return menuName;
    }

    /**
     * 菜单名称
     * @param menuName 菜单名称
     */
    public void setMenuName(String menuName) {
        this.menuName = menuName == null ? null : menuName.trim();
    }

    /**
     * 菜单更新时间
     * @return menu_updated_time 菜单更新时间
     */
    public Date getMenuUpdatedTime() {
        return menuUpdatedTime;
    }

    /**
     * 菜单更新时间
     * @param menuUpdatedTime 菜单更新时间
     */
    public void setMenuUpdatedTime(Date menuUpdatedTime) {
        this.menuUpdatedTime = menuUpdatedTime;
    }

    /**
     * 菜单创建人
     * @return menu_created_user 菜单创建人
     */
    public String getMenuCreatedUser() {
        return menuCreatedUser;
    }

    /**
     * 菜单创建人
     * @param menuCreatedUser 菜单创建人
     */
    public void setMenuCreatedUser(String menuCreatedUser) {
        this.menuCreatedUser = menuCreatedUser == null ? null : menuCreatedUser.trim();
    }

    /**
     * 菜单创建时间
     * @return menu_created_time 菜单创建时间
     */
    public Date getMenuCreatedTime() {
        return menuCreatedTime;
    }

    /**
     * 菜单创建时间
     * @param menuCreatedTime 菜单创建时间
     */
    public void setMenuCreatedTime(Date menuCreatedTime) {
        this.menuCreatedTime = menuCreatedTime;
    }

    /**
     * 菜单更新人
     * @return menu_updated_user 菜单更新人
     */
    public String getMenuUpdatedUser() {
        return menuUpdatedUser;
    }

    /**
     * 菜单更新人
     * @param menuUpdatedUser 菜单更新人
     */
    public void setMenuUpdatedUser(String menuUpdatedUser) {
        this.menuUpdatedUser = menuUpdatedUser == null ? null : menuUpdatedUser.trim();
    }
}