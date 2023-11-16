package apostilaPag26;
import java.util.Scanner;
public class coelhoscriacao {
	public static void main(String args[]) {
		//criar o objeto Scanner
		Scanner ler = new Scanner(System.in);
		int numeCoelhos, custo;
		System.out.println("entre com o numero de coelhos:");
		numeCoelhos = ler.nextInt();
		custo = numeCoelhos*(70/100)/18+10; 
		System.out.println("o custo da criação dos coelhos é "+ custo);
		ler.close();
	}

}
