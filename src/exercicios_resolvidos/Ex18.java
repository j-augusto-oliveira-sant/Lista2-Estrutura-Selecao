package exercicios_resolvidos;
import java.util.Scanner;


public class Ex18 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Triangulo
		int lado1 = scan.nextInt();
		int lado2 = scan.nextInt();
		int lado3 = scan.nextInt();
		
		if (lado1 == lado2 && lado1 == lado3) {
			System.out.println("EQUILATERO");
		} else {
			if (lado1 == lado2 || lado2 == lado3 || lado3 == lado1) {
				System.out.println("ISOCELES");
			} else {
				System.out.println("ESCALENO");
			}
		}
		
		scan.close();
	}
}
