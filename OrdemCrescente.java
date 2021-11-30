package exercicio;

import java.util.Scanner;

public class OrdemCrescente {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int valor1, valor2;
		
		System.out.println("Digite um primeiro valor: ");
		valor1 = sc.nextInt();
		System.out.println("Digite um segundo valor: ");
		valor2 = sc.nextInt();
		
		if (valor1 > valor2) {
			System.out.println("A ordem crescente é:  " + valor2 + ", " + valor1);
			
		}else {
			System.out.println("A ordem crescente é:  " + valor1 + ", " + valor2);
		}
		sc.close();
	}

}
