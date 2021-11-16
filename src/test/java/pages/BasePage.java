package pages;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.Report;

/**
 * @author Victor Orrego
 * @version 1.0
 * @since Marzo 30, 2020.
 */
public class BasePage {
	private WebDriver driver;
	private Report report;
	protected static WebDriverWait wait_60s;
	protected static WebDriverWait wait_30s;
	protected static WebDriverWait wait_10s;
	protected static WebDriverWait wait_5s;
	protected static WebDriverWait wait_2s;


	public BasePage(WebDriver driver, Report report) {
		this.driver = driver;
		this.report = report;
		BasePage.wait_60s = new WebDriverWait(driver, 60);
		BasePage.wait_30s = new WebDriverWait(driver, 30);
		BasePage.wait_10s = new WebDriverWait(driver, 10);
		BasePage.wait_5s = new WebDriverWait(driver, 5);
		BasePage.wait_2s = new WebDriverWait(driver, 2);
		PageFactory.initElements(this.driver, this);
	}

	public void goToHomePage() throws Throwable {
		try {

			driver.get("https://auth-panama-sandbox.qvantel.systems/auth/realms/qvantel/protocol/openid-connect/auth?ui_locales=en&scope=openid&response_type=code&redirect_uri=https%3A%2F%2Fsct-panama-sandbox.qvantel.systems%3A443%2Foauth2%2Fcallback&state=ca833e5a-df2e-4b1e-9652-e40afa74da7f%7C%2F&client_id=sales-and-care-toolbox");
			report.testPass("Se ingresa a la pagina de inicio", "goToHomePage", true);
		} catch (Throwable t) {

			report.testFail("no se desplego la página de inicio.", "goToHomePage", true);
			throw t;
		}
	}
public void Login(String menuname) throws Throwable {

		try {
			driver.findElement(By.xpath("//input[@id='kc-login']")).click();
			Thread.sleep(1000);
			report.testPass("Se hace click en la seccion " +  false);
		} catch (Throwable t) {

			report.testFail("fallo al hacer click en ");
			throw t;
		}

	}

}
