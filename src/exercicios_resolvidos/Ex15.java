package exercicios_resolvidos;
import java.util.Scanner;


public class Ex15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//custo produto
		System.out.println("Custo:");
		float custo = scan.nextFloat();
		//codigo origem
		System.out.println("Codigo:");
		String[] origens = {"Sul","Norte","Leste","Oeste","Nordeste","Nordeste",
				"Centro Oeste","Centro Oeste"};
		int codigo = scan.nextInt();
		if (codigo <= 8) {
			System.out.println(origens[codigo-1]);
		} else {
			System.out.println("IMPORTADO");
		}
		System.out.println("Custo: R$"+custo);
		scan.close();
	}
}
