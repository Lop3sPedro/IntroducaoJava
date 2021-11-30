package exercicio;

import java.util.Scanner;

public class ContaBancaria {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o número da sua agência: ");
		
		@SuppressWarnings("unused")
		int agencia = sc.nextInt();
		
		System.out.println("Digite o seu saldo disponivel: ");
		float saldo = sc.nextFloat();
		
		System.out.println("Digite seu débito disponivel: ");
		float debito = sc.nextFloat();
		
		System.out.println("Digite seu crédito disponivel: ");
		float credito = sc.nextFloat();
		
		float saldoAtual = saldo - debito + credito;
		
		if (saldoAtual >= 0){
			System.out.println("Saldo Positivo!");
		}else {
			System.out.println("Saldo Negativo!");
		}
		sc.close();
	}

}
