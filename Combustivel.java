package exercicio;

import java.util.Scanner;

public class Combustivel {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		double precoGasolina = 3.30;
		double precoAlcool = 2.90;
		
		System.out.println("Qual combustível o veículo foi abastecido, [A] para álcool e [G] para gasolina: ");
		char combustivel = sc.next().charAt(0);
		
		System.out.println("Quantos litros foram abastecidos: ");
		int litros = sc.nextInt();
	
		if (combustivel == 'G' && litros <= 20) {
			double litrosSemDesconto = litros * precoGasolina;
			double valorDesconto = litrosSemDesconto * 0.04;
			double valorTotal = litrosSemDesconto - valorDesconto;
		
			System.out.println("O valor total a ser pago é de: R$ " + valorTotal);
			
		}else if (combustivel == 'G' && litros > 20) {
			double litrosSemDesconto = litros * precoGasolina;
			double valorDesconto = litrosSemDesconto * 0.06;
			double valorTotal = litrosSemDesconto - valorDesconto;
			
			System.out.println("O valor total a ser pago é de: R$ " + valorTotal);
			
		}else if (combustivel == 'A' && litros <= 20) {
			double litrosSemDesconto = litros * precoAlcool;
			double valorDesconto = litrosSemDesconto * 0.03;
			double valorTotal = litrosSemDesconto - valorDesconto;
			
			System.out.println("O valor total a ser pago é de: R$ " + valorTotal);
			
		}else {
			double litrosSemDesconto = litros * precoAlcool;
			double valorDesconto = litrosSemDesconto * 0.05;
			double valorTotal = litrosSemDesconto - valorDesconto;
			
			System.out.println("O valor total a ser pago é de: R$ " + valorTotal);
		}
		sc.close();
	}

}
