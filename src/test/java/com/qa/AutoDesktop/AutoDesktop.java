package com.qa.AutoDesktop;

public interface AutoDesktop {
	
	String EMAIL_NAME_LOCATOR = "email";
	 String LOGIN_LINK_LOCATOR = "Login";
	 String PASSWORD_NAME_LOCATOR = "password";
	 
	 //Test Data
	 String TEST_DATA_EMAILID = "katy@yahoo.com";
	 String TEST_DATA_EMIALID2 = "priya@yahoo.com";
	 String TEST_DATA_PASSWORD2 = "paper";
	 String TEST_DATA_PASSWORD1 = "paper1";
	
	 //Message
	 String  INVALID_USERNAME_PASSWORD_TEXT = "Invalid Username / Password!";
	 
	 //Urls
	 String INVALID_USERNAME_PASSWORD_URL = "http://ecommerce.saipratap.net/customerlogin.php?msg=lnvalid";
	 String LOGGEDIN_URL = "http://ecommerce.saipratap.net/thankyoumessage.php?msg=login";
	 String HOMEPAGE_LOGIN_URL = "http://ecommerce.saipratap.net/customerlogin.php";
	 
	 //Locators
	 String USERNAME_ID_LOCATOR = "id";
	 String PASSWORD_ID_LOCATOR = "id";
     String LOGIN_LINKTEXT_LOCATOR  = "Login";
     
     //TestData
     
}
