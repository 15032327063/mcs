package com.scb.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.scb.dao.MenuFunctionMapper;
import com.scb.pojo.MenuFunction;
import com.scb.pojo.MenuFunctionExample;
import com.scb.service.IMenuFunctionService;
import com.scb.util.TokenIDFactory;
/**
 * 
 * ClassName: MenuFunctionServiceImpl <br/>
 * Description: 菜单功能service层实现类. <br/><br/>
 * date: 2018年11月19日 上午10:39:57 <br/>
 *
 * @author ryan。li
 * @version V1.0
 * @since JDK 1.8
 */
@Service
public class MenuFunctionServiceImpl implements IMenuFunctionService{

	@Resource
	private MenuFunctionMapper menuFunctionDao;
	
	@Override
	public int saveMenuFunctionInfo(MenuFunction menuFunction) {
		menuFunction.setMenuFunctionId(TokenIDFactory.getUUID());
		
		return menuFunctionDao.insertSelective(menuFunction);
	}

	@Override
	public int deleteMenuFunctionInfo(String menuFunctionId) {
		
		return menuFunctionDao.deleteByPrimaryKey(menuFunctionId);
	}

	@Override
	public List<MenuFunction> queryMenuFunctionByMenuId(String menuId) {
		MenuFunctionExample example = new MenuFunctionExample();
		example.createCriteria().andMenuIdEqualTo(menuId);
		
		return menuFunctionDao.selectByExample(example);
	}

	@Override
	public List<MenuFunction> queryMenuFunctionByFunctionId(String functionId) {
		MenuFunctionExample example = new MenuFunctionExample();
		example.createCriteria().andFunctionIdEqualTo(functionId);
		
		return menuFunctionDao.selectByExample(example);
	}

	@Override
	public MenuFunction queryMenuFunctionById(String menuFunctionId) {
		
		return menuFunctionDao.selectByPrimaryKey(menuFunctionId);
	}

	@Override
	public int editMenuFunction(MenuFunction menuFunction) {
		
		return menuFunctionDao.updateByPrimaryKeySelective(menuFunction);
	}

}
