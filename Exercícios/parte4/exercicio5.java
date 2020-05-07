package parte4;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String [] args) {

		Scanner entra = new Scanner(System.in);
		double peso, maximo = 0, minimo = 0;
		
		for(int i= 1; i <= 5; i++) {
			System.out.println("Digite o "+ i +"º peso: ");
			peso = entra.nextDouble();
			
			if (i == 1) {
				minimo = peso;
				maximo = peso;
			}else {
				if(peso > maximo) {
					maximo = peso;
				}
				if(peso < minimo) {
					minimo = peso;
				}
			}
		}
		System.out.println("Maior peso: "+ maximo + "\nMenor peso: "+ minimo);	
		entra.close();
	}
}