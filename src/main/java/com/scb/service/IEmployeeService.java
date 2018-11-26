package com.scb.service;

import java.util.List;

import com.scb.pojo.Employee;
/**
 * 
 * ClassName: IEmployeeService <br/>
 * Description: 员工service接口. <br/><br/>
 * date: 2018年11月18日 下午2:46:42 <br/>
 *
 * @author ryan。li
 * @version V1.0
 * @since JDK 1.8
 */
public interface IEmployeeService {
	/**
	 * 
	 * saveEmployeeInfo:(添加一个员工). <br/>
	 * @param employee 
	 * @return 0:插入失败  1：插入成功
	 *
	 * @author ryan.li
	 * @since JDK 1.8
	 */
	public int saveEmployeeInfo(Employee employee);
	
	/**
	 * 
	 * editEmployeeInfo:(编辑员工信息). <br/>
	 * @param employee 
	 * @return 0:修改失败  1：修改成功
	 *
	 * @author ryan.li
	 * @since JDK 1.8
	 */
	public int editEmployeeInfo(Employee employee);
	
	/**
	 * 
	 * queryAllEmployeeInfo:(查询所有员工信息). <br/>
	 * @param 
	 * @return 所有员工对象集合
	 *
	 * @author ryan.li
	 * @since JDK 1.8
	 */
	public List<Employee> queryAllEmployeeInfo();
	
	/**
	 * 
	 * queryEmployeeInfoById:(根据id查询员工信息). <br/>
	 * @param employeeId 
	 * @return 员工对象
	 *
	 * @author ryan.li
	 * @since JDK 1.8
	 */
	public Employee queryEmployeeInfoById(String employeeId);
	
	/**
	 * 
	 * queryEmployeeInfoByName:(根据id查询员工信息). <br/>
	 * @param employeeId 
	 * @return 员工对象
	 *
	 * @author ryan.li
	 * @since JDK 1.8
	 */
	public List<Employee> queryEmployeeInfoByName(String employeeName);
}
