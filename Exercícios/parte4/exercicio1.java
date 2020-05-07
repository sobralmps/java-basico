package parte4;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String [] args) {

		Scanner entra = new Scanner(System.in);
		
		System.out.println("Digite o número inicial: ");
		int num1 = entra.nextInt();
		System.out.println("Digite o número final: ");
		int num2 = entra.nextInt();
		
		for(int i= num1; i <= num2; i++) {
			System.out.println("Número: "+ i);
		}
		
		entra.close();

	}

}