package primeiros_exercicios;
import java.util.Scanner;
public class programaDobroMatriz {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int a[][] = new int[4][4];
		int i, j;
		a[0][0] = 2; 
		for(i=0;i<4;i++) {
			for(j=0;j<4;j++) {
				System.out.println("Entre com o valor das colunas e das linhas");
				a[i][j] = in.nextInt();
				a[i][j] = a[i][j] * 2;
			}
		}
		
		for(i=0;i<4;i++) {
			System.out.println();
			for(j=0;j<4;j++) {
				System.out.print("["+ a[i][j]+ "]");
			}
		}
	}
}
