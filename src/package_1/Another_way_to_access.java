package package_1;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;
public class Another_way_to_access {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium folder\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.myntra.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.navigate().to("https://www.flipkart.com/");
		
		Navigation nav=driver.navigate();
		nav.back();
		Thread.sleep(3000);
		nav.forward();
		Thread.sleep(3000);
		nav.refresh();
		driver.close();
	}

}
