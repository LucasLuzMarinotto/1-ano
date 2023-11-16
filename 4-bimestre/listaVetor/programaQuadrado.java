package vetorJava;
import java.util.Scanner;
public class ProgramaQuadrado {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int TAM=10;
		int a[], b[],i;
		a = new int[TAM];
		b = new int[TAM];
		
		
		for (i=0; i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+"º do vetor A.");
			a[i] = in.nextInt();
			
		}
		
		
		for (i=0; i<TAM; i++) {
			b[i] = a[i] * a [i];
			System.out.println("O quadrado dos valores do vetor A são: "+b[i]);
		}
		in.close();
	}

}
