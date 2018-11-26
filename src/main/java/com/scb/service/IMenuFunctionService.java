package com.scb.service;

import java.util.List;

import com.scb.pojo.MenuFunction;

/**
 * 
 * ClassName: IMenuFunctionService <br/>
 * Description:菜单功能关系service层接口. <br/><br/>
 * date: 2018年11月19日 上午9:39:08 <br/>
 *
 * @author ryan。li
 * @version V1.0
 * @since JDK 1.8
 */
public interface IMenuFunctionService {
	
	/**
	 * 
	 * saveMenuFunctionInfo:(添加一个菜单功能映射). <br/>
	 * @param menuFunction 
	 * @return 0:插入失败  1：插入成功
	 *
	 * @author ryan.li
	 * @since JDK 1.8
	 */
	public int saveMenuFunctionInfo(MenuFunction menuFunction);

	/**
	 * 
	 * deleteMenuFunctioinInfo:(删除一个菜单功能映射). <br/>
	 * @param menuFunctionId 
	 * @return 0:删除失败  1：删除成功
	 *
	 * @author ryan.li
	 * @since JDK 1.8
	 */
	public int deleteMenuFunctionInfo(String menuFunctionId);
	
	/**
	 * 
	 * queryMenuFunctionByMenuId:(根据菜单id查询菜单的功能信息). <br/>
	 * @param menuId 
	 * @return 菜单功能对象集合
	 *
	 * @author ryan.li
	 * @since JDK 1.8
	 */
	public List<MenuFunction> queryMenuFunctionByMenuId(String menuId);
	
	/**
	 * 
	 * queryFunctionInfoById:(根据功能id查询菜单功能信息). <br/>
	 * @param functionId 
	 * @return 菜单功能对象集合
	 *
	 * @author ryan.li
	 * @since JDK 1.8
	 */
	public List<MenuFunction> queryMenuFunctionByFunctionId(String functionId);
	
	/**
	 * 
	 * queryMenuFunctionById:(根据id查询菜单功能信息). <br/>
	 * @param menuFunctionId 
	 * @return 菜单功能对象
	 *
	 * @author ryan.li
	 * @since JDK 1.8
	 */
	public MenuFunction queryMenuFunctionById(String menuFunctionId);
	
	/**
	 * 
	 * editMenuFunction:(编辑菜单功能信息). <br/>
	 * @param menuFunction
	 * @return 0:修改失败  1：修改成功
	 *
	 * @author ryan.li
	 * @since JDK 1.8
	 */
	public int editMenuFunction(MenuFunction menuFunction);
	
}
