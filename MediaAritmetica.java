package exercicio;

import java.util.Scanner;

public class MediaAritmetica {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float n1, n2;
		
		System.out.println("Digite a primeira nota: ");
		n1 = sc.nextFloat();
		
	    System.out.println("Digite a segunda nota: ");
		n2 = sc.nextFloat();
		
		float mediaAritmetica = (n1 + n2) / 2;
		
		if (mediaAritmetica >= 6) {
			System.out.println("Aluno com média " + mediaAritmetica + " Aprovado!!");
		}else {
			System.out.println("Aluno com média " + mediaAritmetica + " Reprovado!!");
		}
		sc.close();
	}

}
