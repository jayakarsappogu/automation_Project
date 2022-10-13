package section_2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple_WebElement_Handle {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium folder\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.get("\"https://www.flipkart.com/\"");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='X'"));
     	WebElement element=	driver.findElement(By.xpath("//input[@type='text'"));
    	element.sendKeys("i-phone 11");
    	element.submit();
       List<WebElement> lst=driver.findElements(By.xpath("(//div[@class='_30jeq3 _1_WHN1'])"));
       Thread.sleep(3000);
       for(WebElement w:lst)
       {
    	   System.out.println(w.getText());
       }
       Thread.sleep(3000);
       driver.close();
	}
	
}
