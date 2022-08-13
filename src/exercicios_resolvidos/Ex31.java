package exercicios_resolvidos;
import java.util.Scanner;


public class Ex31 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Carnes
		//qtd de File Duplo
		System.out.println("Quantos quilos de File Duplo (0 se nao quiser): ");
		int file_kg = 0;
		file_kg = scan.nextInt();
		float custo;
		if (file_kg > 5) {
			custo = 5.80f;
		} else {
			custo = 4.90f;
		}
		//qtd de Alcatra
		if (file_kg == 0) {
			System.out.println("Quantos quilos de Alcatra (0 se nao quiser): ");
			file_kg = scan.nextInt();
			if (file_kg > 5) {
				custo = 6.80f;
			} else {
				custo = 5.90f;
			}
		}
		//qtd de Picanha
		if (file_kg==0) {
			System.out.println("Quantos quilos de Picanha: ");
			file_kg = scan.nextInt();
			if (file_kg > 5) {
				custo = 7.80f;
			} else {
				custo = 6.90f;
			}
		}
		//total
		float total = (file_kg*custo);
		scan.nextLine();
		System.out.println("Pagar pelo cartão? (s/n): ");
		String answer = scan.nextLine().toLowerCase();
		if (answer.intern() == "s") {
			total = total-(total*0.05f);
		}
		System.out.println("Valor total: R$"+total);
		scan.close();
	}
}
