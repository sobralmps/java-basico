package parte2;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String [] args) {

		Scanner entra = new Scanner(System.in);
		System.out.println("Digite o primeiro número: ");
		int num1 = entra.nextInt();
		System.out.println("Digite o segundo número: ");
		int num2 = entra.nextInt();
		if (num1 > num2) {
			System.out.printf("O número "+num1+" é maior que o número "+num2);
		}else if (num2 > num1){
			System.out.printf("O número "+num2+" é maior que o número "+num1);
		}else {
			System.out.printf("Os números são iguais");
		}
		entra.close();

	}

}
