package locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ByAll {
	@Test
	public void launchBrowsers() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/login.do");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		//driver.findElement(new org.openqa.selenium.support.pagefactory.ByAll(By.className("textField"), By.id("username"), By.name("username"), By.xpath("//input[id='username']"))).sendKeys("admin");
	}
	

}


