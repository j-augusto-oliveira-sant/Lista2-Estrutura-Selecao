package exercicios_resolvidos;
import java.util.Scanner;


public class Ex12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Calcular Reajustes
		System.out.println("Informe Salario:");
		float salario = scan.nextFloat();
		float novo_salario = 0;
		float per_aumento = 0;
		if (salario<=280) {
			per_aumento = 0.2f;
		} else {
			if (salario > 280 && salario < 700) {
				per_aumento = 0.15f;
			} else {
				if (salario > 700 && salario <= 1500) {
					per_aumento = 0.10f;
				} else {
					per_aumento = 0.05f;
				}
			}
		}
		novo_salario = salario+(salario*per_aumento);
		System.out.println("Salario antigo: R$"+salario);
		System.out.println("Salario novo: R$"+novo_salario);
		System.out.println("Percentual do aumento: "+(per_aumento*100)+"%");
		System.out.println("Aumento: R$"+(novo_salario-salario));
		
		
		
		scan.close();
	}

}
