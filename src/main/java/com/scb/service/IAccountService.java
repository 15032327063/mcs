package com.scb.service;

import java.util.List;

import com.scb.pojo.Account;

public interface IAccountService {
	public String logon(Account account);
	
	/**
     * @desc:查询账户的信息
		* @author: sea
		* @createTime: 2018年5月8日 上午11:12:54
		* @param account
		* @return List<Account>
	*/
	public List<Account> queryAccountInfoById(String accountId);
	
	/**
	     * @desc:查询所有的账户信息
			* @author: sea
			* @createTime: 2018年5月8日 上午11:13:30
			* @return List<Account>
	*/
	public List<Account> queryAllAccountInfo();
	
	/**
	     * @desc:新增账户的信息
			* @author: sea
			* @createTime: 2018年5月8日 上午11:13:51
			* @param account
			* @return int
	*/
	public int saveAccountInfo(String accountId);
	
	/**
	     * @desc:更新账户的信息
			* @author: sea
			* @createTime: 2018年5月8日 上午11:14:12
			* @param account
			* @return int
	*/
	public int editAccountInfo(Account account);
	
	/**
	     * @desc:删除账户的信息
			* @author: sea
			* @createTime: 2018年5月8日 上午11:14:33
			* @param account
			* @return int
	*/
	public int deleteAccountInfoById(String accountId);
	
	/**
	     * @desc:模糊查询账户的信息
			* @author: sea
			* @createTime: 2018年5月8日 上午11:14:54
			* @history:
			* @param account
			* @return List<Account>
	*/
	public List<Account> queryAccountInfoByLike(String account);
}
