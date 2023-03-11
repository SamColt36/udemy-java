import java.util.Locale;
import java.util.Scanner;

public class Four {

	public static void main(String[] args) {
		int num, hora;
		double salario, salarioFinal;
		Scanner sc = new Scanner(System.in);

		num = sc.nextInt();
		hora = sc.nextInt();
		salario = sc.nextDouble();
		salarioFinal = salario * hora;
		System.out.printf("NUMBER = %d%n", num);
		Locale.setDefault(Locale.US);
		System.out.printf("SALARY = U$ %.2f%n", salarioFinal);

		sc.close();
	}

}
