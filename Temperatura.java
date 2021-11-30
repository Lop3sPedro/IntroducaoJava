package exercicio;

import java.util.Scanner;

public class Temperatura {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float grauFahrenheit;
		
		System.out.println("Digite a temperatura em grau fahrenheit: ");
		grauFahrenheit = sc.nextFloat();
		
		float grauCelsius = ((grauFahrenheit - 32) / 9) * 5;
		
		System.out.println("A temperatura em graus celsius é: " + grauCelsius + "°C.");
		sc.close();
	}

}
