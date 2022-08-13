package exercicios_resolvidos;
import java.util.Scanner;


public class Ex23 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//ler tres idade de alunos
		int idade1 = scan.nextInt();
		int idade2 = scan.nextInt();
		int idade3 = scan.nextInt();
		
		float media = (idade1+idade2+idade3)/3;
		System.out.println("Media:"+media);
		if (media < 25) {
			System.out.println("Turma Jovem");
		} else {
			if (media >= 25 && media < 40) {
				System.out.println("Turma Adulta");
			} else {
				System.out.println("Turma Idosa");
			}
		}
		
		
		scan.close();
	}
}
