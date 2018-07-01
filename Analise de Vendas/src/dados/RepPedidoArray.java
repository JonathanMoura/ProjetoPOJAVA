/*---------------------------------------------
 * Autor: Jonathan Moura
 * Data:24/06/2018
 *---------------------------------------------
 * Descrição: Repositório Array de pedidos.
 *---------------------------------------------
 * Histórico de modificação
 * Data    Autor    Descrição
 *       |        |
 *-------------------------------------------*/
package dados;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entidades.Pedido;
import excecoes.CPFNaoEncontradoException;
import interfaces.IRepositorioPedido;

public class RepPedidoArray implements IRepositorioPedido {
	private static final int TAMANHO = 1000000;
	private Pedido[] repositorio;
	private int indice;
	private int i;
	
	public RepPedidoArray(){
		i = 0;
		indice = 0;
		repositorio = new Pedido[TAMANHO];
	}
			
	public void inserir(Pedido pedido){
		repositorio[indice] = pedido;
		indice++;
	}
	public List procurar(String cpf){
		i = 0;
		List pedidos = new ArrayList();
		if (indice != 0) {			
			while (i < indice) {
				if(cpf.equals(repositorio[i].getVendedor().getCpf())){
					pedidos.add(repositorio[i]);
				}
				i++;
			}
		}
		return pedidos;
	}
	
	public List procurar(String cpf, Date de, Date ate){
		i = 0;
		List pedidos = new ArrayList();
		if (indice != 0) {			
			while (i < indice) {
				if(cpf.equals(repositorio[i].getVendedor().getCpf()) 
					& (de.equals(repositorio[i].getData()) || de.before(repositorio[i].getData()))
					& (ate.equals(repositorio[i].getData()) || ate.after(repositorio[i].getData()))){
					pedidos.add(repositorio[i]);
				}
				i++;
			}
		}
		return pedidos;
	}
	
	public List procurar(Date de, Date ate){
		i = 0;
		List pedidos = new ArrayList();
		if (indice != 0) {			
			while (i < indice) {
				if(( de.equals(repositorio[i].getData()) || de.before(repositorio[i].getData()) )
					& ( ate.equals(repositorio[i].getData()) || ate.after(repositorio[i].getData()) )){
					pedidos.add(repositorio[i]);
				}
				i++;
			}
		}
		return pedidos;
	}
	
	public List procurar(){
		i = 0;
		List pedidos = new ArrayList();
		if (indice != 0) {			
			while (i < indice) {
				pedidos.add(repositorio[i]);
				i++;
			}
		}
		return pedidos;
	}
	
}
