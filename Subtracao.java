package exercicio;

import java.util.Scanner;

public class Subtracao {
	
	public static void main (String [] args) {
	Scanner sc = new Scanner (System.in);
	int valor;
	int valor1;
	
	System.out.println ("Digite um primeiro valor: ");
	valor = sc.nextInt();
	
	System.out.println ("Digite um segundo valor: ");
	valor1 = sc.nextInt();
	
	int total = valor - valor1;
	
	System.out.println ("A subtração do " + valor + " - " + valor1 + " = : " + total);
	sc.close();

}
}