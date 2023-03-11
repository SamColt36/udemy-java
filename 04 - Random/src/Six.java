import java.util.Locale;
import java.util.Scanner;

public class Six {

	public static void main(String[] args) {
		double A, B, C;
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();

		System.out.printf("TRIANGULO: %.3f%n", A * C / 2);
		System.out.printf("CIRCULO: %.3f%n", (Math.PI * Math.pow(C, 2)));
		System.out.printf("TRAPEZIO: %.3f%n", ((A + B) * C) / 2);
		System.out.printf("QUADRADO: %.3f%n", Math.pow(B, 2));
		System.out.printf("RETANGULO: %.3f%n", (A * B));

		sc.close();
	}
}