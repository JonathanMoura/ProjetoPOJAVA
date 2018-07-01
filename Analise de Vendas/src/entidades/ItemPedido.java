/*---------------------------------------------
 * Autor: Jonathan Moura
 * Data:29/05/2018
 *---------------------------------------------
 * Descri��o: Classe com dados do ItemPedido.
 *---------------------------------------------
 * Hist�rico de modifica��o
 * Data    Autor    Descri��o
 *       |        |
 *-------------------------------------------*/
package entidades;

public class ItemPedido {
	private String nome_produto;
	private double valorTotal;
	private int quantidade;
	
	public ItemPedido(){
		
	}
	
	public ItemPedido(String nome_produto, double valorTotal, int quantidade) {
		super();
		this.nome_produto = nome_produto;
		this.valorTotal = valorTotal;
		this.quantidade = quantidade;
	}
	public String getProduto() {
		return nome_produto;
	}
	public void setProduto(String nome_produto) {
		this.nome_produto = nome_produto;
	}
	public double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
}
