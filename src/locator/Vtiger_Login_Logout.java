package locator;

import org.openqa.selenium.chrome.ChromeDriver;

public class Vtiger_Login_Logout
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium folder\\chromedriver.exe");
    	ChromeDriver driver = new ChromeDriver();
    	driver.get("http://localhost:8888");
    	driver.manage().window().maximize();
	}

}
