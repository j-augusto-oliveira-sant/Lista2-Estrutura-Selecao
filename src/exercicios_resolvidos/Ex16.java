package exercicios_resolvidos;
import java.util.Scanner;


public class Ex16 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Media
		float soma = 0;
		for (int i = 0;i<=3;i++) {
			System.out.print("Informe nota do mês "+(i+1)+":");
			float num = scan.nextFloat();
			soma += num;
		}
		float media = (soma/4);
		System.out.println("Media "+media);
		if (media > 3) {
			if (media<= 6.9f) {
				System.out.println("EM EXAME");
			} else {
				System.out.println("APROVADO");
			}
		} else {
			System.out.println("REPROVADO");
		}
		
		scan.close();
	}
}
