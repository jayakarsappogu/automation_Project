package section_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_and_Drop_Operation {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium folder\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		Actions act =new Actions(driver);
		
		WebElement dragstockholm=driver.findElement(By.xpath("(//div[text()='Stockholm'])[2]"));
		WebElement drapitaly=driver.findElement(By.xpath("(//div[text()='Italy'])"));
		act.dragAndDrop(dragstockholm, drapitaly).perform();
	    Thread.sleep(2000);
	    
	    WebElement dragwashington =driver.findElement(By.xpath("(//div[text()='Washington'])[2]"));
	    WebElement dropspain =driver.findElement(By.xpath("(//div[text()='Spain'])"));
	    act.dragAndDrop(dragwashington, dropspain).perform();
	    Thread.sleep(2000);
	    
	    WebElement dragCopenhagen =driver.findElement(By.xpath("(//div[text()='Copenhagen'])[2]"));
	    WebElement dropNorway =driver.findElement(By.xpath("(//div[text()='Norway'])"));
	    act.dragAndDrop(dragCopenhagen, dropNorway).perform();
	    Thread.sleep(2000);
	    
	    WebElement dragSeoul =driver.findElement(By.xpath("(//div[text()='Seoul'])[2]"));
	    WebElement dropDenmark =driver.findElement(By.xpath("(//div[text()='Denmark'])"));
	    act.dragAndDrop(dragSeoul, dropDenmark).perform();
	    Thread.sleep(2000);
	    
	    WebElement dragRome =driver.findElement(By.xpath("(//div[text()='Rome'])[2]"));
	    WebElement dropSouthKorea =driver.findElement(By.xpath("(//div[text()='South Korea'])"));
	    act.dragAndDrop(dragRome, dropSouthKorea).perform();
	    Thread.sleep(2000);
	    
	    WebElement dragMadrid =driver.findElement(By.xpath("(//div[text()='Madrid'])[2]"));
	    WebElement dropSweden =driver.findElement(By.xpath("(//div[text()='Sweden'])"));
	    act.dragAndDrop(dragMadrid, dropSweden).perform();
	    Thread.sleep(2000);
	    
	    WebElement dragOslo =driver.findElement(By.xpath("(//div[text()='Oslo'])[2]"));
	    WebElement dropUnitedStates =driver.findElement(By.xpath("(//div[text()='United States'])"));
	    act.dragAndDrop(dragOslo, dropUnitedStates).perform();
	    Thread.sleep(5000);
	    
	    driver.close();

	}

}
