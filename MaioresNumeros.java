package exercicio;

import java.util.Scanner;

public class MaioresNumeros {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um primeiro número: ");
		int numero1 = sc.nextInt();
		
		System.out.println("Digite um segundo número: ");
		int numero2 = sc.nextInt();
		
		System.out.println("Digite um terceiro número: ");
		int numero3 = sc.nextInt();
		
		
		if (numero1 > numero2 && numero1 > numero3 && numero2 > numero3) {
			int somaNumeroMaiores = numero1 + numero2;
			System.out.println("A soma dos maiores números é: " + somaNumeroMaiores);
			
		}else if (numero1 > numero2 && numero1 > numero3 && numero3 > numero2) {
			int somaNumeroMaiores = numero1 + numero3;
			System.out.println("A soma dos maiores números é: " + somaNumeroMaiores);
			
		} else if (numero2 > numero1 && numero2 > numero3 && numero3 > numero1) {
			int somaNumeroMaiores = numero2 + numero3;
			System.out.println("A soma dos maiores números é: " + somaNumeroMaiores);
			
		}else if (numero2 > numero1 && numero2 > numero3 && numero1 > numero3) {
			int somaNumeroMaiores = numero2 + numero1;
			System.out.println("A soma dos maiores números é: " + somaNumeroMaiores);
			
		}else if (numero3 > numero1 && numero3 > numero2 && numero2 > numero1) {
			int somaNumeroMaiores = numero3 + numero2;
			System.out.println("A soma dos maiores números é: " + somaNumeroMaiores);
			
		}else {
				int somaNumeroMaiores = numero3 + numero1;
				System.out.println("A soma dos maiores números é: " + somaNumeroMaiores);
		}
		sc.close();
	}

}
