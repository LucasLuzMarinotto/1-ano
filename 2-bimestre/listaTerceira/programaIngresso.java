package listaTerceira;
import java.util.Scanner;
public class ProgramaIngresso {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		double i,u,desc;
		System.out.println("valor do ingresso");
		i= ler.nextInt();
		System.out.println("voce e estudante? 1-Sim 2-Não");
		u= ler.nextInt();
		if (u == 1) {
			desc= i*50/100;
			System.out.println("Você é estudante, seu desconto é de "+desc);
		}else {
			System.out.println("Você não é estudante, paga o valor normal, "+i);
		}
		ler.close();

	}
		
}
