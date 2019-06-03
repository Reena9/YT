package org.testing.pages;

import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Videoplay 
{
	ChromeDriver driver;
	Properties pr;
	
	public Videoplay(ChromeDriver driver,Properties pr)
	{
		this.driver=driver;
		this.pr=pr;
		
	}
	public void play()
	{
		List<WebElement> Videoplay=driver.findElements(By.id(pr.getProperty("Videoplay")));
       System.out.println("Videos " + Videoplay.size());
       Videoplay.get(3).click();
	}
}