package exercicio;

import java.util.Scanner;
public class Multiplicacao {
	
	public static void main (String [] args) {
	Scanner sc = new Scanner (System.in);
	
	int valor;
	int valor1;
	
	System.out.print ("Digite um primeiro valor: ");
	valor = sc.nextInt();
	
	System.out.print ("Digite um segundo valor: ");
	valor1 = sc.nextInt();
	
	int total = valor * valor1;
	
	System.out.print ("O resultado da multiplicação do " + valor + " x " + valor1 + " é: " + total);
	sc.close();
	

	
}
}