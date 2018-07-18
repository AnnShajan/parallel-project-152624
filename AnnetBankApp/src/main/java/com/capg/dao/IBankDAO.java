package com.capg.dao;

import java.util.Map;

import com.capg.bean.AccountDetails;
import com.capg.bean.CustomerDetails;

public interface IBankDAO 
{
	public boolean addCustomer(AccountDetails accDetails);

	public float showBalance();

	public boolean deposit(float amount);

	public boolean withdraw(float amount1);

	public boolean useLogin(String uname, String pass);

	public boolean fundTransfer(int custAccNum, float amount);
	
	public Map printTransaction();
}
