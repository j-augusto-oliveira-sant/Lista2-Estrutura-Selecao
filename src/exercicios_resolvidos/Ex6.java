package exercicios_resolvidos;
import java.util.Scanner;


public class Ex6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Fa�a um Programa que pe�a um n�mero inteiro e se este n�mero for par, 
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
