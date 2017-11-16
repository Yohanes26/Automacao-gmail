package testes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {

	private WebDriver driver;
	private WebElement nome;
	private WebElement senhaa;

	public Login(WebDriver driver) {
		this.driver = driver;
	}

	public Login visita(String url) {
		driver.get(url);
		return this;
	}

	public void autentica(String usuario, String senha) throws InterruptedException {
		if (driver.getCurrentUrl().contains(
				"https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin")) {
			nome = driver.findElement(By.id("identifierId"));
			nome.sendKeys(usuario);

			driver.findElement(By.id("identifierNext")).click();

			Thread.sleep(2000);
			WebDriverWait wait = new WebDriverWait(driver, 4000);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.name("password")));
			senhaa = driver.findElement(By.name("password"));
			senhaa.sendKeys(senha);
			driver.findElement(By.id("passwordNext")).click();

		} else {

			Thread.sleep(2000);
			WebDriverWait wait = new WebDriverWait(driver, 4000);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.name("password")));

			senhaa = driver.findElement(By.name("password"));
			senhaa.sendKeys(senha);

			driver.findElement(By.id("passwordNext")).click();
		}

	}

}
