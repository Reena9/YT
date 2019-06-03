package org.testing.pages;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login

{
	public ChromeDriver driver;
	public Properties pr;
	
	
	public Login(ChromeDriver driver,Properties pr)
	{
		this.driver=driver;
		this.pr=pr;
	}
	
	public void signin(String Email,String Password) throws InterruptedException
	
	{
		WebElement signin=driver.findElement(By.xpath(pr.getProperty("signin")));
		 signin.click();
		 
		 WebElement Email1=driver.findElement(By.xpath(pr.getProperty("Email")));
		 Email1.sendKeys("reena@abbieit.com");
		 
		 Thread.sleep(1000);
		 WebElement Next=driver.findElement(By.xpath(pr.getProperty("Next")));
		 Next.click();
		 
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 WebElement Password1=driver.findElement(By.xpath(pr.getProperty("Password")));
		 Password1.sendKeys("Reena@9590");
		 
		 Thread.sleep(1000);
		  WebElement Next2=driver.findElement(By.xpath(pr.getProperty("Next2")));
		 Next2.click();
		 Thread.sleep(5000);
	}

	
		
	}

