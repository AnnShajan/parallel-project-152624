
package com.capg.service;

public class AccountDataValidate {

	public boolean validatePhoneNumber(String phoneNumber)
	{
		if(phoneNumber.length()==10)
		return true;
		else
			return false;
	}

public boolean validateInitialBal(float initialBal) 
{
		if (initialBal >= 500) 
		{
			return true;
		} 
		else 
		{
			return false;
		}
}
	
/*public boolean validatePassword(String password) 
{
	if ( (password.length() >= 4) && (password.matches("[a-z]")) && (password.matches("[A-Z]")) && ( password.matches("[0-9]") && ( password.matches("*"))))
	         return true;
	     else
	         return false;	
	
}

public boolean validateUserName(String username) {
	
	if ( (username.length() >= 4) && (username.matches("[a-z]")) && (username.matches("[A-Z]")) && ( username.matches("[0-9]")) )
         return true;
     else
         return false;	

}
*/

}
