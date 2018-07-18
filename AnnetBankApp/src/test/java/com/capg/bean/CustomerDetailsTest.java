package com.capg.bean;

import junit.framework.TestCase;

public class CustomerDetailsTest extends TestCase 
{
	CustomerDetails details=new CustomerDetails();
	
	public void testGetCustomerName() 
	{
		assertEquals("Valid","Annet","Annet");
		assertEquals("Invalid"," "," ");
		assertEquals("Invalid",123,123);
		assertNotSame("Annet","Ann");
		assertNotSame("Annet",1234);
		
		details.setCustomerName("Annet");
		assertEquals("annet",details.getCustomerName());
		assertNotSame("1a3af",details.getCustomerName());
	}

	

	public void testGetEmailId() 
	{
		assertEquals("annet@gmail.com","annet@gmail.com");
		assertNotSame("annet@gmail.com","ann");
		assertNotSame("annet@gmail.com",1234);
		assertNotSame("annet@gmail.com"," ");
		
		details.setEmailId("annet@gmail.com");
		assertEquals("annet@gmail.com",details.getEmailId());
		assertFalse("1a3af".equals(details.getEmailId()));
	}

	

	public void testGetPhoneNumber()
	{
		assertEquals(1745231234, 1745231234);
		assertNotSame(1234567896," ");
		assertNotSame(1234567896,"abcd");
		assertNotSame(1234567896,2345);
		
		assertFalse(" ".equals(details.getPhoneNumber()));
		assertFalse("abcd".equals(details.getPhoneNumber()));
		assertTrue("1876541231 ".equals(details.getPhoneNumber()));
	}

	
	public void testGetUsername()
	{
		
		assertEquals("annet",details.getUsername());
		assertNotSame("1a3af",details.getUsername());
		assertNotSame(" ",details.getUsername());
	}

	
	public void testGetPassword() 
	{
		assertEquals("hello123","hello123");
		assertNotSame("hello123"," ");
		assertNotSame("hello123"," hello");
		assertNotSame("hello123",1234);
		
		assertFalse(" ".equals(details.getPassword()));
		assertFalse(" hello123".equals(details.getPassword()));
		
	}

	


}
