package exercicio;

import java.util.Scanner;

public class AreaDoTriangulo {
	
	public static void main (String [] args) {
		Scanner sc = new Scanner (System.in);
		float base;
		float altura;
		
		System.out.println("Digite o valor da base: ");
		base = sc.nextFloat();
		
		System.out.println ("Digite o valor da altura: ");
		altura = sc.nextFloat();
		
		float area = (base * altura) / 2;
		
		System.out.print("A área do triângulo é: " + area + "cm².");
		sc.close();
	}

}
