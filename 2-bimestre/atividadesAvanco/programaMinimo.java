package atividadesAvanco;
import java.util.Scanner;
public class programaMinimo {
	public static void main(String args[]) {
		//criar o objeto Scanner
		Scanner ler = new Scanner(System.in);
		Double salarioP, salarioN;
		
		System.out.println("Entre com o seu salário:");
		 salarioP = ler.nextDouble();
		 
		 if (salarioP<=1212) {
			 salarioN =(salarioP*5/100)+salarioP;
			 System.out.println("Seu salário com o reajuste será de: "+ salarioN);
		 } else if (salarioP>1212) {
			 salarioN= (salarioP*3.5/100)+salarioP;
			 System.out.println("Seu salário com o reajuste será de: "+ salarioN);
		 }
	}

}
