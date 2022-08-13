package exercicios_resolvidos;
import java.util.Scanner;


public class Ex14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Dia da Semana por index
		String[] semana = {"Domingo","Segunda","Terça","Quarta",
				"Quinta","Sexta","Sabado"};
		int index = scan.nextInt();
		if (index <= 7) {
			System.out.println(semana[index-1]);
		} else {
			System.out.println("INVALIDO");
		}
		scan.close();
	}
}
