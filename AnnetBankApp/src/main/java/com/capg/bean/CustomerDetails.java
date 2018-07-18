package com.capg.bean;

public class CustomerDetails 
{
	private String customerName;
	private String emailId;
    private String phoneNumber;
    private String username;
    private String password;
    
   

public String getCustomerName() 
{
	return customerName;
}
public void setCustomerName(String customerName) 
{
	this.customerName = customerName;
}
public String getEmailId() 
{
	return emailId;
}
public void setEmailId(String emailId) 
{
	this.emailId = emailId;
}
public String getPhoneNumber()
{
	return phoneNumber;
}
public void setPhoneNumber(String phoneNumber) 
{
	this.phoneNumber = phoneNumber;
}

public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword()
	{
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
@Override
public String toString() {
	return "CustomerDetails [customerName=" + customerName + ", emailId=" + emailId + ", phoneNumber=" + phoneNumber
			+ "]";
}



}

	


