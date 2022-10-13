package section2;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Window_handling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium folder\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		WebElement element=driver.findElement(By.xpath("//input[@type='text']"));
				element.sendKeys("iphone 11");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
 driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
 String parentid=driver.getWindowHandle();
 Set<String> childid=driver.getWindowHandles();
	for(String h1:childid)
	{
		if(!parentid.equals(h1))
		{
			driver.switchTo().window(h1);
		}
	}
	String element1=driver.findElement(By.xpath("//span[@class='B_NuCI']")).getText();
	System.out.println("child class session id:"+element1);

}
}
