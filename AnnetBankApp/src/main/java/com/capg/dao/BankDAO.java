package com.capg.dao;

import java.util.HashMap;
import java.util.Map;

import com.capg.bean.AccountDetails;
import com.capg.bean.CustomerDetails;


import java.util.Scanner;

public class BankDAO implements IBankDAO
{
	
	static AccountDetails acc;
	static HashMap<String, AccountDetails> map = new HashMap<String, AccountDetails>();
	static CustomerDetails details;
	static HashMap<String, Float> transaction = new HashMap<String, Float>();// to0 print transcation
	
	
	public boolean addCustomer(AccountDetails accDetails) 
	{

		map.put(accDetails.getCustDetails().getUsername(), accDetails);

		return true;
	}
	
	public float showBalance() 
	{

		return acc.getInitialBal();

	}
	
	public boolean withdraw(float amount1) 
	{
        
		if (acc.getInitialBal() >= (amount1 + 1000)) 
		{
			acc.setInitialBal(acc.getInitialBal() - amount1);
			System.out.println("balance amount after withdrawing:" + acc.getInitialBal());
			
			
			String s= "Withdrawn Amount is ";
		     
			transaction.put(s,amount1 );	
			
		    return true;
		}
		else 
		{
			System.out.println("You do not have the required mandatory balance ");
		}

		return false;
	}

	
	public boolean deposit(float amount) 
	{
		acc.setInitialBal(acc.getInitialBal() + amount);
		System.out.println("Balance:" + acc.getInitialBal());
	
	
	    String s= "Amount Deposited  is = ";
         transaction.put(s,amount);	
	   return true;
		
		

	}
	
	public boolean useLogin(String uname, String pass) 
	{
		for (String key : map.keySet()) 
		{
			AccountDetails login = map.get(key);
			
			if ((login.getCustDetails().getUsername().equals(uname))
					&& (login.getCustDetails().getPassword().equals(pass))) 
			{
				acc = login;
				return true;
			}
	    }
		return false;
	}
	
	
	public boolean fundTransfer(int custAccNum, float amount) {

		for (String key : map.keySet()) 
		{
			AccountDetails paydetails = map.get(key);
			
			
		  if (paydetails.getCustomerTid() == custAccNum)
			{
				
			    paydetails.setInitialBal(paydetails.getInitialBal() - amount);
				// acc.setInitialBal(paydetails.getInitialBal() - amount);
				
				 System.out.println("Your account has balance left "+paydetails.getInitialBal());
				 
			     String s1= "Fund Transfered  is =  ";
		          transaction.put(s1,amount);	
		          return true;
				 
			} 
		  else {
                 acc.setInitialBal(paydetails.getInitialBal() - amount);
				return true;
			}
		}
		return false;
	}
	
	
	public Map printTransaction() 
	{
	return transaction;
		
	}

	

}
	
	
	
	
		

