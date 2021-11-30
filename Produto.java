package exercicio;

import java.util.Scanner;

public class Produto {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o nome do produto: ");
		
		@SuppressWarnings("unused")
		char produto = sc.next().charAt(0);
		
		System.out.println("Digite a quantidade adquirida do produto: ");
		int quantidade = sc.nextInt();
		
		System.out.println("Digite o valor de unidade do produto: ");
		int precoUnidade = sc.nextInt();
		
		if (quantidade <= 5) {
			int total = quantidade * precoUnidade;
			double desconto = total * 0.02;
			double valorFinal = total - desconto;
			
			System.out.println("O valor total do produto a ser pago é: R$ " + valorFinal);
								
		}else if (quantidade > 5 && quantidade <= 10) {
			int total = quantidade * precoUnidade;
			double desconto = total * 0.03;
			double valorFinal = total - desconto;
			
			System.out.println("O valor total do produto a ser pago é: R$ " + valorFinal);
			
		}else {
			int total = quantidade * precoUnidade;
			double desconto = total * 0.05;
			double valorFinal = total - desconto;
			
			System.out.println("O valor total do produto a ser pago é: R$ " + valorFinal);
		}
		sc.close();
	}

}
