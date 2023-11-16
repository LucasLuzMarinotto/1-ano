package switch_teste;
import java.util.Scanner;
public class programaPlaca {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int ultima;
		System.out.println("Escreva o último número da placa do seu carro");
		ultima = in.nextInt();
		switch(ultima) {
			case 1:
			case 2:
				System.out.println("Seu carro não poderá circular na segunda-feira");
				break;
			case 3:
			case 4:
				System.out.println("Seu carro não poderá circular na terça-feira");
				break;
			case 5:
			case 6:
				System.out.println("Seu carro não poderá circular na quarta-feira");
				break;
			case 7:
			case 8:
				System.out.println("Seu carro não poderá circular na quinta-feira");
				break;
			case 9:
			case 0:
				System.out.println("Seu carro não poderá circular na sexta-feira");
				break;
			default:
				System.out.println("Número inválido");
		}
		
	}

}
