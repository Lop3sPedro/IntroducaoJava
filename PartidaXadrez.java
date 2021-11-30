package exercicio;

import java.util.Scanner;

public class PartidaXadrez {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int horaInicio, horaFinal;
		
		System.out.println("Digite a hora de início da partida: ");
		horaInicio = sc.nextInt();
		
		System.out.println("Digite a hora do fim da partida: ");
		horaFinal = sc.nextInt();
		
		if(horaInicio  > horaFinal) {
			int totalHoras = horaFinal  - horaInicio + 24;
			
			System.out.println("O partida durou: " + totalHoras + " horas.");
			
		}else {
			int totalHoras = horaFinal - horaInicio;
			
			System.out.println("O partida durou: " + totalHoras + " horas.");	
		}
		sc.close();
	}

}
