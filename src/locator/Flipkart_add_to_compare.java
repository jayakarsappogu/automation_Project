package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_add_to_compare {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium folder\\chromedriver.exe" );
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("iphone 11");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[contains(text(),'APPLE iPhone 11 (Black, 64 GB)')]/../../preceding-sibling::div/div/following-sibling::div/div[@class='_3PzNI-']")).click();
        Thread.sleep(2000);
       // driver.findElement(By.xpath("(//div[@class='_24_Dny'])[13]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//div[@class='_24_Dny'])[36]")).click();
        
	}

}
