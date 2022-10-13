package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Flipkart_following_sibling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium folder\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
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
        String result = driver.findElement(By.xpath("//div[contains(text(),'APPLE iPhone 11 (Black, 64 GB)')]")).getText();
        String price=driver.findElement(By.xpath("//div[contains(text(),'APPLE iPhone 11 (Black, 64 GB)')]/../following-sibling::div/div/div/div[contains(text(),'46,999')]")).getText();
        System.out.println(result +"------->"+price);

        
        driver.close();

	}

}
