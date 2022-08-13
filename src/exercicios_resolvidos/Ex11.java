package exercicios_resolvidos;
import java.util.Scanner;


public class Ex11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Faça um Programa que pergunte em que turno você estuda.
		char turno = scan.nextLine().toUpperCase().charAt(0);
		if (turno == 'M') {
			System.out.println("Manha");
		} else {
			if (turno == 'V') {
				System.out.println("VESPERTINO");
			} else {
				System.out.println("NOTURNO");
			}
		}
		
		scan.close();
	}

}
