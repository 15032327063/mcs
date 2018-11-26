package com.scb.service;

import java.util.List;

import com.scb.pojo.RoleMenu;
/**
 * 
 * ClassName: IRoleMenuService <br/>
 * Description: 角色菜单对应关系service层接口. <br/><br/>
 * date: 2018年11月19日 上午11:05:12 <br/>
 *
 * @author ryan。li
 * @version V1.0
 * @since JDK 1.8
 */
public interface IRoleMenuService {
	/**
	 * 
	 * saveRoleMenuInfo:(添加一个角色菜单映射). <br/>
	 * @param roleMenu 
	 * @return 0:插入失败  1：插入成功
	 *
	 * @author ryan.li
	 * @since JDK 1.8
	 */
	public int saveRoleMenuInfo(RoleMenu roleMenu);

	/**
	 * 
	 * deleteRoleMenuInfo:(删除一个角色菜单映射). <br/>
	 * @param roleMenuId 
	 * @return 0:删除失败  1：删除成功
	 *
	 * @author ryan.li
	 * @since JDK 1.8
	 */
	public int deleteRoleMenuInfo(String roleMenuId);
	
	/**
	 * 
	 * queryRoleMenuByMenuId:(根据菜单id查询角色菜单信息). <br/>
	 * @param menuId 
	 * @return 角色菜单对象集合
	 *
	 * @author ryan.li
	 * @since JDK 1.8
	 */
	public List<RoleMenu> queryRoleMenuByMenuId(String menuId);
	
	/**
	 * 
	 * queryRoleMenuByRoleId:(根据角色id查询菜单功能信息). <br/>
	 * @param roleId 
	 * @return 角色菜单对象集合
	 *
	 * @author ryan.li
	 * @since JDK 1.8
	 */
	public List<RoleMenu> queryRoleMenuByRoleId(String roleId);
	
	/**
	 * 
	 * queryRoleMenuById:(根据id查询角色菜单信息). <br/>
	 * @param roleMenuId 
	 * @return 角色菜单对象
	 *
	 * @author ryan.li
	 * @since JDK 1.8
	 */
	public RoleMenu queryRoleMenuById(String roleMenuId);
	
	/**
	 * 
	 * editRoleMenu:(编辑角色菜单信息). <br/>
	 * @param roleMenu
	 * @return 0:修改失败  1：修改成功
	 *
	 * @author ryan.li
	 * @since JDK 1.8
	 */
	public int editRoleMenu(RoleMenu roleMenu);
}
