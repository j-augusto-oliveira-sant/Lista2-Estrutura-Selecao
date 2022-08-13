package exercicios_resolvidos;
import java.util.Scanner;


public class Ex19 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//ax2+bx+c
		//a
		System.out.println("a:");
		int a = scan.nextInt();
		if (a!=0) {
			//b
			System.out.println("b:");
			int b = scan.nextInt();
			//c
			System.out.println("c:");
			int c = scan.nextInt();
			float delta = (b*b)-4*a*c;
			if (delta<0) {
				System.out.println("Delta Negativo");
			} else {
				if (delta==0) {
					System.out.println("Uma Raiz Real");
					double resultado = ((b*-1)+Math.sqrt(delta))/(2*a);
					System.out.println("x = "+resultado);
				} else {
					double x1 = ((b*-1)+Math.sqrt(delta))/(2*a);
					System.out.println("x1 = "+x1);
					double x2 = ((b*-1)-Math.sqrt(delta))/(2*a);
					System.out.println("x2 = "+x2);
				}
			}
		} else {
			System.out.println("Não é do segundo grau.");
		}
		
		scan.close();
	}
}
