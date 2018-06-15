/*---------------------------------------------
 * Autor: Diogo Souza
 * Data:15/06/2018
 *---------------------------------------------
 * Descri��o: Classe de cadastro do pedido
 * 			  no repositorio BD ou Array.
 *---------------------------------------------
 * Hist�rico de modifica��o
 * Data    Autor    Descri��o
 *       |        |
 *-------------------------------------------*/

package negocio;

import java.sql.ResultSet;

import entidades.Pedido;
import interfaces.IRepositorioPedido;


public class CadastroPedido {
	
	private IRepositorioPedido repositorio;
	
	public CadastroPedido(IRepositorioPedido repositorio) {
		this.repositorio = repositorio;
	}
	public void inserir(Pedido pedido){
		repositorio.inserir(pedido);
	}
	public Pedido procurar(String identificador) {
			return repositorio.procurar(identificador);
	}
	public void remover(String identificador){
		repositorio.remover(identificador);
	}
	public void atualizar(Pedido pedido){
		repositorio.atualizar(pedido);
	}
}