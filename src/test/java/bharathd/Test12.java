package bharathd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Test12 {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/geckodriver.exe");
	}
	
	@Test
	public void testOne()
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.seleniumhq.org/");
		System.out.println(driver.getTitle());
		driver.close();
	}

}
