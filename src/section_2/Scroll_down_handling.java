package section_2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_down_handling {
	public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium folder\\chromedriver.exe" );
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(3000);
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	Thread.sleep(3000);
	WebElement element=driver.findElement(By.xpath("//input[@type='text']"));
	element.sendKeys("iphone 11");
	element.submit();
	
	JavascriptExecutor jase =(JavascriptExecutor)driver;
	Thread.sleep(4000);
	jase.executeScript("window.scrollBy(0,4000);");
			
	//Thread.sleep(3000);
	}

}
