package parte3;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String [] args) {

		Scanner entra = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro: ");
		int num = entra.nextInt();
		
		switch(num%2){
		case 0:
			System.out.println("Número par");
			break;
		default:
			System.out.println("Número ímpar");
		}
		
		
		entra.close();

	}

}