package exercicios_resolvidos;
import java.util.Scanner;


public class Ex6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Faça um Programa que peça um número inteiro e se este número for par, 
		//transforme-o em impar e vice-versa.
		int num = scan.nextInt();
		if (num%2==0) {
			num += 1;
		} else {
			num -= 1;
		}
		System.out.println(num);
		
		
		
		
		scan.close();
	}

}
