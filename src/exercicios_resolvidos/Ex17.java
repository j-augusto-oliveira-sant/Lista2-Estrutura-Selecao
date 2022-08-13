package exercicios_resolvidos;
import java.util.Scanner;


public class Ex17 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Media
		float soma = 0;
		for (int i = 0;i<=1;i++) {
			System.out.print("Informe nota da P"+(i+1)+":");
			float num = scan.nextFloat();
			soma += num;
		}
		float media = (soma/2);
		System.out.println("Media "+media);
		if (media > 4) {
			if (media<= 6) {
				System.out.println("D");
			} else {
				if (media <= 7.5f) {
					System.out.println("C");
				} else {
					if (media <= 9) {
						System.out.println("B");
					} else {
						System.out.println("A");
					}
				}
			}
		} else {
			System.out.println("E");
		}
		
		
		scan.close();
	}
}
