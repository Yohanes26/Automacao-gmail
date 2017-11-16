package model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "destinatarioemail")
public class DestinatarioEmail {

	private int codigo;
	private String destinatario;
	private String assunto;
	private String corpo;

	public String getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}

	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}

	public String getCorpo() {
		return corpo;
	}

	public void setCorpo(String corpo) {
		this.corpo = corpo;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

}
