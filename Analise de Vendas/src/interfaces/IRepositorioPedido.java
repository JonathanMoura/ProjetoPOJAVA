/*---------------------------------------------
 * Autor: Diogo Souza
 * Data:15/06/2018
 *---------------------------------------------
 * Descri��o: Interface para repositorio de
 * 			  pedidos.
 *---------------------------------------------
 * Hist�rico de modifica��o
 * Data    Autor    Descri��o
 *       |        |
 *-------------------------------------------*/

package interfaces;

import java.sql.ResultSet;
import java.util.Date;
import java.util.List;

import entidades.Pedido;

public interface IRepositorioPedido {
	
	public void inserir(Pedido pedido);
	public List procurar(String cpf);
	public List procurar(String cpf,Date de, Date ate);
	public List procurar(Date de, Date ate);
	public List procurar();
}
