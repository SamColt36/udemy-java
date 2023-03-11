package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Contributor;
import entities.ContributorLegal;
import entities.ContributorPhysicist;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();

		List<Contributor> ls = new ArrayList<>();
		for (int i = 1; i <= n; i++) {
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Anual income: ");
			Double income = sc.nextDouble();
			if (ch == 'i') {
				System.out.print("Health expenditures: ");
				Double health = sc.nextDouble();
				ls.add(new ContributorPhysicist(name, income, health));
			} else {
				System.out.print("Number of employees: ");
				Integer numberEmployee = sc.nextInt();
				ls.add(new ContributorLegal(name, income, numberEmployee));
			}
		}
		
		System.out.println();
		System.out.println("TAXES PAID:");
		for (Contributor contr : ls) {
			System.out.println(contr);
		}
		System.out.println();
		
		double sum = 0;
		for (Contributor contr : ls) {
			sum += contr.imcomeTax();
		}
		System.out.print("TOTAL TAXES: $ " + String.format("%.2f", sum));

		sc.close();
	}

}
