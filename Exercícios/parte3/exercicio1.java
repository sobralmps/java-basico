package parte3;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String [] args) {

		Scanner entra = new Scanner(System.in);
		
		System.out.println("Digite um n�mero de 1 a 7 para gerar um dia da semana correspondente");
		int num = entra.nextInt();
		
		switch(num){
		case 1:
			System.out.println("Segunda");
			break;
		case 2:
			System.out.println("Ter�a");
			break;
		case 3:
			System.out.println("Quarta");
			break;
		case 4:
			System.out.println("Quinta");
			break;
		case 5:
			System.out.println("Sexta");
			break;
		case 6:
			System.out.println("S�bado");
			break;
		case 7:
			System.out.println("Domingo");
			break;
		default:
			System.out.println("N�mero inv�lido");
		}
		
		
		entra.close();

	}

}