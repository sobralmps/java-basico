package parte1;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String [] args) {

		Scanner entra = new Scanner(System.in);
		System.out.println("Digite uma palavra: ");
		String palavra = entra.next();
		System.out.printf("%s",palavra);
		entra.close();

	}

}
