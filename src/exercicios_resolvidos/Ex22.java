package exercicios_resolvidos;
import java.util.Scanner;


public class Ex22 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//22. Faça um Programa que leia um número inteiro 
		//menor que 1000 e imprima a quantidade
		//de centenas, dezenas e unidades do mesmo.
		System.out.println("Informe Numero:");
		int num = scan.nextInt();
		
		if (num < 1000) {
			
			String snum = String.valueOf(num);
			if (snum.length() == 1) {
				snum = "00"+snum;
			} else {
				if (snum.length() == 2) {
					snum = "0"+snum;
				}
			}
			if (snum.length() > 0) {
				String unidade = snum.substring(2);
				System.out.println("unidade:"+unidade+" unidades");
			}
			if (snum.length() > 1) {
				String dezena = snum.substring(1, 2);
				System.out.println("dezena:"+dezena+" dezenas");
			}
			if (snum.length() > 2) {
				String centena = snum.substring(0, 1);
				System.out.println("centena:"+centena+" centenas");
			}
		}
		scan.close();
	}
}
