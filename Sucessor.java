package exercicio;

import java.util.Scanner;

public class Sucessor {

	public static void main (String [] args) {
		Scanner sc = new Scanner (System.in);
		int valor;
		
		System.out.print("Digite um valor: ");
		valor = sc.nextInt();
		
		int sucessor = valor + 1;
		
		System.out.print("O sucessor do " + valor + " é " + sucessor + ".");
		sc.close();
	}
}
