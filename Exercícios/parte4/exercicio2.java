package parte4;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String [] args) {

		Scanner entra = new Scanner(System.in);
		
		System.out.println("Digite o n�mero inicial: ");
		int num1 = entra.nextInt();
		System.out.println("Digite o n�mero final: ");
		int num2 = entra.nextInt();
		
		if (num1 < num2) {
			for(int i=num1; i<=num2; i++) {
				System.out.println("N�mero: "+ i);
			}
		}else if(num1 > num2){
			for(int i=num1; i>=num2; i--) {
				System.out.println("N�mero: "+ i);
			}
		}else {
			System.out.println("Os n�meros s�o iguais");
			System.out.println("N�mero: "+ num1);
		}
		
		entra.close();

	}

}