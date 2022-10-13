package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Access_Ebay {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium folder\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.ebay.com/");
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("nike shoes");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
       String result= driver.findElement(By.xpath("//h1[@class='srp-controls__count-heading']")).getText();
	    System.out.println(result);
	}

}
