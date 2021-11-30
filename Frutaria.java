package exercicio;

import java.util.Scanner;

public class Frutaria {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite a quantidade de maçãs (em kg): ");
		int macas  = sc.nextInt();
		
		System.out.println("Digite a quantodade de morangos (em kg): ");
		int morangos = sc.nextInt();
		
		if (macas <= 5 && morangos <= 5) {
			double kgMacas = macas * 1.80;
			double kgMorangos = morangos * 2.50;
			double subTotal = kgMacas + kgMorangos;
			System.out.println("O valor total sem desconto é: R$ " + subTotal);
			
		}else if (macas > 5 && morangos >5) {
			double kgMacas = macas * 1.50;
			double kgMorangos = morangos * 2.20;
			double subTotal = kgMacas + kgMorangos;
			System.out.println("O valor total sem desconto é: R$ " + subTotal);
			
		}else if (macas > 5 && morangos <= 5) {
			double kgMacas = macas * 1.50;
			double kgMorangos = morangos * 2.50;
			double subTotal = kgMacas + kgMorangos;
			System.out.println("O valor total sem desconto é: R$ " + subTotal);
			
		}else if (macas <= 5 && morangos > 5) {
			double kgMacas = macas * 1.80;
			double kgMorangos = morangos * 2.20;
			double subTotal = kgMacas + kgMorangos;
			System.out.println("O valor total sem desconto é: R$ " + subTotal);
		}
		
		sc.close();
		}
	}


