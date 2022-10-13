package sourcecode;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sourcecode {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium folder\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("harishchandu1305@ gmail.com");
		driver.findElement(By.id("pass")).sendKeys("h.9492281302");
		Thread.sleep(2000);
		driver.findElement(By.name("login")).click();
	

	}

}
