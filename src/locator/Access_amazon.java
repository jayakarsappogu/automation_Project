package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Access_amazon {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium folder\\chromedriver.exe");
		
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("shoes"); 
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);
		String s=driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base'])[1]")).getText();
		Thread.sleep(3000);
		System.out.println(s);
		Thread.sleep(3000);
	    String s1=driver.findElement(By.xpath("(//span[@class='a-price-whole'])[4]")).getText();
	    Thread.sleep(3000);
	    System.out.println(s1);
	    driver.close();
		
	}

}
