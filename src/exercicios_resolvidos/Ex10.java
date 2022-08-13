package exercicios_resolvidos;
import java.util.Scanner;


public class Ex10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Faça um Programa que leia três números e mostre o maior e o menor deles.
		int[] new_array = new int[3];
		new_array[0] = scan.nextInt();
		new_array[1] = scan.nextInt();
		new_array[2] = scan.nextInt();
		int temp = 0;
		for (int i=0;i<=2;i++) {
			for (int j=i+1;j<=2;j++) {
				if (new_array[i] <= new_array[j]) {
					temp = new_array[i];
					new_array[i] = new_array[j];
					new_array[j] = temp;
				}
			}
		}
		System.out.println("Maior: "+new_array[0]);
		System.out.println("Menor: "+new_array[2]);
		scan.close();
	}

}
