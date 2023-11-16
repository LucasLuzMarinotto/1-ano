package atividadesAvanco;
import java.util.Scanner;
public class programaImpar { 
	public static void main(String args[]) {
		//criar o objeto Scanner
		Scanner ler = new Scanner(System.in);
		int x, im_Par;
		System.out.println("Entre com um número inteiro:");
 		x= ler.nextInt();
		im_Par= x%2;
		System.out.println("O número inteiro "+x);
		if (im_Par==0) {
			System.out.println("É par");
		}else {
			System.out.println("É impar");
		}
		ler.close();
	}

}
