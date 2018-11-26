package com.scb.pojo;

public class MenuFunction {
    /**
     * 菜单功能对应编号
     */
    private String menuFunctionId;

    /**
     * 菜单编号
     */
    private String menuId;

    /**
     * 功能编号
     */
    private String functionId;

    /**
     * 菜单功能对应编号
     * @return menu_function_id 菜单功能对应编号
     */
    public String getMenuFunctionId() {
        return menuFunctionId;
    }

    /**
     * 菜单功能对应编号
     * @param menuFunctionId 菜单功能对应编号
     */
    public void setMenuFunctionId(String menuFunctionId) {
        this.menuFunctionId = menuFunctionId == null ? null : menuFunctionId.trim();
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
}