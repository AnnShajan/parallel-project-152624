package com.capg.service;

import java.util.Map;

import com.capg.bean.AccountDetails;

public interface IBankService 
{
	
	public boolean addCustomer(AccountDetails accDetails);

	public float showBalance();

	public boolean deposit(float amount);

	public boolean withdraw(float amount1);

	public boolean useLogin(String uname, String pass);

	public boolean fundTransfer(int custAccNum, float amount);
	
	public Map printTransaction();
	
	
	
	
}

