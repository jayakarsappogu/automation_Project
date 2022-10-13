package section_2;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Search_for_Virat_age 
	 {

			public static void main(String[] args) throws InterruptedException {
				System.setProperty("webdriver.chrome.driver", "D:\\Selenium folder\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("https://www.google.com/");
				driver.manage().window().maximize();
				Thread.sleep(3000);
			WebElement element=driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
			element.sendKeys("virat kohli");
			Thread.sleep(3000);
			List<WebElement> lst=driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
			Thread.sleep(3000);
			for(WebElement h:lst)
			{
				String s=h.getText();
				if(s.contains("age"))
				{
					h.click();
					break;
				}
	         	Thread.sleep(3000);
			}

		}
}
