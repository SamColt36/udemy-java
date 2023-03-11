import java.util.Locale;
import java.util.Scanner;

public class Five {

	public static void main(String[] args) {
		int num1, num2;
		double valor1, valor2, price;

		Scanner sc = new Scanner(System.in);
		sc.nextInt();
		num1 = sc.nextInt();
		valor1 = sc.nextDouble();
		sc.nextInt();
		num2 = sc.nextInt();
		valor2 = sc.nextDouble();

		price = (num1 * valor1 + num2 * valor2);
		Locale.setDefault(Locale.US);
		System.out.printf("VALOR A PAGAR: R$ %.2f", price);

		sc.close();
	}

}
