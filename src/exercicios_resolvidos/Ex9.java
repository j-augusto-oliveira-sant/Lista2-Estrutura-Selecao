package exercicios_resolvidos;
import java.util.Scanner;


public class Ex9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Faça um programa para a leitura de duas notas parciais de um aluno.
		//Peso Ideal homem e mulher
		System.out.println("Altura (metros):");
		float fnum = scan.nextFloat();
		System.out.println("Peso: (kg):");
		float peso = scan.nextFloat();
		char sex = 'p';
		scan.nextLine();
		while (sex != 'h' && sex != 'm') {
			System.out.println("Sexo: (h/m)");
			sex = scan.nextLine().charAt(0);
		}
		if (sex == 'h') {
			System.out.println("Altura: "+fnum);
			System.out.println("Sexo: Homem");
			System.out.println("Peso Ideal: "+((72.7*fnum) - 58)+"kg");
		} else {
			System.out.println("Altura: "+fnum);
			System.out.println("Peso: "+peso);
			System.out.println("Sexo: Mulher");
			System.out.println("Peso Ideal: "+((62.1*fnum) - 44.7)+"kg");
		}
		scan.close();
	}

}
