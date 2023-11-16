package apostilaPag26;
import java.util.Scanner;
public class mediaAritimetica {
	public static void main(String args[]) {
		//criar o objeto Scanner
		Scanner ler = new Scanner(System.in);
		double n1, n2, n3, n4, mA;
		System.out.println("entre com a nota 1:");
		n1 = ler.nextDouble();
		System.out.println("entre com a nota 2:");
		n2 = ler.nextDouble();
		System.out.println("entre com a nota 3:");
		n3 = ler.nextDouble();
		System.out.println("entre com a nota 4:");
		n4 = ler.nextDouble();
		mA = (n1 + n2 + n3 + n4)/4;
		System.out.println("sua média é: "+ mA);	
		ler.close();		

	}

}
