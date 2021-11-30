package exercicio;

import java.util.Scanner;

public class PesoIdeal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		@SuppressWarnings("unused")
		char nome;
		char sexo;
		float altura;
		
		
		System.out.println("Digite seu nome");
		nome = sc.next().charAt(0);
		
		System.out.println("Digite seu sexo, [m] para masculino e [f] para feminino : ");
		sexo = sc.next().charAt(0);
		
		System.out.println("Digite sua altura : ");
		altura = sc.nextFloat();
		
		if (sexo == 'm') {
			double peso_ideal  = (72.7 * altura)-58;
			System.out.println("Seu peso ideal é: " + peso_ideal);
		}
		else if(sexo == 'f') {
			double peso_ideal = (62.1 * altura) - 44.7;
			System.out.println("Seu peso ideal é: " + peso_ideal);
		}
		else {
			System.out.println("Sexo não reconhecido");
		}
		sc.close();
	}
}