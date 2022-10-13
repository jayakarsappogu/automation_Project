package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime {

	public static void main(String[] args) {
		System.setProperty( "webdriver.chrome.driver", "D:\\Selenium folder\\chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("https://demo.actitime.com/login.do");
		 driver.manage().window().maximize();
		 driver.findElement(By.cssSelector("input#username")).sendKeys("admin");
		 driver.findElement(By.cssSelector("input.textField.pwdfield")).sendKeys("manager");
		 driver.findElement(By.cssSelector("div#keepLoggedInCheckBoxContainer")).click();
		 driver.findElement(By.cssSelector("a#loginButton")).click();
	}

}
