package exercicios_resolvidos;
import java.util.Scanner;


public class Ex27 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float num1 = scan.nextFloat();
		float num2 = scan.nextFloat();
		Float[] nums = {num1,num2};
		for (int i=0;i<=1;i++) {
			System.out.println("----"+nums[i]+"----");
			//par ou impar
			if (nums[i]%2==0) {
				System.out.println("PAR");
			} else {
				System.out.println("IMPAR");
			}
			//positivo ou negativo
			if (nums[i] < 0) {
				System.out.println("NEGATIVO");
			} else {
				System.out.println("POSITIVO");
			}
			//inteiro ou decimal
			String string_num = String.valueOf(nums[i]);
			if (string_num.indexOf(".") == -1) {
				System.out.println("INTEIRO");
			} else {
				int index_ponto = string_num.indexOf(".0");
				if (index_ponto != -1) {
					System.out.println("INTEIRO");
				} else {
					System.out.println("DECIMAL");
				}
			}
		}
		scan.close();
	}
}
