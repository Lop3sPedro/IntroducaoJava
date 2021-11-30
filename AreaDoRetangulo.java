package exercicio;

import java.util.Scanner;

public class AreaDoRetangulo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float base;
		float altura;
		
		System.out.println("Digite o valor da base: ");
		base = sc.nextFloat(); 
		
		System.out.println("Digite o valor da altura: ");
		altura = sc.nextFloat();
		
		float area = base * altura;
		
		System.out.println("O valor da área do retângulo é: " + area + "cm².");
		sc.close();
	}

}
