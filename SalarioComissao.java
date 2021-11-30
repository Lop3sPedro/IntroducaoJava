package exercicio;

import java.util.Scanner;

public class SalarioComissao {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Digite o valor do salário fixo: ");
		float salarioFixo = sc.nextFloat();
		
		System.out.println("Digite o valor de vendas");
		double valorVendas = sc.nextInt();
		
		int valorTotalVendas = 1500;
		
		if (valorVendas <= valorTotalVendas) {
			double comissao = valorVendas * 0.03;
			double salarioFinal = comissao + salarioFixo;
			System.out.println("O salário final do vendedor é R$ " + salarioFinal);
			
		}else {
			double valorComissao1 = (valorVendas - valorTotalVendas) * 0.05;
			double valorComissao2 = valorTotalVendas * 0.03;
			double salarioFinal = valorVendas + valorComissao1 + valorComissao2;
			System.out.println("O salário final do vendedor é R$ " + salarioFinal);
		}
		sc.close();
	}

}
