package com.scb.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.scb.dao.MenuMapper;
import com.scb.pojo.Menu;
import com.scb.pojo.MenuExample;
import com.scb.service.IMenuService;
import com.scb.util.TokenIDFactory;
/**
 * 
 * ClassName: MenuServiceImpl <br/>
 * Description: 菜单service层实现类. <br/><br/>
 * date: 2018年11月19日 上午10:51:21 <br/>
 *
 * @author ryan。li
 * @version V1.0
 * @since JDK 1.8
 */
@Service
public class MenuServiceImpl implements IMenuService {

	@Resource
	private MenuMapper menuDao;
	
	@Override
	public int saveMenuInfo(Menu menu) {
		menu.setMenuId(TokenIDFactory.getUUID());
		return menuDao.insertSelective(menu);
	}

	@Override
	public int editMenuInfo(Menu menu) {
		
		return menuDao.updateByPrimaryKeySelective(menu);
	}

	@Override
	public List<Menu> queryAllMenuInfo() {
		MenuExample example = new MenuExample();
		
		return menuDao.selectByExample(example);
	}

	@Override
	public Menu queryMenuInfoById(String menuId) {
		
		return menuDao.selectByPrimaryKey(menuId);
	}

	@Override
	public List<Menu> queryMenuInfoByName(String menuName) {
		MenuExample example = new MenuExample();
		example.createCriteria().andMenuNameEqualTo(menuName);
		
		return menuDao.selectByExample(example);
	}

}
