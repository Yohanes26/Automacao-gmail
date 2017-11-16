package testes;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.beans.factory.annotation.Autowired;

import JpaRepository.DestinatarioRepository;
import model.DadosCadastro;
import model.DestinatarioEmail;

public class Metodos {

	private List<DestinatarioEmail> destinatariosEmail = new ArrayList<>();
	private DestinatarioEmail destinatarioEmail = new DestinatarioEmail();
	private DadosCadastro dadosCadastro = new DadosCadastro();

	// private List<DadosCadastro> dadosCadastros = new ArrayList<>();
	WebDriver driver;

	@Autowired
	private List<DestinatarioRepository> destinatarioRepository;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/gloureirog/eclipse-workspace/automacaoEmail/src/chromedriver.exe");
		driver = new ChromeDriver();

		driver.get(
				"https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&osid=1&service=mail&ss=1&ltmpl=default&rm=false&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
	}

	@Test
	public void loginSuccess() throws InterruptedException {
		Login login = new Login(driver);
		EnviaEmail enviaEmail = new EnviaEmail(driver);

		login.visita(
				"https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin")
				.autentica(dadosCadastro.getUsuario(), dadosCadastro.getSenha());
	}
}
