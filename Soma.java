package exercicio;

import java.util.Scanner;

public class Soma {

	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite um primeiro valor: ");
		int valor = sc.nextInt();
	
		System.out.println("Digite um segundo valor: ");
		int valor1 = sc.nextInt();
		
		int total = valor + valor1;
		System.out.println("A soma do " + valor + " + " + valor1 + " é: " + total);
		
		sc.close();
	
	}
	
}
