package parte4;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String [] args) {

		Scanner entra = new Scanner(System.in);
		
		System.out.println("Digite o número inicial: ");
		int num1 = entra.nextInt();
		System.out.println("Digite o número final: ");
		int num2 = entra.nextInt();
		
		if (num1 < num2) {
			for(int i=num1; i<=num2; i++) {
				System.out.println("Número: "+ i);
			}
		}else if(num1 > num2){
			for(int i=num1; i>=num2; i--) {
				System.out.println("Número: "+ i);
			}
		}else {
			System.out.println("Os números são iguais");
			System.out.println("Número: "+ num1);
		}
		
		entra.close();

	}

}