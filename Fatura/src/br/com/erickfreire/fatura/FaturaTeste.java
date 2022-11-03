package br.com.erickfreire.fatura;

public class FaturaTeste {

	public static void main(String[] args) {
		Fatura fatura1 = new Fatura("0001", "Monitor", 2, 700.00);
		
		System.out.printf("Numero da Fatura: %s%n", fatura1.getNumero());
		System.out.printf("Descrição: %s%n", fatura1.getDescricacao());
		System.out.printf("Quantidade: %s%n", fatura1.getQuantidade());
		System.out.printf("Preço: %.2f%n", fatura1.getPreco());
		System.out.printf("Total: %.2f%n", fatura1.calculaFatura());

	}

}
