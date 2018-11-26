package com.scb.pojo;

public class RoleMenu {
    /**
     * 角色菜单对应编号
     */
    private String roleMenuId;

    /**
     * 菜单编号
     */
    private String menuId;

    /**
     * 角色编号
     */
    private String roleId;

    /**
     * 角色菜单对应编号
     * @return role_menu_id 角色菜单对应编号
     */
    public String getRoleMenuId() {
        return roleMenuId;
    }

    /**
     * 角色菜单对应编号
     * @param roleMenuId 角色菜单对应编号
     */
    public void setRoleMenuId(String roleMenuId) {
        this.roleMenuId = roleMenuId == null ? null : roleMenuId.trim();
    }

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
}