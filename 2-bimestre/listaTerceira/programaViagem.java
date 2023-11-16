package listaTerceira;
import java.util.Scanner;
public class ProgramaViagem {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int p,bag,a,b;
		System.out.println("Coloque o preço da passagem: ");
		p=ler.nextInt();
		System.out.println("Vai querer despachar bagagem? 1-Sim 2-Não");
		bag=ler.nextInt();
		if (bag==1){
			System.out.println("Quantidade de bagagem:");
			b=ler.nextInt();
			p+= b*90;
		}
		System.out.println("Quer marcar assento?  1-Sim 2-Não");
		a=ler.nextInt();
		if (a==1) {
			p+=60;
		}
		System.out.println("O custo da viagem é de: "+p);
		ler.close();
	
	}

}
