package vetorJava;
import java.util.Scanner;
public class programaInvertido {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int TAM=10;
		int a[], b[],i , j=9;
		a = new int[TAM];
		b = new int[TAM];
		
		
		for (i=0; i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+"º do vetor A.");
			a[i] = in.nextInt();
			
		}
		
		
		for (i=0; i<TAM; i++) {
			b[i] = a[j];
			System.out.println("O valor do "+(i+1)+"º do vetor B é:"+b[i]);
			j = j - 1;
		}
		
	}

}
