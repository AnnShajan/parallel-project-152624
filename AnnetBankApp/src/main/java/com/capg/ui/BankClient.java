package com.capg.ui;
import java.util.Scanner;
import com.capg.bean.AccountDetails;
import com.capg.bean.CustomerDetails;
import com.capg.dao.BankDAO;
import com.capg.service.AccountDataValidate;
import com.capg.service.BankService;

public class BankClient 
{
    
	public static void main(String[] args)
    {
    	int choice1=0;
    	int choice;
    	
    	AccountDataValidate validate=new AccountDataValidate();
    	
    	while(true)
    	{
    		Scanner sc= new Scanner (System.in);
    		AccountDetails details=new AccountDetails();
    		
    		System.out.println("welcome to the portal");
    		System.out.println("1. create account");
    		System.out.println("2. login into your account");
    		System.out.println("3. exit ");
    		
    		
            choice=sc.nextInt();
    		//sc.nextLine();
    		
    		switch(choice)
    		{
    		case 1:
    			
    			creatAccount();
    			break;
    			
    			
    		case 2:
    			boolean log=useLogin();
    			if(log) 
    			{
    				while(true)
    				{
    					System.out.println("1. display balance");
    	        		System.out.println("2. deposit");
    	        		System.out.println("3. withdraw");
    	        		System.out.println("4. fund transfer");
    	        		System.out.println("5. print transcations");
    	        		System.out.println("6. exit ");
    	        		
    	        		System.out.println("/n enter choice /n");
    	        		choice1=sc.nextInt();
    	        		
    	        		switch(choice1)
    	        		{
    	        		case 1:
    	        			showBalance();
    	        			break;
    	        			
    	        		case 2:
    	        			deposit();
    	        			break;
    	        		case 3:
    	        			withdraw();
    	        			break;
    	        			
    	        		case 4:
    	        			fundTransfer();
    	        			break;
    	        			
    	        		case 5:
    	        			printTransaction();
    	        			break;
    	        			
    	        		case 6:
    	        			System.exit(0);
    	        			break;
    	        	}
    				
    				} 
				} else 
				{
					System.out.println("ENTER VALID LOGIN DETAILS ");
				}
    		}
			// break;

		} 
    }
	
	
			
             private static  boolean useLogin()
    		 {
    			Scanner sc1=new Scanner(System.in);
    			AccountDataValidate validate= new AccountDataValidate();
    			CustomerDetails c=new CustomerDetails();
    			
    			System.out.println(" enter the username");
    			String uname=sc1.nextLine();
    			
    			System.out.println("enter password");
    			String pass=sc1.nextLine();
    			
    			BankService service1= new BankService();
    			
    			boolean b = service1.useLogin(uname, pass);
    			if (b) {
    				return true;

    			}
    			return false;
    			
    		}
             
             private static void deposit()
     		{
     			CustomerDetails c = new CustomerDetails();	
     			
     			Scanner sc=new Scanner(System.in);
     			
     			System.out.println("Enter the amount to deposit");
     			float amount = sc.nextFloat();
     			
     			BankService service=new BankService();
     			boolean details=service.deposit(amount);
     			
     			if (details) {
     				System.out.println("account deposited!");

     			} else {
     				System.out.println("Invalid account number");
     			}
     			
     			
     		}
     			
    		
    		private static void fundTransfer()
    		{
    			Scanner sc=new Scanner(System.in);
    			CustomerDetails c = new CustomerDetails();

    			System.out.println("Enter Account number to transfer your fund");
    			int custAccNum = sc.nextInt();
    			System.out.println("Enter the amount to transfer from your account to other account");
    			float amount = sc.nextFloat();
    			
    			
    			BankService service=new BankService();
    			boolean trans=service.fundTransfer(custAccNum, amount);
    			
    			if (trans) {
    				System.out.println("your Fund Transfer is complete");

    			} else {
    				System.out.println("sorry! Invalid account number");
    			}
    		}
    		
    		
    		private static void withdraw()
    		{
    			Scanner sc = new Scanner(System.in);
    			BankService service=new BankService();
    			
    			System.out.println("Enter the amount to withdraw");
    			float amount1 = sc.nextFloat();
    			
    			boolean withdraw=service.withdraw(amount1);
    			
    			if (withdraw) {
    				System.out.println("amount withdrawn is ! "+amount1);
    			} else {
    				System.out.println("Invalid account number");
    			}
    		}
    		
    		
    		public static void creatAccount()
    		{
    			CustomerDetails custDetails=new CustomerDetails();
    			AccountDetails accDetails= new AccountDetails();
    			BankService service=new BankService();
    			AccountDataValidate validate=new AccountDataValidate();
    			
    			Scanner sc = new Scanner(System.in);
    			
    			System.out.println(" enter your name please");
    			String customerName=sc.nextLine();
    			
    			
    			System.out.println("enter password you want to create");
    			String password=sc.nextLine();
    			
    			System.out.println("enter the user name you want(min lenght 4,include a-z,A-Z,0-9,no characters ");
    			String username=sc.nextLine();
    			
    			System.out.println("enter 10 digit phone number");
    			String phoneNumber=sc.nextLine();
    			
    			System.out.println("enter email id");
    			String emailId=sc.nextLine();
    			
    			System.out.println("enter your initial balance");
    			float initialBal=sc.nextFloat();
    			
    			sc.nextLine();
    			
    			long customerTid=(long)(Math.random() * 1234 + 9999);
    			
    			boolean isValidPhoneNumber=validate.validatePhoneNumber(phoneNumber);
    			boolean isValidInitialBal=validate.validateInitialBal(initialBal);
    			
    			if(isValidPhoneNumber && isValidInitialBal )
    			{
    				
        			custDetails.setCustomerName(customerName);
        		    custDetails.setEmailId(emailId);
        		    custDetails.setPhoneNumber(phoneNumber);
        		    custDetails.setUsername(username);
        		    custDetails.setPassword(password);
        		    accDetails.setInitialBal(initialBal);
        		    accDetails.setCustomerTid(customerTid);
        		    
        		    
					//accDetails.setBalance(balance);
        		    
        		    
        		    accDetails.setCustDetails(custDetails);
        			boolean b = service.addCustomer(accDetails);
        			
        			
        			if (b) {
        				System.out.println("Account Created. Account number is...." + customerTid);
        			} else {
        				System.out.println("Account not created");
        			}

        		} else 
        		{
        			System.out.println("Please enter correct details");
        		}
    			
    		}
    		public static void showBalance() 
    		{
               // Scanner sc = new Scanner(System.in);
                BankService service = new BankService();
    			float details = service.showBalance();
    			System.out.println(details);

    		}
    		
    		private static void printTransaction()
    		{
    			BankService service = new BankService();
    			
    			System.out.println(service.printTransaction());

    		}
   }

    			
    	
