package com.scb.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.scb.dao.FunctionMapper;
import com.scb.pojo.Function;
import com.scb.pojo.FunctionExample;
import com.scb.service.IFunctionService;
import com.scb.util.TokenIDFactory;
/**
 * 
 * ClassName: FunctionServiceImpl <br/>
 * Description: 功能service层实现类. <br/><br/>
 * date: 2018年11月18日 下午7:48:57 <br/>
 *
 * @author ryan。li
 * @version V1.0
 * @since JDK 1.8
 */
@Service
public class FunctionServiceImpl implements IFunctionService {

	@Resource
	private FunctionMapper functionDao;
	
	@Override
	public int saveFunctionInfo(Function function) {
		function.setFunctionId(TokenIDFactory.getUUID());
		return functionDao.insertSelective(function);
	}

	@Override
	public int editFunctionInfo(Function function) {
		
		return functionDao.updateByPrimaryKeySelective(function);
	}

	@Override
	public List<Function> queryAllFunctionInfo() {
		FunctionExample example=new FunctionExample();
		return functionDao.selectByExample(example);
	}

	@Override
	public Function queryFunctionInfoById(String functionId) {
		
		return functionDao.selectByPrimaryKey(functionId);
	}

	@Override
	public List<Function> queryFunctionInfoByName(String functionName) {
		FunctionExample example=new FunctionExample();
		example.createCriteria().andFunctionNameEqualTo(functionName);
		
		return functionDao.selectByExample(example);
	}

}
