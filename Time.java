package exercicio;

import java.util.Scanner;

public class Time {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o nome do primeiro time: ");
		String time1 = sc.next();
		
		System.out.println("Digite o nome do segundo time: ");
		String time2 = sc.next();
		
		System.out.println("Digite o número de gols do primeiro time: ");
		int golsTime1 = sc.nextInt();
		
		System.out.println("Digite o número de gols do segundo time: ");
		int golsTime2 = sc.nextInt();
		
		if (golsTime1 > golsTime2) {
			System.out.println("O " + time1 + " ganhou de " + golsTime1 + " a " + golsTime2 + " do "+ time2);
			
		}else if (golsTime2 > golsTime1) {
			System.out.println("O " + time2 + " ganhou de " + golsTime2 + " a " + golsTime1 + " do "+ time1);
			
		}else{
			System.out.println("O " + time1 + " e o " + time2 + " empataram a partida em " + golsTime1 + " a "+ golsTime2);
		}
		sc.close();
	}

}
