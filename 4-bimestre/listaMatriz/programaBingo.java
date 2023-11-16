package primeiros_exercicios;
import java.util.*;
public class ProgramaBingo {
	 public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
	        int a[][] = criarCartela();
	        int rodadas = 0;
	        Set<Integer> numerosCartela = new HashSet<>();
	        
	        while (numerosCartela.size() < 16) {
	            System.out.print("\nInforme um número de 1 a 75 ou digite 0 para encerrar o jogo: ");
	            int nSorteado = in.nextInt();

	            if (nSorteado == 0) {
	                System.out.println("Jogo encerrado. Tente na próxima vez.");
	                return;
	            }

	            rodadas++;

	            if (verificarCartela(a, nSorteado)) {
	                System.out.println("Parabéns! Você tem o número " + nSorteado + " na cartela!");
	                numerosCartela.add(nSorteado);
	            } else {
	                System.out.println("Que pena! Número " + nSorteado + " não está na sua cartela.");
	            }
	        }
	        
	        System.out.println("\nBINGO!");
	        System.out.println("Você conseguiu terminar sua cartela em " + rodadas + " rodadas.");
	        in.close();
	    }

	    public static int[][] criarCartela() {
	        Random random = new Random();
	        int[][] cartela = new int[4][4];
	        int n;
	        Set<Integer> numerosUsados = new HashSet<>();

	        for (int i = 0; i < 4; i++) {
	            for (int j = 0; j < 4; j++) {
	                do {
	                    n = random.nextInt(75) + 1;
	                } while (numerosUsados.contains(n));

	                cartela[i][j] = n;
	                numerosUsados.add(n);
	            }
	        }

	        return cartela;
	    }

	    public static boolean verificarCartela(int[][] cartela, int nSorteado) {
	        int i, j;
	    	for (i = 0; i < 4; i++) {
	            for (j = 0; j < 4; j++) {
	                if (cartela[i][j] == nSorteado) {
	                    return true;
	                }
	            }
	        }
	        return false;
	 }

}
