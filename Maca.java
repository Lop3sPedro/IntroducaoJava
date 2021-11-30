package exercicio;

import java.util.Scanner;

public class Maca {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int kgMacas;
		
		System.out.println("Digite a quantidade de maças: ");
		kgMacas = sc.nextInt();
		
		if(kgMacas < 12) {
			double total = kgMacas * 1.3;
			System.out.println("O valor das maças é: R$ " + total); 
		}else {
			double total = kgMacas * 1;
			System.out.println("O valor das maças é: R$ " + total); 
		}
		sc.close();
	}

}
