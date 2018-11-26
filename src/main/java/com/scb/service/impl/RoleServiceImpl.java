package com.scb.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.scb.dao.RoleMapper;
import com.scb.pojo.Role;
import com.scb.pojo.RoleExample;
import com.scb.service.IRoleService;
import com.scb.util.TokenIDFactory;
/**
 * 
 * ClassName: RoleServiceImpl <br/>
 * Description: 角色service层实现类. <br/><br/>
 * date: 2018年11月19日 上午11:31:20 <br/>
 *
 * @author ryan。li
 * @version V1.0
 * @since JDK 1.8
 */
@Service
public class RoleServiceImpl implements IRoleService {

	@Resource
	private RoleMapper roleDao;

	@Override
	public int saveRoleInfo(Role role) {
		role.setRoleId(TokenIDFactory.getUUID());
		
		return roleDao.insertSelective(role);
	}

	@Override
	public int editRoleInfo(Role role) {
		
		return roleDao.updateByPrimaryKeySelective(role);
	}

	@Override
	public List<Role> queryAllRoleInfo() {
		RoleExample example = new RoleExample();
		
		return roleDao.selectByExample(example);
	}

	@Override
	public Role queryRoleInfoById(String roleId) {
		
		return roleDao.selectByPrimaryKey(roleId);
	}

	@Override
	public List<Role> queryRoleInfoByName(String roleName) {
		RoleExample example = new RoleExample();
		example.createCriteria().andRoleNameEqualTo(roleName);
		
		return roleDao.selectByExample(example);
	}
	
	

}
