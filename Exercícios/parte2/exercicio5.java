package parte2;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String [] args) {

		Scanner entra = new Scanner(System.in);
		
		System.out.println("Insira um n�mero inteiro: ");
		
		int num = entra.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("\nEsse n�mero � par.");
		}else {
			System.out.println("\nEsse n�mero � �mpar.");
		}
		
		entra.close();

	}

}