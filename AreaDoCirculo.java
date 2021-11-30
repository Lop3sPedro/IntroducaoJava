package exercicio;

import java.util.Scanner;

public class AreaDoCirculo {
	
	public static void main (String [] args) {
		Scanner sc = new Scanner (System.in);
		
		float raio;
		double pi;
		
		System.out.print ("Digite o valor do raio: ");
		raio = sc.nextFloat();
		pi = Math.PI;
				
		double area = pi * (raio*raio);
		
		System.out.print("A área do circulo é: " + area + "cm².");
		sc.close();
	}

}
