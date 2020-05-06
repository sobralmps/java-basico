package parte3;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String [] args) {

		Scanner entra = new Scanner(System.in);
		
		System.out.println("Digite o 1º número: ");
		int num1 = entra.nextInt();
		System.out.println("Digite o 2º número: ");
		int num2 = entra.nextInt();
		System.out.println("Digite qual operação deseja realizar: ");
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
			System.out.println("Inválido");
		}
		
		
		entra.close();

	}

}