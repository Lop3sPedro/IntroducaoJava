package exercicio;

import java.util.Scanner;

public class MediaFinal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float n1, n2, n3;
		
		System.out.println("Digite o valor da primeira nota: ");
		n1 = sc.nextFloat();
		
		System.out.println("Digite o valor da segunda nota: ");
		n2 = sc.nextFloat();
		
		System.out.println("Digite o valor da terceira nota: ");
		n3 = sc.nextFloat();
		
		float mediaFinal = (n1 * 2 + n2 * 3 + n3 * 5) /  10; 
		
		System.out.println("A média final do aluno é: " + mediaFinal);
		sc.close();
	}

}
