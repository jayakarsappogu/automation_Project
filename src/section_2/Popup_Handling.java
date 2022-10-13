package section_2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Popup_Handling {

	public static void main(String[] args) {
		System.setProperty( "webdriver.chrome.driver", "D:\\Selenium folder\\chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("https://demo.actitime.com/login.do");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.manage().window().maximize();
		 driver.findElement(By.cssSelector("input#username")).sendKeys("admin");
		 driver.findElement(By.cssSelector("input.textField.pwdfield")).sendKeys("manager");
		 driver.findElement(By.cssSelector("div#keepLoggedInCheckBoxContainer")).click();
		 driver.findElement(By.cssSelector("a#loginButton")).click();
		 driver.findElement(By.xpath("//div[@id='container_tasks']")).click();
		 driver.findElement(By.xpath("(//div[@class='checkbox inactive'])[1]")).click();
		 driver.findElement(By.xpath("//div[@class='delete button']")).click();
		 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		 wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//div[contains(text(),'You are about to delete')]"))));
         String deletemsg=driver.findElement(By.xpath("//div[contains(text(),'You are about to delete')]")).getText();
         System.out.println(deletemsg);
         driver.close();
         
		 

	}

}
