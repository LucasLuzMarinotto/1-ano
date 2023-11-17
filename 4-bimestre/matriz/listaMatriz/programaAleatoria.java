package primeiros_exercicios;
import java.util.Random;
public class ProgramaAleatoria {
	public static void main(String[] args) {
		Random in = new Random();
		  int a[][] = new int[3][3];
	        int i, j;
	        int maior = 0, menor = 0; 
	        int lMaior = 0, lMenor = 0, cMaior = 0, cMenor = 0;

	        for (i = 0; i < 3; i++) {
	            for (j = 0; j < 3; j++) {
	                a[i][j] = in.nextInt() % 50;
	            }
	        }

	        for (i = 0; i < 3; i++) {
	            System.out.println();
	            for (j = 0; j < 3; j++) {
	                System.out.print("[ " + a[i][j] + " ]");
	                if (a[i][j] > maior) {
	                    maior = a[i][j];
	                    lMaior = i;
	                    cMaior = j;
	                }
	                if (a[i][j] < menor) {
	                    menor = a[i][j];
	                    lMenor = i;
	                    cMenor = j;
	                }
	            }
	        }
	        System.out.println("\nMaior número: " + maior + " Posição: (" + lMaior + ", " + cMaior + ")");
	        System.out.println("Menor número: " + menor + " Posição: (" + lMenor + ", " + cMenor + ")");
	}
}
