package parte4;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String [] args) {

		Scanner entra = new Scanner(System.in);
		
		System.out.println("Digite o n�mero que ser� o break: ");
		int num = entra.nextInt();
		
		for(int i= 1; i <= 50; i++) {
			System.out.println("N�mero: "+ i);
			if (i == num) {
				break;
			}
		}
		
		entra.close();

	}

}