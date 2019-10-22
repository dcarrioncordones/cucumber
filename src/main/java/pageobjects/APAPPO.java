package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class APAPPO {
	
	private WebDriver driver;
	private WebDriverWait driverWait;
	
	public APAPPO (WebDriver driver) {
		this.driver = driver;
		driverWait = new WebDriverWait(driver, 20);
	}
	
	public WebElement getOpcionPrestamos() {
		WebElement element = driver.findElement(By.xpath("//a[contains(@class, 'nav-link tab-link text-center text-gray') and contains(text(), 'Préstamos')]"));
		return driverWait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public WebElement getTextoPrestamos() {
		WebElement element = driver.findElement(By.xpath("//li[contains(@style, 'z-index: 7')]/child::div/child::div/child::p"));
		return driverWait.until(ExpectedConditions.elementToBeClickable(element));
	}

}
