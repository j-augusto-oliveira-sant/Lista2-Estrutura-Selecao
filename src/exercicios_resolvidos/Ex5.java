package exercicios_resolvidos;
import java.util.Scanner;


public class Ex5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Fa�a um Programa que verifique se uma letra digitada � vogal.
		String[] vogais = {"A","E","I","O","U"};
		String letra = scan.nextLine().strip().toUpperCase();
		boolean vogal = false;
		for (int i=0;i<=4;i++) {
			if (letra.intern() == vogais[i]) {
				vogal = true;
				break;
			}
		}
		System.out.println("� Vogal: "+vogal);
		scan.close();
	}

}
