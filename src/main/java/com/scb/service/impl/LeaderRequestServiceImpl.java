package com.scb.service.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.scb.dao.LeaderRequestMapper;
import com.scb.pojo.LeaderRequest;
import com.scb.pojo.LeaderRequestExample;
import com.scb.service.ILeaderRequestService;
import com.scb.util.TokenIDFactory;
/**
 * 
 * ClassName: LeaderRequestServiceImpl <br/>
 * Description: leader请求service层实现类. <br/><br/>
 * date: 2018年11月18日 下午7:46:39 <br/>
 *
 * @author ryan。li
 * @version V1.0
 * @since JDK 1.8
 */
@Service
public class LeaderRequestServiceImpl implements ILeaderRequestService {

	@Resource
	private LeaderRequestMapper leaderRequestDao;
	
	@Override
	public int saveLeaderRequestInfo(LeaderRequest leaderRequest) {
		leaderRequest.setLeaderRequestId(TokenIDFactory.getUUID());
		
		return leaderRequestDao.insertSelective(leaderRequest);
	}

	@Override
	public int editLeaderRequestInfo(LeaderRequest leaderRequest) {
		
		return leaderRequestDao.updateByPrimaryKeySelective(leaderRequest);
	}

	@Override
	public List<LeaderRequest> queryAllLeaderRequestInfo() {
		LeaderRequestExample example=new LeaderRequestExample();
		
		return leaderRequestDao.selectByExample(example);
	}

	@Override
	public LeaderRequest queryLeaderRequestInfoById(String leaderRequestId) {
		
		return leaderRequestDao.selectByPrimaryKey(leaderRequestId);
	}

	@Override
	public List<LeaderRequest> queryLeaderRequestInfoByRequestDate(Date leaderRequestDate) {
		
		LeaderRequestExample example=new LeaderRequestExample();
		example.createCriteria().andLeaderRequestDateEqualTo(leaderRequestDate);
		
		return leaderRequestDao.selectByExample(example);
	}

	@Override
	public List<LeaderRequest> queryLeaderRequestInfoByRequestStatus(String leaderRequestStatus) {
		
		LeaderRequestExample example=new LeaderRequestExample();
		example.createCriteria().andLeaderRequestStatusEqualTo(leaderRequestStatus);
		
		return leaderRequestDao.selectByExample(example);
	}

	@Override
	public List<LeaderRequest> queryLeaderRequestInfoByRequestEmployeeId(String leaderRequestEmployeeId) {
		LeaderRequestExample example=new LeaderRequestExample();
		example.createCriteria().andEmployeeIdEqualTo(leaderRequestEmployeeId);
		
		return leaderRequestDao.selectByExample(example);
	}

}
