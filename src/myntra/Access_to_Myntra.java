package myntra;

import org.openqa.selenium.chrome.ChromeDriver;

public class Access_to_Myntra {

	public static void main(String[] args) throws InterruptedException  {
     System.getProperty("webdriver.chrome.driver", "D:\\\\Selenium folder\\\\chromedriver.exe");
     ChromeDriver driver=new ChromeDriver();
     driver.get("https://www.amazon.in/");
     Thread.sleep(2000);
     

	}

}
