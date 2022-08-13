package exercicios_resolvidos;
import java.util.Scanner;


public class Ex13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Calculo Folha de Pagamento
		
		//SALARIO BRUTO
		System.out.println("Valor da Hora (reais): ");
		float valor_hora = scan.nextFloat();
		System.out.println("Horas Trabalhadas: ");
		float horas = scan.nextFloat();
		float salario = valor_hora*horas;
		//IR
		float ir = 0;
		if (salario <= 900) {
			ir = 0;
		} else {
			if (salario > 900 && salario <= 1500) {
				ir = 0.05f;
			} else {
				if (salario > 1500 && salario <= 2500) {
					ir = 0.1f;
				} else {
					if (salario > 2500) {
						ir = 0.2f;
					}
				}
			}
		}
		System.out.println("SALARIO BRUTO: R$"+salario);
		//11% FGTS
		float fgts = salario*0.11f;
		System.out.println("FGTS: R$"+fgts);
		//-3% sindicato
		float sindicato = salario*0.03f;
		System.out.println("SINDICATO: R$"+sindicato);
		//-10% INSS
		float inss = salario*0.1f;
		System.out.println("INSS: R$"+inss);
		//IR
		System.out.println("IR ("+(ir*100)+"): R$"+(salario*ir));
		//salario novo
		float novo_salario = (salario-(salario*ir)-inss-sindicato);
		System.out.println("SALARIO LIQUIDO: R$"+novo_salario);
		
		
		scan.close();
	}

}
