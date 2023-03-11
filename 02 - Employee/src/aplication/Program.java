package aplication;

import java.util.Locale;
import java.util.Scanner;
import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Employee employee = new Employee();
		Scanner sc = new Scanner(System.in);
		System.out.println("Name: ");
		employee.name = sc.nextLine();
		
		System.out.println("Gross salary: ");
		employee.grossSalary = sc.nextDouble();
		
		System.out.println("Tax: ");
		employee.tax = sc.nextDouble();
		
		System.out.println("Employee: " + employee.name + ", $ " + String.format("%.2f", employee.netSalary()));
		System.out.println("Which percentage to increase salary? ");
		double porcentage = sc.nextDouble();
		employee.increaseSalary(porcentage);
		
		System.out.println("Updated data: " + employee.name + " " + String.format("%.2f", employee.netSalary()));
		
		sc.close();
	}

}
