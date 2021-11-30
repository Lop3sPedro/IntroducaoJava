package exercicio;

import java.util.Scanner;

public class PositivoNegativoZero {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite um número: ");
		int numero = sc.nextInt();
		
		if(numero > 0) {
			System.out.println("Número é Positivo!");
			
		}else if (numero < 0){
			System.out.println("Número Negativo");
			
		}else {
			System.out.println("Número é zero");
		}
		sc.close();
	}

}
