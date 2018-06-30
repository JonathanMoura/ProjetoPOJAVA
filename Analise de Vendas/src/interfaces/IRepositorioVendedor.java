/*---------------------------------------------
 * Autor: Diogo Souza
 * Data: 30/06/2018
 *---------------------------------------------
 * Descri��o: Interface para reposit�rio de 
 * 			  vendedor.
 *---------------------------------------------
 * Hist�rico de modifica��o
 * Data    Autor    Descri��o
 *       |        |
 *-------------------------------------------*/

package interfaces;

import entidades.Vendedor;
import excecoes.CPFNaoEncontradoException;

public interface IRepositorioVendedor {
	
	public void inserir(Vendedor vendedor);
	public Vendedor procurar(String cpf) throws CPFNaoEncontradoException;
	public void remover(String cpf);
	public void atualizar(Vendedor vendedor);

}
