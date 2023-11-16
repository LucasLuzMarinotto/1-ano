package apostilaPag26;
import java.util.Scanner;
public class nomeIdade {
	public static void main(String args[]) {
		//criar o objeto Scanner
		Scanner ler = new Scanner(System.in);
		String nome;
		int anoNasc, anoAtual, idade;
		System.out.println("entre com o nome:");
		nome = ler.next();
		System.out.println("entre com o ano de nascimento:");
		anoNasc = ler.nextInt();
		System.out.println("entre com o ano atual:");
		anoAtual = ler.nextInt();
		idade = anoAtual-anoNasc;
		System.out.println(nome+", você tem "+idade+" anos");
		ler.close();

	}
}
