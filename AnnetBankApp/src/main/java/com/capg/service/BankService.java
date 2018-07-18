package com.capg.service;

import java.util.Map;

import com.capg.bean.AccountDetails;
import com.capg.bean.CustomerDetails;
import com.capg.dao.BankDAO;

public class BankService implements IBankService {
	
	BankDAO dao = new BankDAO();

	public boolean addCustomer(AccountDetails accDetails) {

		return dao.addCustomer(accDetails);
	}

	public float showBalance() {
		return dao.showBalance();
	}

	public boolean deposit(float amount) {
		return dao.deposit(amount);
	}

	public boolean withdraw(float amount1) {
		return dao.withdraw(amount1);
	}

	public boolean fundTransfer(int custAccNum, float amount) {

		return dao.fundTransfer(custAccNum, amount);
	}

	public boolean useLogin(String uname, String pass) {

		return dao.useLogin(uname, pass);
	}

	public Map printTransaction() {

		return dao.printTransaction();
	}

}
