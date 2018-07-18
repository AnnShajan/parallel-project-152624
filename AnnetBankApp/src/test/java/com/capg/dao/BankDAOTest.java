package com.capg.dao;

	import com.capg.bean.CustomerDetails;
	import com.capg.dao.BankDAO;

	import junit.framework.TestCase;

	public class BankDAOTest extends TestCase {

		
		CustomerDetails detail = new CustomerDetails();
		
		BankDAO dao = new BankDAO();
		
		public void testAddCustomer() 
		{
			
		}

		public void testShowBalance() 
		{
			
		}

		public void testWithdraw() {
			assertEquals(false,dao.withdraw( 40000));
			assertEquals(false,dao.withdraw( 0));
		}

		public void testDeposit() {
			assertEquals(false,dao.deposit( 40000));
			assertEquals(false,dao.deposit( 0));
		}

	}


