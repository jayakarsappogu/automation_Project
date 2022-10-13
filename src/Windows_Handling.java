import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows_Handling {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","D:\\Selenium folder\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement ele=driver.findElement(By.xpath("//input[@name='username']"));
		ele.sendKeys("Admin");
		WebElement ele1=driver.findElement(By.xpath("//input[@name='password']"));
		ele1.sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']"));
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		String windowid = driver.getWindowHandle();
		Set<String> windowsid = driver.getWindowHandles();
		
		for(String id:windowsid)
		{
			if(id.equals(windowid));
			String title = driver.getTitle();
			System.out.println(title);
			driver.close();
			
		}
		

	}

}
