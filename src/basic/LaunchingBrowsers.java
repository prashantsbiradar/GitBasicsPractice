package basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchingBrowsers {
	@Test
	public void launchBrowsers(){
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/login.do;jsessionid=5dvljnd6lq3e");
//		Dimension d = new Dimension(500, 500);
//		driver.manage().window().setSize(d);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("\\Eu035");
		//driver.quit();
		
	}

}
