package com.scb.service;

import java.util.List;

import com.scb.pojo.Menu;
import com.scb.pojo.Role;
/**
 * 
 * ClassName: IRoleService <br/>
 * Description: 角色service层接口. <br/><br/>
 * date: 2018年11月19日 上午11:26:56 <br/>
 *
 * @author ryan。li
 * @version V1.0
 * @since JDK 1.8
 */
public interface IRoleService {
	/**
	 * 
	 * saveRoleInfo:(添加一个角色). <br/>
	 * @param role 
	 * @return 0:插入失败  1：插入成功
	 *
	 * @author ryan.li
	 * @since JDK 1.8
	 */
	public int saveRoleInfo(Role role);
	
	/**
	 * 
	 * editRoleInfo:(编辑角色信息). <br/>
	 * @param role 
	 * @return 0:修改失败  1：修改成功
	 *
	 * @author ryan.li
	 * @since JDK 1.8
	 */
	public int editRoleInfo(Role role);
	
	/**
	 * 
	 * queryAllRoleInfo:(查询所有角色信息). <br/>
	 * @param 
	 * @return 所有角色对象集合
	 *
	 * @author ryan.li
	 * @since JDK 1.8
	 */
	public List<Role> queryAllRoleInfo();
	
	/**
	 * 
	 * queryRoleInfoById:(根据id查询角色信息). <br/>
	 * @param roleId 
	 * @return 角色对象
	 *
	 * @author ryan.li
	 * @since JDK 1.8
	 */
	public Role queryRoleInfoById(String roleId);
	
	/**
	 * 
	 * queryRoleInfoByName:(根据名字查询角色信息). <br/>
	 * @param roleName 
	 * @return 角色对象
	 *
	 * @author ryan.li
	 * @since JDK 1.8
	 */
	public List<Role> queryRoleInfoByName(String roleName);
}
