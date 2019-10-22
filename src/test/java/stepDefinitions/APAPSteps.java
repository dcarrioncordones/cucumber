package stepDefinitions;

import org.openqa.selenium.WebDriver;

import base.APAPBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utils.WebDriverBase;

public class APAPSteps {
	
	private WebDriver driver;
	private WebDriverBase driverBase;
	
	@Given("Inicializo el navegador")
	public void initializeBrowser() {
		driverBase = new WebDriverBase();
		driver = driverBase.initChrome();
	}
	
	@Given("Entro en APAP")
	public void accessAPAP() {
		APAPBase base = new APAPBase(driver);
		base.ingresarAPAP();
	}
	
	@And("Clickeo en Prestamos")
	public void clickPrestamos() {
		APAPBase base = new APAPBase(driver);
		base.clickPrestamos();
	}
	
	@Then("Imprimo la informacion")
	public void imprimirInformacion() {
		APAPBase base = new APAPBase(driver);
		base.imprimirInformacion();
	}
	
	@And("Cierro el navegador")
	public void closeBrowser() {
		driverBase.closeDriver();
	}

}
