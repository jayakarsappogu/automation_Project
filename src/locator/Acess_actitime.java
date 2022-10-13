package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Acess_actitime 
{

	    ChromeDriver driver;
	    public static void main(String[] args) throws InterruptedException 
	    {
		Acess_actitime a1=new Acess_actitime();
		
	     a1.BrowserLuanch();
	     Thread.sleep(3000);
	     a1.Logincredential();
	     a1.perfomtask();
	     Thread.sleep(3000);
	   }
	   public void BrowserLuanch() 
	   {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium folder\\chromedriver.exe");
		driver =new ChromeDriver();
	
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
	   }
	   public void Logincredential()
	   {
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@class='textField pwdfield']")).sendKeys("manager");
        driver.findElement(By.xpath("//input[@type='checkbox']")).click();
        driver.findElement(By.xpath("//a[@id='loginButton']")).click();
	   }
	   public void perfomtask() throws InterruptedException
	   {
        Thread.sleep(4000);
        driver.findElement(By.xpath("//div[@id='container_tasks']")).click();
        driver.findElement(By.xpath("//div[@class='addNewButton']")).click();
        driver.findElement(By.xpath("//div[@class='item createNewCustomer']")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//input[@class='inputFieldWithPlaceholder newNameField inputNameField']")).sendKeys("Jayakar1");
        Thread.sleep(4000);
        driver.findElement(By.xpath("//textarea[@placeholder='Enter Customer Description']")).sendKeys("Hello srajinikath");
        Thread.sleep(4000);
        driver.findElement(By.xpath("//div[@class='components_button withPlusIcon']")).click();
        Thread.sleep(3000);
        String actual=driver.findElement(By.xpath("//div[@class='titleEditButtonContainer']")).getText();
        System.out.println(actual);
        Thread.sleep(3000);
        String expacted="Jayakar";
        
          if(actual.equals(expacted))
          {
        	System.out.println("Created succesusfully");
          }
          else
          {
        	System.out.println("Not Created succesusfully");
          }
	   }
}
	   
	


