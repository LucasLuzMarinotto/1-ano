package apostilaPag26;
import java.util.Scanner;
public class salarioLiquido {
	public static void main(String args[]) {
		//criar o objeto Scanner
		Scanner ler = new Scanner(System.in);
		double valor1, valor2, inss, salario;
		System.out.println("entre com a hora da aula:");
		valor1 = ler.nextDouble();
		System.out.println("entre com a quantidade de aulas em um mês:");
		valor2 = ler.nextDouble();
		System.out.println("entre com o porcentual de desconto do INSS:");
		inss = ler.nextDouble();
		salario = (valor1*valor2) - (salario*inss/100);
		System.out.println("o sálario líquido do professor é "+ salario);
		ler.close();
	}

}
