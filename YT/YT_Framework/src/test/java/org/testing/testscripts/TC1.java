package org.testing.testscripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testing.Assert.Assert1;
import org.testing.pages.Login;
import org.testing.utilities.Logs;
import org.testing.utilities.Screenshots;
import org.testng.annotations.Test;

import orgtesting.base.Base;

public class TC1 extends Base
{
  @Test
  public void signinTrending() throws IOException
  {
	  try
	  {
		  
	  Login l= new Login(driver,pr);
	  l.signin("reena@abbieit.com", "Reena@9590");
	  Logs.takelogs("TC1", "login successfully");
	  Thread.sleep(5000);
	 
	  
	  String expected="https://www.youtube.com/";
		 
		 Assert1.compare(expected, driver.getCurrentUrl());
		 
		 
		 
	 WebElement Trending=driver.findElement(By.xpath(pr.getProperty("Trending")));
	 Trending.click();
	 
	
	
	 
	 Screenshots.takescreenshot(driver, "F:\\Eclipse\\screenshots\\TC1.png");
	 Logs.takelogs("TC1", "tc1 PASSESD");
	  }
	 
	
	 catch(Exception e)
	 {
		Screenshots.takescreenshot(driver, "F:\\\\Eclipse\\\\screenshots\\\\TC1 failed.png"); 
		Logs.takelogs("TC1", "TC1 failed");
	 }

	
  }
  
 
	
	  
  }