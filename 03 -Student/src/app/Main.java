package app;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Student student = new Student();
		System.out.print("Nome: ");
		Scanner sc = new Scanner(System.in);
		student.name = sc.nextLine();
		System.out.print("N1: ");
		student.nota1 = sc.nextDouble();
		System.out.print("N2: ");
		student.nota2 = sc.nextDouble();
		System.out.print("N3: ");
		student.nota3 = sc.nextDouble();
		sc.close();
		student.nota_final();
		System.out.printf("FINAL GRADE = %.2f%n", student.nota_final());
		if (student.nota_final() >= 60) {
			System.out.println("PASS");
		} else {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS", student.restante());
		}
	}

}
