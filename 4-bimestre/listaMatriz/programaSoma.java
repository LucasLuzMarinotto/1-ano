package primeiros_exercicios;
import java.util.Scanner;
public class ProgramaSoma {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int a[][] = new int[3][4];
		int i, j, s=0;
		
		 for (i = 0; i < 3; i++) 
		 {s=0;
	            for (j = 0; j < 3; j++) {
	                System.out.println("Entre com o valor da linha " + i + " coluna " + j);
	                a[i][j] = in.nextInt();
	                s += a[i][j];
	            }
	            a[i][3] = s;
	        }

		 for (i = 0; i < 3; i++) {
	            for (j = 0; j < 4; j++) {
	                System.out.print("[ "+ a[i][j] + " ]");
	            }
	            System.out.println();
	        }
	}
}
