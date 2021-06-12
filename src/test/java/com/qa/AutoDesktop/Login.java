package com.qa.AutoDesktop;

import static org.junit.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

	public class Login implements AutoDesktop {
		public static void main (String args[])
		{
			System.setProperty("webdriver.chrome.driver","C:/DRIVERS/LatestChrome4/chromedriver.exe");

			WebDriver driver = new ChromeDriver();
			
			driver.get("https://icomplete.wellsfargo.com/oas/status/personal-loans-rate-checker/getting-started/");
			
			
			  //System.out.println("The title of the page is " +title);
			   driver.findElement(By.id(USERNAME_ID_LOCATOR)).sendKeys("Indira");
			   driver.findElement(By.id(PASSWORD_ID_LOCATOR)).sendKeys("indira");
			   driver.findElement(By.id(LOGIN_LINKTEXT_LOCATOR)).click();
			  // driver.findElement(By.linkText("Login")).click();		       
			 
			   String title = driver.getTitle();
			   assertEquals(title,"Getting Started");
			   //assertEquals(message, expected, actual, delta);
			   
			   
		}

	}


