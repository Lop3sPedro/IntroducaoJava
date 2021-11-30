package exercicio;

import java.util.Scanner;

public class Aposentadoria {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o código do funcionário: ");
		@SuppressWarnings("unused")
		int codigo = sc.nextInt();
		
		System.out.println("Digite  o seu ano de nascimento: ");
		int nascimento = sc.nextInt();
		
		System.out.println("Digite o ano de ingresso na empresa: ");
		int ingresso = sc.nextInt();
		
		System.out.println("Digite o ano atual: ");
		int anoAtual = sc.nextInt();
		
		int idade = anoAtual - nascimento;
		int anosTrabalhados = anoAtual - ingresso;
		
		if (idade >=65 || anosTrabalhados >= 30) {
			System.out.println("Já pode se Aposentar!");
			
		}else if (idade >= 60 && anosTrabalhados >= 25) {
			System.out.println("Já pode se Aposentar!");
			
		}else {
			System.out.println("Não pode se Aposentar!");
		}
		sc.close();
		
	}

}
