package com.scb.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.scb.dao.EmployeeMapper;
import com.scb.pojo.Employee;
import com.scb.pojo.EmployeeExample;
import com.scb.service.IAccountService;
import com.scb.service.IEmployeeService;
/**
 * 
 * ClassName: EmployeeServiceImpl <br/>
 * Description: 员工service层实现类. <br/><br/>
 * date: 2018年11月18日 下午3:24:31 <br/>
 *
 * @author ryan。li
 * @version V1.0
 * @since JDK 1.8
 */
@Service
public class EmployeeServiceImpl implements IEmployeeService {

	@Resource
	private EmployeeMapper employeeDao;
	@Resource
	private IAccountService accountService;
	
	@Override
	public int saveEmployeeInfo(Employee employee) {
		employeeDao.insertSelective(employee);
		accountService.saveAccountInfo(employee.getEmployeeId());
		return 1;
	}

	@Override
	public int editEmployeeInfo(Employee employee) {
		
		return employeeDao.updateByPrimaryKeySelective(employee);
	}

	@Override
	public List<Employee> queryAllEmployeeInfo() {
		
		EmployeeExample example = new EmployeeExample();
		
		return employeeDao.selectByExample(example);
	}

	@Override
	public Employee queryEmployeeInfoById(String employeeId) {
		EmployeeExample example = new EmployeeExample();
		example.createCriteria().andEmployeeIdEqualTo(employeeId);
		
		return employeeDao.selectByPrimaryKey(employeeId);
	}

	@Override
	public List<Employee> queryEmployeeInfoByName(String employeeName) {
		EmployeeExample example = new EmployeeExample();
		example.createCriteria().andEmployeeNameEqualTo(employeeName);
		
		return employeeDao.selectByExample(example);
	}
	
}
