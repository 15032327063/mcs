package com.scb.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.scb.dao.MemberRequestMapper;
import com.scb.pojo.MemberRequest;
import com.scb.pojo.MemberRequestExample;
import com.scb.service.IMemberRequestService;
import com.scb.util.TokenIDFactory;

@Service
public class MemberRequestServiceImpl implements IMemberRequestService{

	@Resource
	private MemberRequestMapper memberRequestDao;
	
	@Override
	public int saveMemberRequestInfo(MemberRequest memberRequest) {
		memberRequest.setMemberRequestId(TokenIDFactory.getUUID());
		
		return memberRequestDao.insertSelective(memberRequest);
	}

	@Override
	public int editMemberRequestInfo(MemberRequest memberRequest) {
		
		return memberRequestDao.updateByPrimaryKeySelective(memberRequest);
	}

	@Override
	public List<MemberRequest> queryAllMemberRequestInfo() {
		MemberRequestExample example = new MemberRequestExample();
		return memberRequestDao.selectByExample(example);
	}

	@Override
	public MemberRequest queryMemberRequestInfoById(String memberRequestId) {
		
		return memberRequestDao.selectByPrimaryKey(memberRequestId);
	}

	@Override
	public List<MemberRequest> queryMemberRequestInfoByRequestStatus(String memberRequestStatus) {
		MemberRequestExample example = new MemberRequestExample();
		example.createCriteria().andMemberRequestStatusEqualTo(memberRequestStatus);
		
		return memberRequestDao.selectByExample(example);
	}

	@Override
	public List<MemberRequest> queryMemberRequestInfoByRequestEmployeeId(String memberRequestEmployeeId) {
		MemberRequestExample example = new MemberRequestExample();
		example.createCriteria().andEmployeeIdEqualTo(memberRequestEmployeeId);
		
		return memberRequestDao.selectByExample(example);
	}

}
