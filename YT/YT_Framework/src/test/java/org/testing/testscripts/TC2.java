package org.testing.testscripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testing.pages.Login;
import org.testing.utilities.Logs;
import org.testing.utilities.Screenshots;
import org.testng.annotations.Test;

import orgtesting.base.Base;

public class TC2 extends Base
{
  @Test
  public void signinSubscription() throws InterruptedException, IOException
  {
	 
	 try {
		 
		 Login l=new Login(driver,pr);
		 l.signin("reena@abbieit.com", "Reena@9590");
		 Logs.takelogs("TC2", "tc 2 login");
		 Thread.sleep(1000);
	     WebElement Subscription=driver.findElement(By.xpath(pr.getProperty("Subscription")));
	  Subscription.click();
	  Screenshots.takescreenshot(driver, "F:\\Eclipse\\screenshots\\TC2.png");
	  Logs.takelogs("TC2", "TC2 pass");
	  
  }
  catch(Exception e)
	 {
	  Screenshots.takescreenshot(driver, "F:\\Eclipse\\screenshots\\TC2failed.png");
	  Logs.takelogs("TC2", "TC2 failed");
	 }

  }

}