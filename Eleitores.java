package exercicio;

import java.util.Scanner;

public class Eleitores {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int totalVotosBrancos, totalVotosNulos, totalVotosValidos, totalEleitores;
		
		System.out.println("Digite a quantidade total de eleitores de um município: ");
		totalEleitores = sc.nextInt();
		
		@SuppressWarnings("unused")
		float totalEleitores1 = totalEleitores;
		
		System.out.println("Digite a quantidade total de votos brancos de um município: ");
		totalVotosBrancos = sc.nextInt();
		float totalVotosBrancos1 = totalVotosBrancos;
		
		System.out.println("Digite a quantidade total de votos nulos de um município: ");
		totalVotosNulos = sc.nextInt();
		float totalVotosNulos1 = totalVotosNulos;
		
		
		System.out.println("Digite a quantidade total de votos validos de um município: ");
		totalVotosValidos = sc.nextInt();
		float totalVotosValidos1 = totalVotosValidos;
		
		
		float porcentagemVotosBrancos = (totalVotosBrancos1 * 100)/totalEleitores;
		float porcentagemVotosNulos = (totalVotosNulos1 * 100)/totalEleitores;
		float porcentagemVotosValidos = (totalVotosValidos1 * 100)/totalEleitores;
		
		System.out.println("A porcentagem de votos bracos correspondem à: " + porcentagemVotosBrancos + "%.");
		System.out.println("A porcentagem de votos nulos correspondem à: " + porcentagemVotosNulos + "%.");
		System.out.println("A porcentagem de votos validos correspondem à: " + porcentagemVotosValidos + "%.");
		sc.close();
		
	}

}
