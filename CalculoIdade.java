package exercicio;

import java.util.Scanner;

public class CalculoIdade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int anos, meses, dias;
		
		System.out.println("Digite a quantidade de anos completo que você possui: ");
		anos = sc.nextInt();
		System.out.println("Digite a quantidade de meses que passou do seu aniversário: ");
		meses = sc.nextInt();
		System.out.println("Digite a quantidade de dias que passou do seu último mêsversário: ");
		dias = sc.nextInt();
		
		int total = (anos * 365) + (meses * 30) + dias;
		
		System.out.println("A quantidade de dias vividos corresponde à: " + total + " dias.");
		sc.close();
	}

}
