package exercicios_resolvidos;
import java.util.Scanner;


public class Ex3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("F ou M: ");
		char letra = scan.nextLine().charAt(0);
		System.out.println("----");
		if (letra == 'F') {
			System.out.println("FEMININO");
		} else {
			System.out.println("MASCULINO");
		}
		
		scan.close();
	}

}
