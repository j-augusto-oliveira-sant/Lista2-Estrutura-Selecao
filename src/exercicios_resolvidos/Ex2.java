package exercicios_resolvidos;
import java.util.Scanner;


public class Ex2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Faça um Programa que peça um valor e mostre na tela se 
		//o valor é positivo, negativo ou zero.
		System.out.print("Num1: ");
		int num1 = scan.nextInt();
		System.out.println("----");
		if (num1>0) {
			System.out.println("POSITIVO");
		} else {
			if (num1<0) {
				System.out.println("NEGATIVO");
			} else {
				System.out.println("ZERO");
			}
		}
		
		
		scan.close();
	}

}
