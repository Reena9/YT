package org.testing.testscripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testing.pages.Login;
import org.testing.pages.Videoplay;
import org.testing.utilities.Logs;
import org.testing.utilities.Screenshots;
import org.testng.annotations.Test;

import orgtesting.base.Base;

public class TC4 extends Base
{
  @Test
  public void videoplaySubscribe () throws IOException
  
  {
		 try {
			 
	  Login l=new Login(driver,pr);
	  l.signin("reena@abbieit.com", "Reena@9590");
	  Videoplay vp=new Videoplay(driver,pr);
	  vp.play();
	
	  
	  Thread.sleep(1000);
	 
	  WebElement Subscribe=driver.findElement(By.xpath(pr.getProperty("Subscribe")));
	     Subscribe.click();
	     Screenshots.takescreenshot(driver, "F:\\Eclipse\\screenshots\\TC4.png");
	 Logs.takelogs("TC4", "TC4 passed");
  }
  
		 catch(Exception e)
		 {
			 Screenshots.takescreenshot(driver, "F:\\Eclipse\\screenshots\\TC4failed.png");
			 Logs.takelogs("TC4", "TC4 Failed");
		 }

  }

}