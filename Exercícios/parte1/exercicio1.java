package parte1;

import java.util.Scanner;

public class exercicio1 {
	
    public static void main(String [] args) {
    	
      Scanner entra = new Scanner(System.in);
      System.out.println("Digite um numero inteiro: ");
      int num = entra.nextInt();
      System.out.printf("%d",num);
      entra.close();
      
    }
    
}
