package testes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CadastrarEmail {

	private WebDriver driver;

	public CadastrarEmail(WebDriver driver) {
		this.driver = driver;
	}

	public void cadastrarEmail() {

		WebElement campoDeNome = driver.findElement(By.id("FirstName"));
		campoDeNome.sendKeys("insira seu primeiro nome");
		// insira seu primeiro nome
		WebElement campoDeSobrenome = driver.findElement(By.id("LastName"));
		campoDeSobrenome.sendKeys("insira seu ultimo nome");
		// insira seu ultimo nome
		WebElement campoDeEmail = driver.findElement(By.id("GmailAddress"));
		campoDeEmail.sendKeys("insira seu endereco de email");
		// insira seu endereco de email
		WebElement campoDeSenha = driver.findElement(By.id("Passwd"));
		campoDeSenha.sendKeys("insira sua senha");
		// insira sua senha
		WebElement campoDeConfirmarSenha = driver.findElement(By.id("PasswdAgain"));
		campoDeConfirmarSenha.sendKeys("insira sua senha");
		// confirmacao da senha, insira sua senha
		WebElement campoDeDia = driver.findElement(By.id("BirthDay"));
		campoDeDia.sendKeys("30");
		// dia do aniversario

		driver.findElement(By.xpath(".//*[@id='BirthMonth']/div")).click();
		driver.findElement(By.xpath(".//*[@id=':5']/div")).click();
		// selecao do mes de aniversario

		WebElement campoDeAno = driver.findElement(By.id("BirthYear"));
		campoDeAno.sendKeys("1992");
		// ano de aniversário

		driver.findElement(By.xpath(".//*[@id='Gender']/div")).click();
		driver.findElement(By.xpath(".//*[@id=':h']/div")).click();
		// selecao de sexo

		WebElement campoDeEmailAtual = driver.findElement(By.id("RecoveryEmailAddress"));
		campoDeEmailAtual.sendKeys("insira seu email");
		// insira seu email

		WebElement campoDeTelefone = driver.findElement(By.id("RecoveryPhoneNumber"));
		campoDeTelefone.clear();
		campoDeTelefone.sendKeys("insira seu numero de telefone");
		// insira seu numero e telefone para recuperacao do cadastro

		driver.findElement(By.xpath(".//*[@id='CountryCode']/div")).click();
		driver.findElement(By.xpath(".//*[@id=':j']/div")).click();

		WebElement botaoProxima = driver.findElement(By.id("submitbutton"));
		botaoProxima.click();

		driver.findElement(By.id("tos-scroll-button")).click();
		driver.findElement(By.id("tos-scroll-button")).click();
		driver.findElement(By.id("tos-scroll-button")).click();
		driver.findElement(By.id("tos-scroll-button")).click();
		driver.findElement(By.id("tos-scroll-button")).click();

		driver.findElement(By.id("iagreebutton")).click();
	}

}
