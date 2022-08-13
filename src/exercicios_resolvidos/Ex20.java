package exercicios_resolvidos;
import java.util.Scanner;


public class Ex20 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//
		int ano = scan.nextInt();
		if (ano%4==0) {
			System.out.println("BISSEXTO");
		} else {
			System.out.println("NORMAL");
		}
		
		scan.close();
	}
}
