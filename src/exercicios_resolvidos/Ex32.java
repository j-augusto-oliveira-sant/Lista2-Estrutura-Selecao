package exercicios_resolvidos;
import java.util.Scanner;


public class Ex32 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//prova gabarito: (a,a,b,b,c,c,d,d,e,e)
		String[] respostas = new String[10];
		String[] gabarito = {"a","a","b","b","c","c","d","d","e","e"};
		//perguntar
		for (int i = 0;i<10;i++) {
			System.out.println("Resposta Q"+(i+1)+": ");
			respostas[i] = scan.nextLine();
		}
		//checar
		for (int i = 0;i<10;i++) {
			if (gabarito[i]==respostas[i].intern()) {
				System.out.println("Q"+(i+1)+" Correto");
			} else {
				System.out.println("Q"+(i+1)+" Errado, reposta correta ("+
			gabarito[i]+")");
			}
		}
		
		scan.close();
	}
}
