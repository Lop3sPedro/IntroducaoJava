package exercicio;

import java.util.Scanner;

public class SalarioFuncionario {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		float salarioAtual;
		float reajuste;
		
		System.out.println("Digite o valor do salário atual do funcionário: ");
		salarioAtual = sc.nextFloat();
		System.out.println("Digite o percentual de reajuste de um funcionário: ");
		reajuste = sc.nextFloat();
		
		float salarioFinal = (salarioAtual * reajuste / 100) + salarioAtual;
		
		//f = format -> 2 
		
		System.out.printf("O novo salário do funcionário é: R$ %.2f", salarioFinal);
		sc.close();		
	}
}
