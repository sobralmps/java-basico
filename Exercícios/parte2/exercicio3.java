package parte2;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String [] args) {

		Scanner entra = new Scanner(System.in);
		
		System.out.println("Digite a senha: ");
		String senha = entra.nextLine();
		
		if (senha.equals("java123")) {
			System.out.println("A senha está correta.");
		}else {
			System.out.println("A senha está incorreta");
		}
		
		entra.close();

	}

}
