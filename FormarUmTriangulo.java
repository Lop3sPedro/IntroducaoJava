package exercicio;

import java.util.Scanner;

public class FormarUmTriangulo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor correspondente à a: ");
		int a = sc.nextInt();
		
		System.out.println("Digite o valor correspondente à b: ");
		int b = sc.nextInt();
		
		System.out.println("Digite o valor correspondente à c: ");
		int c = sc.nextInt();
		
		if (a < b + c && b < a + c && c < a + b) {
			if (a == b && b == c) {
				System.out.println("Triângulo Equilátero!");
				
			}else if (a == b || b == c || a == c) {
				System.out.println("Triângulo Isósceles!");
				
			}else {
				System.out.println("Triângulo Escaleno!");
				
		}
			
	}else {
		System.out.println("Não forma um triângulo!");
	 }
		sc.close();
   }
	/* ------------------------------------------------"
	|                   VARIÁVEIS                   |
	|-----------------------------------------------|
	|a | b | c |          Resposta                  |
	|-----------------------------------------------|
	|1 | 2 | 3 | Não  forma um triângulo            |
	|-----------------------------------------------|
	|3 | 4 | 5 | Triângulo Escaleno                 |
	|-----------------------------------------------|
	|2 | 2 | 4 | Não forma um triângulo             |
	|-----------------------------------------------|
	|4 | 4 | 4 | Triângulo Equilátero               |
	|-----------------------------------------------|
	|5 | 3 | 3 |Triângulo Isóscele                  |
	|-----------------------------------------------|*/
	

}
