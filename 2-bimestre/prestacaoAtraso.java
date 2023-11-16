package apostilaPag26;
import java.util.Scanner;
public class prestacaoAtraso {	
	public static void main(String args[]) {
		//criar o objeto Scanner
		Scanner ler = new Scanner(System.in);
		double valor, taxa, tempo, prestacao;
		System.out.println("entre com o valor da prestação:");
		valor = ler.nextDouble();
		System.out.println("entre com a taxa de juros:");
		taxa = ler.nextDouble();
		System.out.println("entre com o tempo de atraso em dias:");
		tempo = ler.nextDouble();
		prestacao = valor+(valor*(taxa/100)*tempo);
		System.out.println("a prestação com o atraso é "+ prestacao);
		ler.close();
	}

}
