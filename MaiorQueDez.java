package exercicio;

import java.util.Scanner;

public class MaiorQueDez {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite um número: ");
		numero = sc.nextInt();
		
		if(numero > 10) {
			System.out.println("O " + numero + " é maior que 10!" );
		}else if(numero < 10) {
			System.out.println("O " + numero + " é menor que 10!" );
		}else {
			System.out.println("O " + numero + " é 10!" );
		}
		sc.close();
	}

}
