package br.com.erickfreire.fatura;

public class Fatura {
	
	private String numero;
	private String descricacao;
	private int quantidade;
	private double preco;
	
	public Fatura(String n, String d, int q, double p) {
		
		this.numero = n;
		this.descricacao = d;
		this.quantidade = q;
		this.preco = p;
		
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getDescricacao() {
		return descricacao;
	}

	public void setDescricacao(String descricacao) {
		this.descricacao = descricacao;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		
		if(quantidade < 0)
			this.quantidade = 0;
		
		if(quantidade >= 0)		
		   this.quantidade = quantidade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		if(preco < 0)
			this.preco = 0.0;
		
		if(preco >= 0)		
		   this.quantidade = quantidade;
	}
	
	public double calculaFatura() {
						
		return quantidade * preco;
		
	}
	

}
