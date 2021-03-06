/*---------------------------------------------
 * Autor: Jonathan Moura
 * Data:29/05/2018
 *---------------------------------------------
 * Descri��o: Classe com dados do Pedido.
 *---------------------------------------------
 * Hist�rico de modifica��o
 * Data    Autor    Descri��o
 *       |        |
 *-------------------------------------------*/
package entidades;

import java.util.Date;

public class Pedido {
	private String data; 
	private ItemPedido itemPedido;
	private Cliente cliente;
	private Vendedor vendedor;
	
	public Pedido(){
		
	}
	
	public Pedido(String data, ItemPedido itemPedido, Cliente cliente, Vendedor vendedor) {
		super();
		this.data = data;
		this.itemPedido = itemPedido;
		this.cliente = cliente;
		this.vendedor = vendedor;
	}
	
	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

	public ItemPedido getItemPedido() {
		return itemPedido;
	}

	public void setItemPedido(ItemPedido itemPedido) {
		this.itemPedido = itemPedido;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}

}
