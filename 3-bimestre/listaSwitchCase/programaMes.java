package switch_teste;
import java.util.Scanner;
public class programaMes {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int mes;
		System.out.println("Escreva o número de um mês");
		mes = ler.nextInt();
		switch(mes) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println("Possui 31 dias");
				break;
			case 2:
				System.out.println("Possui 28 dias");
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println("Possui 30 dias");
				break;
			default:
				System.out.println("Mês inválido");
		}
		ler.close();
		
	}

}
