package base;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import pageobjects.APAPPO;

public class APAPBase {
	
	private WebDriver driver;
	private final String APAP_URL = "https://www.apap.com.do";
	
	public APAPBase(WebDriver driver) {
		this.driver = driver;
	}
	
	public void ingresarAPAP() {
		driver.manage().window().maximize();
		driver.get(APAP_URL);
	}
	
	public void clickPrestamos() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,650)");
		APAPPO apapPO = new APAPPO(driver);
		apapPO.getOpcionPrestamos().click();
	}
	
	public void imprimirInformacion() {
		APAPPO apapPO = new APAPPO(driver);
		System.out.println("\n***PRÉSTAMOS***");
		System.out.println(apapPO.getTextoPrestamos().getText() + "\n");
		
	}

}
