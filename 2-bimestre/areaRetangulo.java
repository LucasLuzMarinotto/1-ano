package apostilaPag26;
import java.util.Scanner;
public class areaRetangulo {
	public static void main(String args[]) {
		//criar o objeto Scanner
		Scanner ler = new Scanner(System.in);
		int h, b, area;
		System.out.println("entre com a altura do retângulo:");
		h =  ler.nextInt();
		System.out.println("entre com a base do retângulo:");
		b = ler.nextInt();
		area = h*b;
		System.out.println("a base do retângulo é "+ area);
		ler.close();
	}

}
