package stepDenfinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("");
		driver.findElement(By.name("")).sendKeys("Admin");
		driver.findElement(By.name("")).sendKeys("Admin");
		driver.findElement(By.name("")).sendKeys("Admin");
		driver.findElement(By.name("")).sendKeys("Admin");
		driver.findElement(By.name("")).sendKeys("Admin");
		driver.findElement(By.name("")).sendKeys("Admin");
		driver.findElement(By.name("")).sendKeys("Admin");
	}

}
