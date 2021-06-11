package june10;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class OrangeHrm {
	WebDriver driver;
	String node="http://localhost:9870/wd/hub";
	DesiredCapabilities cap;
	@Parameters({"Browser"})
	@BeforeTest
	  public void setUp(String brw) throws MalformedURLException 
	{
		
	if(brw.equalsIgnoreCase("chrome"))
	{
		cap= new DesiredCapabilities();
		Reporter.log("Executing on chrome",true);
		cap.setBrowserName("chrome");
		driver = new RemoteWebDriver(new URL(node), cap);
	}
	else if(brw.equalsIgnoreCase("firefox"))
	{
		cap= new DesiredCapabilities();
		Reporter.log("Executing on Firefox",true);
		cap.setBrowserName("firefox");
		driver = new RemoteWebDriver(new URL(node), cap);
	}
	}
  @Test(dataProvider = "supplyData")
  public void VerifyLogin(String username,String password) throws Throwable
  {
	  driver.get("http://orangehrm.qedgetech.com/");
	  driver.manage().window().maximize();
	  Thread.sleep(5000);
	  driver.findElement(By.name("txtUsername")).sendKeys(username);
	  driver.findElement(By.name("txtPassword")).sendKeys(password);
	  driver.findElement(By.name("Submit")).click();
	  Thread.sleep(3000);
	  if(driver.getCurrentUrl().contains("dashboard"))
	  {
		  Reporter.log("Login Success",true);
	  }
	  else
	  {
		  Reporter.log("Login fail",true);
	  }
  }

  @DataProvider
  public Object[][] supplyData() {
   Object login [][]= new Object[4][2];
   login[0][0]="Admin";
   login[0][1]="Qedge123!@#";
   login[1][0]="Admin2";
   login[1][1]="Qedge123!@#";
   login[2][0]="Admin";
   login[2][1]="Qedge123!@#";
   login[3][0]="Admin";
   login[1][1]="Qedge123!@#";
   return login;
  }
  

  @AfterTest
  public void tearDown() {
	  driver.close();
  }

}
