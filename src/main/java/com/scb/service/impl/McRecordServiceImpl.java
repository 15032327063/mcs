package com.scb.service.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.scb.dao.McRecordMapper;
import com.scb.pojo.McRecord;
import com.scb.pojo.McRecordExample;
import com.scb.service.IMcRecordService;
import com.scb.util.TokenIDFactory;
/**
 * 
 * ClassName: McRecordServiceImpl <br/>
 * Description: 餐券记录service实现类. <br/><br/>
 * date: 2018年11月18日 下午8:37:32 <br/>
 *
 * @author ryan。li
 * @version V1.0
 * @since JDK 1.8
 */
@Service
public class McRecordServiceImpl implements IMcRecordService {

	@Resource
	private McRecordMapper mcRecordDao;
	
	@Override
	public int saveMcRecordInfo(McRecord mcRecord) {
		mcRecord.setMcRecordId(TokenIDFactory.getUUID());
		return mcRecordDao.insertSelective(mcRecord);
	}

	@Override
	public int editMcRecordInfo(McRecord mcRecord) {
		
		return mcRecordDao.updateByPrimaryKeySelective(mcRecord);
	}

	@Override
	public List<McRecord> queryAllMcRecordInfo() {
		McRecordExample example = new McRecordExample();
	
		return mcRecordDao.selectByExample(example);
	}

	@Override
	public McRecord queryMcRecordInfoById(String mcRecordId) {
		
		return mcRecordDao.selectByPrimaryKey(mcRecordId);
	}

	@Override
	public List<McRecord> queryMcRecordInfoByTeamId(String teamId) {
		McRecordExample example = new McRecordExample();
		example.createCriteria().andTeamIdEqualTo(teamId);
		
		return mcRecordDao.selectByExample(example);
	}

	@Override
	public List<McRecord> queryMcRecordInfoByMcRecordDate(Date mcRecordDate) {
		McRecordExample example = new McRecordExample();
		example.createCriteria().andMcRecordDateEqualTo(mcRecordDate);
		
		return mcRecordDao.selectByExample(example);
	}

}
