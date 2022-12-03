import java.util.Locale;
import java.util.Scanner;

public class Cinco {

	public static void main(String[] args) {
		int code1, num1, code2, num2 ;
		double valor1, valor2, price1, price2, price3;
		Scanner sc = new Scanner(System.in);
		code1 = sc.nextInt();
		num1 = sc.nextInt();
		valor1 = sc.nextDouble();
		code2 = sc.nextInt();
		num2 = sc.nextInt();
		valor2 = sc.nextDouble();
		price1 = (num1 * valor1);
		price2 = (num2 * valor2);
		price3 = (price1 + price2);
		Locale.setDefault(Locale.US);
		System.out.printf("VALOR A PAGAR: R$ %.2f", price3);
	}

}
