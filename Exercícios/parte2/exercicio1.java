package parte2;

import java.util.Scanner;
import java.util.Calendar;

public class exercicio1 {

	public static void main(String [] args) {

		Scanner entra = new Scanner(System.in);
		System.out.println("Digite o seu ano de nascimento: ");
		int nascimento = entra.nextInt();
		int ano = Calendar.getInstance().get(Calendar.YEAR);
		int idade = ano - nascimento;
		if (idade >= 18) {
			System.out.printf("Voc� est� apto.");
		}else {
			System.out.printf("Voc� n�o est� apto");
		}
		entra.close();

	}

}
