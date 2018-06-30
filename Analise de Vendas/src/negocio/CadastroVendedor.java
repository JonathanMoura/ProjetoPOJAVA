/*---------------------------------------------
 * Autor: Diogo Souza
 * Data: 30/06/2018
 *---------------------------------------------
 * Descri��o: Classe de cadastro de 
 * 			  vendedor.
 *---------------------------------------------
 * Hist�rico de modifica��o
 * Data    Autor    Descri��o
 *       |        |
 *-------------------------------------------*/

package negocio;

import entidades.Vendedor;
import excecoes.CPFNaoEncontradoException;
import interfaces.IRepositorioVendedor;

public class CadastroVendedor {
	
	private IRepositorioVendedor repositorio;
	
	public CadastroVendedor(IRepositorioVendedor repositorio) {
		this.repositorio = repositorio;
	}
	
	public void inserir(Vendedor vendedor) {
		repositorio.inserir(vendedor);
	}
	
	public Vendedor procurar(String cpf) throws CPFNaoEncontradoException {
		return repositorio.procurar(cpf);
	}
	
	public void remover(String cpf) {
		repositorio.remover(cpf);
	}
	
	public void atualizar(Vendedor vendedor) {
		repositorio.atualizar(vendedor);
	}

}
