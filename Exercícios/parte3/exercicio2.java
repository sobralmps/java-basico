package parte3;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String [] args) {

		Scanner entra = new Scanner(System.in);
		
		System.out.println("Digite o 1� n�mero: ");
		int num1 = entra.nextInt();
		System.out.println("Digite o 2� n�mero: ");
		int num2 = entra.nextInt();
		System.out.println("Digite qual opera��o deseja realizar: ");
		String operacao = entra.next();
		
		switch(operacao){
		case "+":
			System.out.println(num1+num2);
			break;
		case "-":
			System.out.println(num1-num2);
			break;
		case "*":
			System.out.println(num1*num2);
			break;
		case "/":
			System.out.println(num1/num2);
			break;
		default:
			System.out.println("Inv�lido");
		}
		
		
		entra.close();

	}

}