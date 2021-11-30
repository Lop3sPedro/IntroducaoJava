package exercicio;

import java.util.Scanner;

public class Time {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o nome do primeiro time: ");
		
		@SuppressWarnings("unused")
		char time1 = sc.next().charAt(0);
		
		System.out.println("Digite o nome do segundo time: ");
		
		@SuppressWarnings("unused")
		char time2 = sc.next().charAt(0);
		
		System.out.println("Digite o número de gols do primeiro time: ");
		int golsTime1 = sc.nextInt();
		
		System.out.println("Digite o número de gols do segundo time: ");
		int golsTime2 = sc.nextInt();
		
		if (golsTime1 > golsTime2) {
			System.out.println("O primeiro time GANHOU A PARTIDA de " + golsTime1 + " a "+ golsTime2);
			
		}else if (golsTime2 > golsTime1) {
			System.out.println("O segundo time GANHOU A PARTIDA de " + golsTime2 + " a "+ golsTime1);
			
		}else{
			System.out.println("A partida deu EMPATE de " + golsTime1 + " a "+ golsTime2);
		}
		sc.close();
	}

}
