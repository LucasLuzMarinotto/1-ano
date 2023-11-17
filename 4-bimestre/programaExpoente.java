package hard;
import java.util.Scanner;
public class Programaexpoente {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		final int TAM=11;
		int a[], i, base;
		double result;
		a = new int[TAM];
		
		for(i=0; i<TAM; i++) {
			System.out.println("digite o valor "+(i+1)+"º de A:");
			a[i] = ler.nextInt();
				
		}
		
		for(i=0; i<TAM; i++) {
			base =  a[i];
			result = calcularPotencia(2, base);
			  System.out.println("2 elevado a " + base + " é igual a " + result);
        }ler.close();
    }
		 public static double calcularPotencia(double base, int expoente) {
		        if (expoente < 0) {
		            return 1.0 / calcularPotencia(base, -expoente);
		        } else if (expoente == 0) {
		            return 1;
		        } else {
		            double resultado = 1.0;
		            for (int i = 1; i <= expoente; i++) {
		                resultado *= base;
		            }
		            return resultado;
		        }
	}
}
