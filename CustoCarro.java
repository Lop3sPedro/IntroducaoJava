package exercicio;

import java.util.Scanner;

public class CustoCarro {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float custoCarro;
		double percentualDistribuidora = 0.28;
		double imposto = 0.45;
				
		System.out.println("Digite o valor do custo de fábrica do carro: ");
		custoCarro = sc.nextFloat();
		
		double custoFinal = (custoCarro * percentualDistribuidora) + (custoCarro * imposto) + custoCarro;
		
		System.out.println("O valor final do carro para consumidor é de R$ " + custoFinal);
		sc.close();
	}
}
