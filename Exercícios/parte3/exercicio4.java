package parte3;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String [] args) {

		Scanner entra = new Scanner(System.in);
		
		System.out.println("Lista de Estados ");
        System.out.println("\n"
          + "11 -> RO\n" +
            "12 -> AC\n" +
            "13 -> AM\n" +
            "14 -> RR\n" +
            "15 -> PA\n" +
            "16 -> AP\n" +
            "17 -> TO\n" +
            "21 -> MA\n" +
            "22 -> PI\n" +
            "23 -> CE\n" +
            "24 -> RN\n" +
            "25 -> PB\n" +
            "26 -> PE\n" +
            "27 -> AL\n" +
            "28 -> SE\n" +
            "29 -> BA\n" +
            "31 -> MG\n" +
            "32 -> ES\n" +
            "33 -> RJ\n" +
            "35 -> SP\n" +
            "41 -> PR\n" +
            "42 -> SC\n" +
            "43 -> RS\n" +
            "50 -> MS\n" +
            "51 -> MT\n" +
            "52 -> GO\n" +
            "53 -> DF\n\n"
                + "Em qual estado voc� mora? ");
		int uf = entra.nextInt();
		
		switch(uf){
        case 11:
            System.out.println("Voc� mora em R�ndonia ");
            break;
        case 12:
            System.out.println("Voc� mora no Acre ");
            break;
        case 13:
            System.out.println("Voc� mora no Amazonas ");
            break;
        case 14:
            System.out.println("Voc� mora no Roraima ");
            break;
        case 15:
            System.out.println("Voc� mora no Par� ");
            break;
        case 16:
            System.out.println("Voc� mora no Amap� ");
            break;
        case 17:
            System.out.println("Voc� mora em Tocantins ");
            break;
        case 21:
            System.out.println("Voc� mora no Maranh�o ");
            break;
        case 22:
            System.out.println("Voc� mora no Piau� ");
            break;
        case 23:
            System.out.println("Voc� mora no Cear� ");
            break;
        case 24:
            System.out.println("Voc� mora no Rio Grande do Norte ");
            break;
        case 25:
            System.out.println("Voc� mora na Para�ba");
            break;
        case 26:
            System.out.println("Voc� mora no Pernambuco");
            break;
        case 27:
            System.out.println("Voc� mora em Alagoas ");
            break;
        case 28:
            System.out.println("Voc� mora em Sergipe ");
            break;
        case 29:
            System.out.println("Voc� mora na Bahia ");
            break;
        case 31:
            System.out.println("Voc� mora em Minas Gerais ");
            break;
        case 32:
            System.out.println("Voc� mora em Espirito Santo ");
            break;
        case 33:
            System.out.println("Voc� mora no Rio de Janeiro ");
            break;
        case 35:
            System.out.println("Voc� mora em S�o Paulo ");
            break;
        case 41:
            System.out.println("Voc� mora no Paran� ");
            break;
        case 42:
            System.out.println("Voc� mora em Santa Catarina ");
            break;
        case 43:
            System.out.println("Voc� mora no Rio Grande do Sul ");
            break;
        case 50:
            System.out.println("Voc� mora no Mato Grosso do sul ");
            break;
        case 51:
            System.out.println("Voc� mora no mato Grosso ");
            break;
        case 52:
            System.out.println("Voc� mora no Goi�s ");
            break;
        case 53:
            System.out.println("Voc� mora no Distrito Federal ");
            break;
        
        default:
                System.out.println("Estado Inexistente!");
		}
		
		entra.close();

	}

}