import java.util.Locale;
import java.util.Scanner;

public class Quatro {

	public static void main(String[] args) {
		int num, hora;
		double sal, sal_final;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		hora = sc.nextInt();
		sal = sc.nextDouble();
		sal_final = sal * hora;
		System.out.printf("NUMBER = %d%n", num);
		Locale.setDefault(Locale.US);
		System.out.printf("SALARY = U$ %.2f%n", sal_final);
	}

}
