package parte4;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String [] args) {

		Scanner entra = new Scanner(System.in);
		
		System.out.println("Digite o n�mero inicial: ");
		int num1 = entra.nextInt();
		System.out.println("Digite o n�mero final: ");
		int num2 = entra.nextInt();
		
		for(int i= num1; i <= num2; i++) {
			System.out.println("N�mero: "+ i);
		}
		
		entra.close();

	}

}