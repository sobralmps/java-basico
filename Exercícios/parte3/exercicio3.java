package parte3;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String [] args) {

		Scanner entra = new Scanner(System.in);
		
		System.out.println("Digite um n�mero inteiro: ");
		int num = entra.nextInt();
		
		switch(num%2){
		case 0:
			System.out.println("N�mero par");
			break;
		default:
			System.out.println("N�mero �mpar");
		}
		
		
		entra.close();

	}

}