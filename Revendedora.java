package exercicio;

import java.util.Scanner;

public class Revendedora {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float salarioFixo, comissaoCarro, valorTotalCarros;
		int quantidadeCarros;
		
		System.out.println("Digite o salário fixo do funcionário: ");
		salarioFixo = sc.nextFloat();
		
		System.out.println("Digite a comissão por carro vendido: ");
		comissaoCarro = sc.nextFloat();
		
		System.out.println("Digite a quantidade de carros vendidos: ");
		quantidadeCarros = sc.nextInt();
		
		System.out.println("Digite a soma total dos valores dos carros: ");
		valorTotalCarros = sc.nextFloat();
		
		float salarioFinal = salarioFixo + (comissaoCarro * quantidadeCarros) + (5 * valorTotalCarros) / 100;
		
		System.out.println("O salário final do vendedor é de : R$ " + salarioFinal);
		sc.close();
	}

}
