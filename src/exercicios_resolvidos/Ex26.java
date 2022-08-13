package exercicios_resolvidos;
import java.util.Scanner;


public class Ex26 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String num = scan.nextLine();
		if (num.indexOf(".") == -1) {
			System.out.println("INTEIRO");
		} else {
			int index_ponto = num.indexOf(".0");
			if (index_ponto != -1) {
				System.out.println("INTEIRO");
			} else {
				System.out.println("DECIMAL");
			}
		}
		scan.close();
	}
}
