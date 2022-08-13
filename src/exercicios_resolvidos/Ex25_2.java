package exercicios_resolvidos;
import java.util.Scanner;


public class Ex25_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//par ou impar
		int num = scan.nextInt();
		if (num%2==0) {
			System.out.println("PAR");
		} else {
			System.out.println("IMPAR");
		}
		
		scan.close();
	}
}
