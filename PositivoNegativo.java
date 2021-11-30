package exercicio;

import java.util.Scanner;

public class PositivoNegativo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite um número: ");
		numero  = sc.nextInt();
		
		if(numero >= 0) {
			System.out.println("O número é positivo!");
		}else {
			System.out.println("O número é negativo!");
		}
		sc.close();
	}


}
