/*---------------------------------------------
 * Autor: Jonathan Moura
 * Data:29/05/2018
 *---------------------------------------------
 * Descri��o: Classe com dados do cliente.
 *---------------------------------------------
 * Hist�rico de modifica��o
 * Data    Autor    Descri��o
 *       |        |
 *-------------------------------------------*/
package entidades;

public class Cliente {
	private String cpf, cnpj;
	
	public Cliente(String cpf, String cnpj) {
		super();
		this.cpf = cpf;
		this.cnpj = cnpj;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
}
