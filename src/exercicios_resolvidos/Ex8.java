package exercicios_resolvidos;
import java.util.Scanner;


public class Ex8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Faça um programa para a leitura de duas notas parciais de um aluno.
		float nota1 = scan.nextFloat();
		float nota2 = scan.nextFloat();
		
		float media = (nota1+nota2)/2;
		if (media >=7) {
			System.out.println("APROVADO");
		} else {
			System.out.println("REPROVADO");
		}
		
		scan.close();
	}

}
