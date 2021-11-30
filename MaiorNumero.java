package exercicio;

import java.util.Scanner;

public class MaiorNumero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int valor1, valor2;
		
		System.out.println("Digite um primeiro valor: ");
		valor1 = sc.nextInt();
		
		System.out.println("Digite um segundo valor: ");
		valor2 = sc.nextInt();
		
		
		if (valor1 > valor2 ) {
			System.out.println("O maior valor é: " + valor1);
			
		}else{
			System.out.println("O maior valor é: " + valor2);
		}
         sc.close(); 
	}

}
