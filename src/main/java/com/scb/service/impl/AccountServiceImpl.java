package com.scb.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.scb.common.CommonData;
import com.scb.dao.AccountMapper;
import com.scb.pojo.Account;
import com.scb.pojo.AccountExample;
import com.scb.service.IAccountService;
import com.scb.util.TokenIDFactory;

@Service
public class AccountServiceImpl implements IAccountService {
	
	@Resource
	private AccountMapper accountDao;

	@Override
	public String logon(Account account) {
		AccountExample example = new AccountExample();
		example.createCriteria().andAccountIdEqualTo(account.getAccountId());
		List<Account> queryResult=accountDao.selectByExample(example);
		if(queryResult.size()==0) {
			return CommonData.LOGON_USER_NOT_EXIST;
		}
		else if(queryResult.get(0).getAccountPassword().equals(account.getAccountPassword())) {
			return CommonData.LOGON_SUCCESS;
		}
		else return CommonData.LOGON_USERNAME_OR_PASSWORD_ERROR;
		
	}

	@Override
	public List<Account> queryAccountInfoById(String accountId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Account> queryAllAccountInfo() {
		AccountExample example = new AccountExample();
		
		return accountDao.selectByExample(example);
	}

	@Override
	public int saveAccountInfo(String accountId) {
		Account account=new Account();
		account.setAccountId(accountId);
		account.setAccountPassword(TokenIDFactory.get8BitUUID());
		return accountDao.insertSelective(account);
	}

	@Override
	public int editAccountInfo(Account account) {
		
		return accountDao.updateByPrimaryKeySelective(account);
	}

	@Override
	public int deleteAccountInfoById(String accountId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Account> queryAccountInfoByLike(String account) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
