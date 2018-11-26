package com.scb.service;

import java.util.List;

import com.scb.pojo.Menu;

public interface IMenuService {
	/**
	 * 
	 * saveMenuInfo:(添加一个菜单). <br/>
	 * @param menu 
	 * @return 0:插入失败  1：插入成功
	 *
	 * @author ryan.li
	 * @since JDK 1.8
	 */
	public int saveMenuInfo(Menu menu);
	
	/**
	 * 
	 * editMenuInfo:(编辑菜单信息). <br/>
	 * @param menu 
	 * @return 0:修改失败  1：修改成功
	 *
	 * @author ryan.li
	 * @since JDK 1.8
	 */
	public int editMenuInfo(Menu menu);
	
	/**
	 * 
	 * queryAllMenuInfo:(查询所有菜单信息). <br/>
	 * @param 
	 * @return 所有菜单对象集合
	 *
	 * @author ryan.li
	 * @since JDK 1.8
	 */
	public List<Menu> queryAllMenuInfo();
	
	/**
	 * 
	 * queryMenuInfoById:(根据id查询菜单信息). <br/>
	 * @param menuId 
	 * @return 菜单对象
	 *
	 * @author ryan.li
	 * @since JDK 1.8
	 */
	public Menu queryMenuInfoById(String menuId);
	
	/**
	 * 
	 * queryMenuInfoByName:(根据名字查询菜单信息). <br/>
	 * @param menuName 
	 * @return 菜单对象
	 *
	 * @author ryan.li
	 * @since JDK 1.8
	 */
	public List<Menu> queryMenuInfoByName(String menuName);
}
