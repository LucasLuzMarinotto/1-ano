package hard;
import java.util.Scanner;
public class Programaimpar {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		final int TAM=10;
		int a[], i, j;
		a = new int[TAM];
		
		for(i=0; i<TAM; i++) {
			System.out.println("digite o valor "+(i+1)+"º de A:");
			a[i] = ler.nextInt();
			
			if(a[i] <= 1) {
				System.out.println("Este não é um número primo.");
			} else {
				boolean Primo = true;
				 for (j = 2; j < a[i]; j++) {
					 
					 if (a[i] % j == 0) {
	                        Primo = false;
	                        break;
	                    }
	                }
	                if (Primo) {
	                    System.out.println("Este é um número primo.");
	                } else {
	                    System.out.println("Este não é um número primo.");
	                }
	            }
		
				 }
				
			}
		
		
	}
