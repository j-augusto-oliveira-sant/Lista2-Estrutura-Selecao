package exercicios_resolvidos;
import java.util.Scanner;


public class Ex25 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//SACAR VALOR
		System.out.println("|Informe valor para saque:");
		int num = scan.nextInt();
		
		if (num <= 600) {
			int unidades = num%10;
			int dezenas = (num%100)/10;
			int centenas = num/100;
			//notas de 100
			System.out.println(centenas+" notas de R$100");
			//notas 50
			int nota_50 = (dezenas/5);
			System.out.println(nota_50+" notas de R$50");
			//notas 10
			System.out.println((dezenas-(5*nota_50))+" notas de R$10");
			//notas 5
			int nota_5 = (unidades/5);
			System.out.println(nota_5+" notas de R$5");
			//notas 1
			System.out.println((unidades-(5*nota_5))+" notas de R$1");
		}
		
		scan.close();
	}
}
