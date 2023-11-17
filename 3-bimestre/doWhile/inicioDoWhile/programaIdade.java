package enquantoTeste;
import java.util.Scanner;
public class programaIdade {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int idade;
		String resposta;
		do {
			System.out.println("Digite sua idade");
			idade= in.nextInt();
			if (idade<18) {
				System.out.println("você é menor de idade.");
			} else {
				System.out.println("você é maior de idade.");
			}
			System.out.println("Deseja continuar? s ou n.");
			resposta = in.next();
		}while(resposta.equals("s"));
		in.close();
	}
	
}
