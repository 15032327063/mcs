package com.scb.controller;

import java.io.UnsupportedEncodingException;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.scb.pojo.Account;
import com.scb.service.IAccountService;

@RestController
@RequestMapping("/account")
public class AccountController {
	@Resource
	private IAccountService accountService;
	
	@RequestMapping("/logon")
	public String logon(Account account,HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException {
		response.setHeader("content-type", "text/html;charset=UTF-8");
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		String result = accountService.logon(account);
		return result;
	}
}
