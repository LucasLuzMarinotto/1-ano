package hard;
import java.util.Scanner;
public class Programapares {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		final int TAM=20;
		int a[], b[], i;
		a = new int[TAM];
		b = new int[TAM];
		
		for(i=0; i<TAM; i++) {
			System.out.println("digite o valor "+(i+1)+"º de A:");
			a[i] = ler.nextInt();
			if(a[i]%2==1) {
				b[i]=a[i];
				System.out.println( "\n"+b[i]+" é um número impar.");
			} else {
				System.out.println( "\n"+a[i]+" é um número par.");
			}
		}
		
	}
		

}
