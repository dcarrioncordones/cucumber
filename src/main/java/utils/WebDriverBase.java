package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBase {
	
	private WebDriver driver;
	
	public WebDriver initChrome() {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}

	public void closeDriver() {
		driver.quit();
		driver = null;
	}

	public WebDriver returnDriver() {
		return driver;
	}

}
