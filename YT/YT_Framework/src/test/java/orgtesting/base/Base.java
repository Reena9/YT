package orgtesting.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base
{
	public ChromeDriver driver;
	public Properties pr;
	
  @BeforeMethod
  public void browserlaunch() throws IOException 
  
  {
	  
	  File f=new File("../YT_Framework/or.properties");
	  FileInputStream fi=new FileInputStream(f);
	  pr=new Properties();
	  pr.load(fi);
	  System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		option.addArguments("disable-notifications");
		driver=new ChromeDriver(option);
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
	  
	  
  }

  @AfterMethod
  public void close() 
  {
	  
	  driver.close();
  }
  

}

