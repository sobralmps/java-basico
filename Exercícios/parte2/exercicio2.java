package parte2;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String [] args) {

		Scanner entra = new Scanner(System.in);
		System.out.println("Digite o primeiro n�mero: ");
		int num1 = entra.nextInt();
		System.out.println("Digite o segundo n�mero: ");
		int num2 = entra.nextInt();
		if (num1 > num2) {
			System.out.printf("O n�mero "+num1+" � maior que o n�mero "+num2);
		}else if (num2 > num1){
			System.out.printf("O n�mero "+num2+" � maior que o n�mero "+num1);
		}else {
			System.out.printf("Os n�meros s�o iguais");
		}
		entra.close();

	}

}
