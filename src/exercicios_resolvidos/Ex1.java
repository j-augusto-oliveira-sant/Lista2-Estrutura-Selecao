package exercicios_resolvidos;
import java.util.Scanner;


public class Ex1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Faça um Programa que peça dois números e imprima o maior deles.
		System.out.print("Num1: ");
		int num1 = scan.nextInt();
		System.out.print("Num2: ");
		int num2 = scan.nextInt();
		System.out.println("Maior:");
		if (num1>num2) {
			System.out.println(num1);
		} else {
			if (num1<num2) {
				System.out.println(num2);
			} else {
				System.out.println("Nenhum, Iguais");
			}
		}
		
		
		
		scan.close();
	}

}
