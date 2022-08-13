package exercicios_resolvidos;
import java.util.Scanner;


public class Ex24 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float soma = 0;
		for (int i = 0;i<=2;i++) {
			System.out.print("Informe nota do P"+(i+1)+":");
			float num = scan.nextFloat();
			soma += num;
		}
		float media = (soma/3);
		System.out.println("Media: "+media);
		if (media >= 7) {
			if (media == 10) {
				System.out.println("APROVADO COM DISTINÇÃO");
			} else {
				System.out.println("APROVADO");
			}
		} else {
			System.out.println("REPROVADO");
		}
		
		
		
		scan.close();
	}
}
