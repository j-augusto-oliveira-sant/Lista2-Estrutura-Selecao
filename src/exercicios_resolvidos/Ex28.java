package exercicios_resolvidos;
import java.util.Scanner;


public class Ex28 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int soma = 0;
		System.out.println("sim = 1, não = 0");
		System.out.println("Telefonou para a vítima?");
		soma += scan.nextInt();
		System.out.println("Esteve no local do crime?");
		soma += scan.nextInt();
		System.out.println("Mora perto da vítima?");
		soma += scan.nextInt();
		System.out.println("Devia para a vítima?");
		soma += scan.nextInt();
		System.out.println("Já trabalhou com a vítima?");
		soma += scan.nextInt();
		if (soma==5) {
			System.out.println("ASSASSINO");
		} else {
			if (soma>=3 && soma<=4) {
				System.out.println("CÚMPLICE");
			} else {
				if (soma==2) {
					System.out.println("SUSPEITO");
				} else {
					System.out.println("INOCENTE");
				}
			}
		}
		
		
		scan.close();
	}
}
