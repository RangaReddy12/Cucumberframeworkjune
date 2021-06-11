package stepDenfinations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinations {
	WebDriver driver;
	@Given("^i Enter url in chrome browser$")
	public void i_Enter_url_in_chrome_browser() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E://chromedriver.exe");
	   	 driver = new ChromeDriver();
	   	 driver.get("http://orangehrm.qedgetech.com/");
	   	 driver.manage().window().maximize();
	}

	@When("^i enter username$")
	public void i_enter_username() throws Throwable {
	    driver.findElement(By.name("txtUsername")).sendKeys("Admin");
	}

	@When("^i enter password$")
	public void i_enter_password() throws Throwable {
		driver.findElement(By.name("txtPassword")).sendKeys("Qedge123!@#");
	}

	@When("^i click on login button$")
	public void i_click_on_login_button() throws Throwable {
		driver.findElement(By.name("Submit")).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
	}

	@Then("^i verify text in url$")
	public void i_verify_text_in_url() throws Throwable {
	    if(driver.getCurrentUrl().contains("dashboard"))
	    {
	    	System.out.println("Login succcess");
	    }
	    else
	    {
	    	System.out.println("Login Fail");
	    }
	}

	@Then("^i close browser$")
	public void i_close_browser() throws Throwable {
	    driver.close();
	}

}
