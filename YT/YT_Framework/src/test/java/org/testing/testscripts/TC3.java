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

public class TC3 extends Base
{
  @Test
  public void videoplayLike () throws IOException
  {
	  try
	  {
	  Login l=new Login(driver,pr);
	  l.signin("reena@abbieit.com", "Reena@9590");
	  Logs.takelogs("TC3", "TC3 login successful");
	  Videoplay vp=new Videoplay(driver,pr);
	  vp.play();
	  Thread.sleep(5000);
	 WebElement Like=driver.findElement(By.xpath(pr.getProperty("Like")));
	 Like.click();
	 Screenshots.takescreenshot(driver, "F:\\Eclipse\\screenshots\\TC3.png");
	 Logs.takelogs("TC3", "TC3 passed");
	 
  }
  catch(Exception e)
  {
 Screenshots.takescreenshot(driver, "F:\\Eclipse\\screenshots\\TC3failed.png");
 Logs.takelogs("TC3", "TC3 failed");
 
  }


}
}
