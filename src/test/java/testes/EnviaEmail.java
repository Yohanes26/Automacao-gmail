package testes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EnviaEmail {

	private WebDriver driver;
	private WebElement destinyEmail;
	private WebElement assuntEmail;
	private WebElement corpEmail;

	public EnviaEmail(WebDriver driver) {
		this.driver = driver;
	}

	public void escreverEnviar(String destinatario, String assunto, String corpo) throws InterruptedException {

		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[contains(text(),'ESCREVER')]")).click();

		Thread.sleep(5000);
		destinyEmail = driver.findElement(By.xpath("//textarea[@name='to']"));
		destinyEmail.sendKeys(destinatario);

		assuntEmail = driver.findElement(By.xpath("//input[@name='subjectbox']"));
		assuntEmail.sendKeys(assunto);

		Thread.sleep(5000);
		corpEmail = driver.findElement(By.xpath("//div[@class='Ar Au']//div"));
		corpEmail.click();
		corpEmail.sendKeys(corpo);

		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains(text(),'Enviar')]")).click();
	}
}
