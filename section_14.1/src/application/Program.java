package application;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Product common = null, imported = null, used = null;

		List<Product> list = new ArrayList<>();
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Product #" + i + " data:");
			System.out.print("Common, used or imported (c/u/i)? ");
			char status = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Price: ");
			double price = sc.nextDouble();

			if (status == 'c') {
				common = new Product(name, price);
				list.add(common);
			}
			if (status == 'i') {
				System.out.print("Customs fee: ");
				double customsFee = sc.nextDouble();
				imported = new ImportedProduct(name, price, customsFee);
				list.add(imported);
			}
			if (status == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				String dateString = sc.next();
				
				int dia = Integer.parseInt(dateString.substring(0, 2));
				int mes = Integer.parseInt(dateString.substring(3, 5));
				int ano = Integer.parseInt(dateString.substring(6));
				LocalDate date = LocalDate.of(ano, mes, dia);
				used = new UsedProduct(name, price, date);
				list.add(used);
			}

		}

		System.out.println();
		for (Product obj : list) {
			System.out.println(obj);
		}
		sc.close();
	}

}
