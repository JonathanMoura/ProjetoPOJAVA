/*---------------------------------------------
 * Autor: Diogo Souza
 * Data:15/06/2018
 *---------------------------------------------
 * Descrição: Classe de cadastro do pedido
 * 			  no repositorio BD ou Array.
 *---------------------------------------------
 * Histórico de modificação
 * Data    Autor    Descrição
 *       |        |
 *-------------------------------------------*/

package negocio;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entidades.Pedido;
import excecoes.CPFNaoEncontradoException;
import excecoes.DataException;
import interfaces.IRepositorioPedido;


public class CadastroPedido {
	
	private IRepositorioPedido repositorio;
	
	public CadastroPedido(IRepositorioPedido repositorio) {
		this.repositorio = repositorio;
	}
	public void inserir(Pedido pedido){
		repositorio.inserir(pedido);
	}
	public List procurar(String cpf, Date dataDe, Date dataAte) throws DataException{
		if(!cpf.equals("") && dataDe == null && dataAte == null){
			return repositorio.procurar(cpf);
		}
		else if(!cpf.equals("") && dataDe != null && dataAte != null){
			return repositorio.procurar(cpf,dataDe,dataAte);
		}
		else if(dataDe != null && dataAte != null){
			return repositorio.procurar(dataDe, dataAte);
		}
		else if((dataDe != null && dataAte == null) || (dataDe == null && dataAte != null)){
			throw new DataException();
		}
		else {
			return repositorio.procurar();
		}
	}
}
