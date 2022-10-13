package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Acces_hrml_web {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium folder\\chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("7780507236");
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("7780507236");
		Thread.sleep(3000);
		driver.findElement(By.id("loginbutton")).click();
	}

}
