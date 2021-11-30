package exercicio;

import java.util.Scanner;

public class PermissaoUsuario {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o seu código de usuário: ");
		int codigoUsuario =sc.nextInt();
		
		if (codigoUsuario != 1234) {
			System.out.println("Usuário Invalido!");
			
		}else {
			System.out.println("Usuário reconhecido, digite sua senha: ");
			
		}
		
		int senha =sc.nextInt();
		if (senha != 9999) {
			System.out.println("Senha Incorreta!");
			
		}else {
			System.out.println("Acesso Permitido!");
		}
		sc.close();
	}

}
