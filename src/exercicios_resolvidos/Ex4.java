package exercicios_resolvidos;
import java.util.Scanner;


public class Ex4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Fa�a um Programa que pe�a para entrar com um ano com 4 d�gitos 
		//e determine se o mesmo � ou n�o bissexto.
		int ano = scan.nextInt();
		if (ano%4==0) {
			System.out.println("BISSEXTO");
		} else {
			System.out.println("NORMAL");
		}
		
		
		scan.close();
	}

}
