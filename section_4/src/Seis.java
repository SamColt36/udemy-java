import java.util.Locale;
import java.util.Scanner;

public class Seis {

	public static void main(String[] args) {
		double A, B, C, a1, a2, a3, a4, a5;
		Scanner sc = new Scanner(System.in);
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		a1 = (A * C)/2; // TRIANGULO
		a2 = (3.14159*C*C); // CIRCULO
		a3 = ((A + B)*C)/2; // TRAPEZIO
		a4 = Math.pow(B, 2); // QUADRADO
		a5 = (A * B); //RETANGULO
		Locale.setDefault(Locale.US);
		System.out.printf("TRIANGULO: %.3f%n", a1);
		System.out.printf("CIRCULO: %.3f%n", a2);
		System.out.printf("TRAPEZIO: %.3f%n", a3);
		System.out.printf("QUADRADO: %.3f%n", a4);
		System.out.printf("RETANGULO: %.3f%n", a5);
	}
}