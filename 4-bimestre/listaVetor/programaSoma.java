package vetorJava;
import java.util.Scanner;
public class programaSoma {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		final int TAM=10;
		int a[], b[], c[], i;
		a = new int[TAM];
		b = new int[TAM];
		c = new int[TAM];
		
		for(i=0; i<TAM; i++) {
			System.out.println("digite o valor "+(i+1)+"º de A");
			a[i] = ler.nextInt();
		}
		
		for(i=0; i<TAM; i++) {
			System.out.println("digite o valor "+(i+1)+"º de B");
			b[i] = ler.nextInt();
			c[i] = a[i] + b[i];
		}
		
		for(i=0; i<TAM; i++) {
			System.out.println("O resultado do "+(i+1)+"º valor de C é "+c[i]);
		}
		
		ler.close();
	}
}
