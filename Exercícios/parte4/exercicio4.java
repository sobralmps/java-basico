package parte4;

public class exercicio4 {

	public static void main(String [] args) {

		int contador = 0;
		for(int i= 1; i <= 30; i++) {
			contador = 0;
			
			for (int x= 1; x<=i; x++) {
				if(i%x == 0) {
					contador = contador + 1;
				}
			}
			
			if (contador <= 2) {
				System.out.println(i);
			}
		}
	}
}