package app;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		CurrencyConverter d = new CurrencyConverter();
		Scanner sc = new Scanner(System.in);
		System.out.print("What is the dollar price? ");
		d.dollar_price = sc.nextDouble();

		System.out.print("How many dollars will be bought? ");
		d.dollar_comp = sc.nextDouble();

		System.out.printf("Amount to be paid in reais = %.2f", d.resultado());

		sc.close();

	}

}
