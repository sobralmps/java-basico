package parte2;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String [] args) {

		Scanner entra = new Scanner(System.in);

		double n1, n2, n3, media;
		
		System.out.println("Digite a primeira nota: ");
		n1 = entra.nextDouble();
		System.out.println("Digite a segunda nota: ");
		n2 = entra.nextDouble();
		System.out.println("Digite a terceira nota: ");
		n3 = entra.nextDouble();
		
		media = (n1 + n2 + n3)/3;
		
		System.out.println("\nNota final: "+ media);
		
		if (media >= 7) {
			System.out.println("Aprovado.");
		}else {
			System.out.println("Reprovado.");
		}
		
		entra.close();

	}

}