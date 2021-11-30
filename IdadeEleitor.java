package exercicio;

import java.util.Scanner;

public class IdadeEleitor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int anoNascimento, anoAtual;
		
		System.out.println("Digite o ano atual: ");
		anoAtual = sc.nextInt();
		
		System.out.println("Digite o seu ano de nascimento: ");
		anoNascimento = sc.nextInt();
		
		int idade = anoAtual - anoNascimento;
		
		if (idade < 18){
			System.out.println("Não pode votar!");
		}else
			System.out.println("Pode votar!");
	        sc.close();
	}
}

