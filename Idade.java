package exercicio;

import java.util.Scanner;

public class Idade {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite a idade do primeiro homem: ");
		int idadeHomem1 = sc.nextInt();
		
		System.out.println("Digite a idade do segundo homem: ");
		int idadeHomem2 = sc.nextInt();
		
		System.out.println("Digite a idade da primeira mulher: ");
		int idadeMulher1 = sc.nextInt();
		
		System.out.println("Digite a idade da segunda mulher: ");
		int idadeMulher2 = sc.nextInt();
		
		if (idadeHomem1 > idadeHomem2 && idadeMulher1 > idadeMulher2) {
			int soma = idadeHomem1 + idadeMulher2;
			int produto = idadeMulher1 * idadeHomem2;
			
			System.out.println("A soma das idades do homem mais velho com a mulher mais nova é de: " + soma);
			System.out.println("O produto das idades da mulher mais velha com o homem mais novo é de: " + produto);
					
		}else {
			int soma = idadeHomem2 + idadeMulher1;
			float produto = idadeMulher2 * idadeHomem1;
			
			System.out.println("A soma das idades do homem mais velho com a mulher mais nova é de: " + soma);
			System.out.println("O produto das idades da mulher mais velha com o homem mais novo é de: " + produto);
		}
		sc.close();
	}

}
