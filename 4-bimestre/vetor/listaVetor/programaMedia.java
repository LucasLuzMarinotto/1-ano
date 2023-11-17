package vetorJava;
import java.util.Scanner;
public class programaMedia {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int TAM=10;
		int a[],i, soma=0;
		double media;
		
		a = new int[TAM];
		
		
		for(i=0; i<TAM; i++) {
			System.out.println("digite o valor "+(i+1)+"º valor do vetor A");
			a[i] = in.nextInt();
		}
		
		for(i=0; i<TAM; i++) {
			soma = soma + a[i];
		}
		
		media = soma / TAM;
		System.out.println("A média dos números do vetor A é: "+media);
	}

}
