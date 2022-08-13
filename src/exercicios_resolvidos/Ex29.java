package exercicios_resolvidos;
import java.util.Scanner;


public class Ex29 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//POSTO DE COMBUSTIVEL
		System.out.println("ÁLCOOL OU GASOLINA (A/G): ");
		String resposta = scan.nextLine().toLowerCase();
		System.out.println("Quantos litros: ");
		float litros = scan.nextFloat();
		float custo,desconto_minimo,desconto_maximo;
		if (resposta.intern() == "a") {
			desconto_minimo = 0.03f;
			desconto_maximo = 0.05f;
			custo = 1.9f;
		} else {
			desconto_minimo = 0.04f;
			desconto_maximo = 0.06f;
			custo = 2.5f;
		}
		if (litros <= 20) {
			System.out.println("Valor a pagar: R$"+
			((litros*custo)-(desconto_minimo*(litros*custo))));
		} else {
			System.out.println("Valor a pagar: R$"+
			((litros*custo)-(desconto_maximo*(litros*custo))));
		}
		scan.close();
	}
}
