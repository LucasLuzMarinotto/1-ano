package atividadesAvanco;
import java.util.Scanner;
public class programaCampo {
	public static void main(String args[]) {
		//criar o objeto Scanner
		Scanner ler = new Scanner(System.in);
		int h, b, area;
		System.out.println("Entre com a altura do campo:");
		h= ler.nextInt();
		System.out.println("Entre com a largura do campo:");
		b= ler.nextInt();
		area=b*h;
		System.out.println("a área do campo é "+area+"m²");
		if (area<110) {
			System.out.println("Fora do padrão");
		}else {
			System.out.println("Dentro do padrão");
		}
		ler.close();
	}

}
