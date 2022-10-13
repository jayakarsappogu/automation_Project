package package_1;

import java.util.NavigableMap;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class Open_two_webpages {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium folder\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/");
		Thread.sleep(3000);
		driver.get("https://www.flipkart.com/");
		Navigation nav=driver.navigate();
        Thread.sleep(2500);
        //nav.back();
        driver.navigate().back();
       
driver.close();
	}

}
