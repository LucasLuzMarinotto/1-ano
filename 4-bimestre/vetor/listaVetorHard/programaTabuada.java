package hard;
import java.util.Scanner;
public class Programatabuada {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		final int TAM=5;
		int a[], i, mult, j;
		a = new int[TAM];
		
		
		for(i=0; i<TAM; i++) {
			System.out.println("digite o valor "+(i+1)+"º de A:");
			a[i] = ler.nextInt();
			
			for(j=0; j<=10; j++) {
				mult = a[i]*j;
				System.out.println(a[i] +" x "+j + " = "+mult);
			}
			
		}
		
	}

}
