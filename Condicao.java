package exercicio;

import java.util.Scanner;

public class Condicao {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um priemiro valor: ");
		int numero1 = sc.nextInt();
		
		System.out.println("Digite um segundo valor: ");
		int  numero2 = sc.nextInt();
		
		if (numero1 == numero2) {
			System.out.println("Os números são iguais!");
			
		}else if (numero1 > numero2) {
			System.out.println("O " + numero1 + " é maior que o " + numero2);
			
		}else {
			System.out.println("O " + numero2 + " é maior que o " + numero1);
		}
		sc.close();
	}

}
