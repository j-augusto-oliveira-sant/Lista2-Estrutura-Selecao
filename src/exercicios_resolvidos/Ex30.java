package exercicios_resolvidos;
import java.util.Scanner;


public class Ex30 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Fruteira está vendendo frutas
		//qtd de maças
		System.out.println("Quantos quilos de maça: ");
		int maca_kg = scan.nextInt();
		float custo_maca;
		if (maca_kg > 5) {
			custo_maca = 2.20f;
		} else {
			custo_maca = 2.50f;
		}
		//qtd de morangos
		System.out.println("Quantos quilos de morango: ");
		int morango_kg = scan.nextInt();
		float custo_morango;
		if (morango_kg > 5) {
			custo_morango = 1.50f;
		} else {
			custo_morango = 1.80f;
		}
		//total
		float total = (custo_maca*maca_kg)+(custo_morango*morango_kg);
		//desconto
		if (morango_kg+maca_kg > 8) {
			total = total-(total*0.1f);
		}
		System.out.println("Valor total: R$"+total);
		
		
		scan.close();
	}
}
