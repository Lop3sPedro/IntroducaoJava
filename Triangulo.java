package exercicio;

import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor um lado do triângulo: ");
		float ladoA = sc.nextFloat();
		
		System.out.println("Digite um valor um lado do triângulo: ");
		float ladoB = sc.nextFloat();
		
		System.out.println("Digite um valor um lado do triângulo: ");
		float ladoC = sc.nextFloat();
		
		if (ladoA < ladoB + ladoC && ladoB < ladoA + ladoC && ladoC < ladoA + ladoB) {
			System.out.println("É um Triângulo!");
			
		}else {
			System.out.println("Não é um Triângulo!");
		}
		sc.close();

	}

}
