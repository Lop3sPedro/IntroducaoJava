package exercicio;

import java.util.Scanner;

public class MediaDoAluno {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite a primeira nota: ");
		float nota1 = sc.nextFloat();
		
		System.out.println("Digite a segunda nota: ");
		float nota2 = sc.nextFloat();
		
		System.out.println("Digite a terceira nota: ");
		float nota3 = sc.nextFloat();
		
		System.out.println("Digite a média dos exercícios: ");
		float mediaExercicios = sc.nextFloat();
		
		float mediaFinal = (nota1 + nota2 * 2 + nota3 * 3 + mediaExercicios) / 7;
		
		if (mediaFinal > 9) {
			System.out.println("Conceito A!");
			
		}else if (mediaFinal >= 7.5 && mediaFinal < 9) {
			System.out.println("Conceito B!");
			
		}else if (mediaFinal >= 6 && mediaFinal < 7.5) {
			System.out.println("Conceito C!");
			
		}else {
			System.out.println("Conceito D!");
		}
		sc.close();
	}

}
