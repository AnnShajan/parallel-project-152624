package com.capg.bean;

public class AccountDetails 
{
	

	private long customerTid;
	
     private float initialBal;
     
     
     
     private CustomerDetails custDetails;
     
     public float getInitialBal() 
     {
 		return initialBal;
 	}
 	public void setInitialBal(float initialBal) 
 	{
 		this.initialBal = initialBal;
 	}

 	
  
public long getCustomerTid() {
	return customerTid;
}
public void setCustomerTid(long customerTid) {
	this.customerTid = customerTid;
}

public CustomerDetails getCustDetails() 
	{
		return custDetails;
	}

	public void setCustDetails(CustomerDetails custDetails) {
		this.custDetails = custDetails;
	}
 


}
