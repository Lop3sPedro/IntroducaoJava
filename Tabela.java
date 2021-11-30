package exercicio;

import java.util.Scanner;

public class Tabela {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor correspondente à x: ");
		int x = sc.nextInt();
		
		System.out.println("Digite o valor correspondente à y: ");
		int y = sc.nextInt();
		
		int z = x * y + 5;
		
		if (z <=0) {
			char resposta = 'A';
			
			System.out.println("O valor de z é " + z + " resposta é " + resposta);
			
		}else if (z <= 100) {
			char resposta = 'B';
			
			System.out.println("O valor de z é " + z + " resposta é " + resposta);
		
		}else {
			char resposta = 'C';
			
			System.out.println("O valor de z é " + z + " resposta é " + resposta);
		}
		
		sc.close();
	}
	/* Variáveis
	 | x | y | z | Resposta | 
	 |3  | 2 | 11|    B     | 
	 |150| 3 |455|    C     | 
	 | 7 |-1 |-2 |    A     | 
	 |-2 | 5 |-5 |    A     | 
	 |50 | 3 |155|    C     | */

}
