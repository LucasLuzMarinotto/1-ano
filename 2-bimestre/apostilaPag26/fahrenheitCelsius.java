package apostilaPag26;
import java.util.Scanner;
public class fahrenheitCelsius {
	public static void main(String args[]) {
		//criar o objeto Scanner
		Scanner ler = new Scanner(System.in);
		double F, C;
		System.out.println("entre com os graus em Fahrenheit:");
		F = ler.nextDouble();
		C = (F - 32) * 5/9;
		System.out.println("os graus em Celsius são "+C);
		ler.close();
	}

}
