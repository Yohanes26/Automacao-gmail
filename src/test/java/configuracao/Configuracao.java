
package configuracao;

import org.junit.Test;

import testes.Metodos;

public class Configuracao {

	private Metodos metodos = new Metodos();

	@Test
	public void loginComSucesso() throws Exception {
		metodos.setUp();
		metodos.loginSuccess();
	}

}
