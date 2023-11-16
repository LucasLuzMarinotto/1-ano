package apostilaPag26;
import java.util.Scanner;
public class salarioDivida {
	public static void main(String args[]) {
		//criar o objeto Scanner
		Scanner ler = new Scanner(System.in);
		double s,dV;
		System.out.println("entre com o salario:");
		s = ler.nextDouble();
		dV = (s*30)/100;
		System.out.println("a divida máxima é "+ dV);
		ler.close();
	}

}
