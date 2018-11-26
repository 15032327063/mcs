package com.scb.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.scb.dao.RoleMenuMapper;
import com.scb.pojo.RoleMenu;
import com.scb.pojo.RoleMenuExample;
import com.scb.service.IRoleMenuService;
import com.scb.util.TokenIDFactory;
/**
 * 
 * ClassName: RoleMenuServiceImpl <br/>
 * Description: 角色菜单service层实现类. <br/><br/>
 * date: 2018年11月19日 上午11:15:53 <br/>
 *
 * @author ryan。li
 * @version V1.0
 * @since JDK 1.8
 */
@Service
public class RoleMenuServiceImpl implements IRoleMenuService {

	@Resource
	private RoleMenuMapper roleMenuDao;
	
	@Override
	public int saveRoleMenuInfo(RoleMenu roleMenu) {
		roleMenu.setRoleMenuId(TokenIDFactory.getUUID());
		return roleMenuDao.insertSelective(roleMenu);
	}

	@Override
	public int deleteRoleMenuInfo(String roleMenuId) {
		
		return roleMenuDao.deleteByPrimaryKey(roleMenuId);
	}

	@Override
	public List<RoleMenu> queryRoleMenuByMenuId(String menuId) {
		RoleMenuExample example = new RoleMenuExample();
		example.createCriteria().andMenuIdEqualTo(menuId);
		
		return roleMenuDao.selectByExample(example);
	}

	@Override
	public List<RoleMenu> queryRoleMenuByRoleId(String roleId) {
		RoleMenuExample example = new RoleMenuExample();
		example.createCriteria().andRoleIdEqualTo(roleId);
		
		return roleMenuDao.selectByExample(example);
	}

	@Override
	public RoleMenu queryRoleMenuById(String roleMenuId) {
		
		return roleMenuDao.selectByPrimaryKey(roleMenuId);
	}

	@Override
	public int editRoleMenu(RoleMenu roleMenu) {
		
		return roleMenuDao.updateByPrimaryKeySelective(roleMenu);
	}

}
