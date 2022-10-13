package usefull_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime_login {
	
    ChromeDriver driver;
	public static void main(String[] args) throws InterruptedException {
    	
    	Actitime_login a1=new Actitime_login();
    	a1.LaunchBrowser();
    	Thread.sleep(2000);
    	a1.Mousehovermessage();
    	Thread.sleep(3000);
    	a1.getlocation_and_size();
    	Thread.sleep(3000);
    	a1.gettagname();
    	Thread.sleep(3000);
    	a1.RenameuserName();
	}
    	
    	public void LaunchBrowser()
    	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium folder\\chromedriver.exe");
		 driver =new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
    	}
    	public void Mousehovermessage()
    	{
		WebElement s=driver.findElement(By.xpath("//input[@type='checkbox']"));
		System.out.println("mouse hover message is : "+s.getAttribute("title"));
		    if(s.isEnabled())
		   {
			System.out.println("element is enabled");
		   }
		   else
		   {
			System.out.println("element is disabled");
		   }
    	}
		public void getlocation_and_size()
		{
			WebElement s=driver.findElement(By.xpath("//input[@type='checkbox']"));
			System.out.println("location of the element is : "+s.getLocation());
			System.out.println("Dimensions of the element is : "+s.getSize());
			 if(s.isDisplayed())
			   {
				System.out.println("Check box is displayed");
			   }
			   else
			   {
				System.out.println("Checkbox is not displayed");
			   }
		}
		public void gettagname()
		{
			WebElement s=driver.findElement(By.xpath("//input[@type='checkbox']"));
			System.out.println("tagname of element is : "+s.getTagName());
			 if(s.isSelected())
			   {
				System.out.println("Check box is selected");
			   }
			   else
			   {
				System.out.println("Checkbox is not selected");
			   }
		}
		public void RenameuserName() throws InterruptedException
		{
			WebElement s=driver.findElement(By.xpath("//input[@name='username']"));
			s.sendKeys("admin1234");
			Thread.sleep(3000);
			s.clear();
			Thread.sleep(3000);
			s.sendKeys("admin");
			Thread.sleep(2000);
			driver.close();
		}
}
