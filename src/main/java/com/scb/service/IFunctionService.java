package com.scb.service;

import java.util.List;

import com.scb.pojo.Function;
/**
 * 
 * ClassName: IFunctionService <br/>
 * Description: 功能service接口. <br/><br/>
 * date: 2018年11月18日 下午3:54:34 <br/>
 *
 * @author ryan。li
 * @version V1.0
 * @since JDK 1.8
 */
public interface IFunctionService {
	/**
	 * 
	 * saveFunctionInfo:(添加一个功能). <br/>
	 * @param function 
	 * @return 0:插入失败  1：插入成功
	 *
	 * @author ryan.li
	 * @since JDK 1.8
	 */
	public int saveFunctionInfo(Function function);
	
	/**
	 * 
	 * editFunctionInfo:(编辑功能信息). <br/>
	 * @param function 
	 * @return 0:修改失败  1：修改成功
	 *
	 * @author ryan.li
	 * @since JDK 1.8
	 */
	public int editFunctionInfo(Function function);
	
	/**
	 * 
	 * queryAllFunctionnfo:(查询所有功能信息). <br/>
	 * @param 
	 * @return 所有功能对象集合
	 *
	 * @author ryan.li
	 * @since JDK 1.8
	 */
	public List<Function> queryAllFunctionInfo();
	
	/**
	 * 
	 * queryFunctionInfoById:(根据id查询功能信息). <br/>
	 * @param functionId 
	 * @return 功能对象
	 *
	 * @author ryan.li
	 * @since JDK 1.8
	 */
	public Function queryFunctionInfoById(String functionId);
	
	/**
	 * 
	 * queryFunctionInfoByName:(根据名字查询功能信息). <br/>
	 * @param functionName 
	 * @return 功能对象
	 *
	 * @author ryan.li
	 * @since JDK 1.8
	 */
	public List<Function> queryFunctionInfoByName(String functionName);
}
