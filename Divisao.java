package exercicio;

import java.util.Scanner;

public class Divisao {

	public static void main (String [] args) {
		Scanner sc = new Scanner (System.in);
		
		float valor;
		float valor1;
		
		System.out.print ("Digite um primeiro valor: ");
		valor = sc.nextFloat();
		
		System.out.print("Digite um segundo valor: ");
		valor1 = sc.nextFloat();
		
		float total = valor / valor1;
		
		System.out.println("O resultado da divisão do " + valor + " / " + valor1 + " = " + total);
		sc.close();
		
	}
	
}
