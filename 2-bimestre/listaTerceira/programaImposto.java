package listaTerceira;
import java.util.Scanner;
public class ProgramaImposto {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int sal,a,b,c,d;
		System.out.println("Coloque seu salário:");
		System.out.println("Coloque também os centavos, só que sem vírgula/ponto !!");
		sal=ler.nextInt();
		if (sal<=190398){
			System.out.println("NÃO tem Imposto");
		}else if (sal<=282666){
			a= 14280-(sal/(100*0075));
			System.out.println("Imposto: "+a);
			System.out.println("Os 2 últimos dígitos estão em centavos !!");
		}else if (sal<=375106) {
			b= 35480-(sal/(100*015));
			System.out.println("Imposto: "+b);
			System.out.println("Os 2 últimos dígitos estão em centavos !!");
		}else if (sal<=466468) {
			c= 63613-(sal/(100*0225));
			System.out.println("Imposto: "+c);
			System.out.println("Os 2 últimos dígitos estão em centavos !!");
		}else if (sal>466468){
			d= 86936-(sal/(100*0275));
			System.out.println("Imposto: "+d);
			System.out.println("Os 2 últimos dígitos estão em centavos !!");
		}
		ler.close();
	}

}
