package exercicio;

import java.util.Scanner;

public class AreaDoQuadrado {

	public static void main (String [] args) {
		Scanner sc = new Scanner (System.in);
		
		float lado;
		
		System.out.print("Digite o valor do lado: ");
		lado = sc.nextFloat();
		
		float area = lado * lado;
		
		System.out.print("A área do quadrado é: " + area + "cm².");
		sc.close();
	}
}
