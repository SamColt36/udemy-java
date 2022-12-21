package aplication;

import java.util.Locale;
import java.util.Scanner;

public class Atividade5 {

	public static void main(String[] args) {
		int i, n;
		double maior = 0.0;

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();

		double[] v = new double[n];
		for (i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			v[i] = sc.nextInt();
			maior = Math.max(v[i], maior);
		}
		sc.close();
		
		System.out.printf("MAIOR VALOR = %.1f%n", maior);
		for (i = 0; i < n; i++) {
			if (v[i] == maior) {
				System.out.println("POSICAO DO MAIOR VALOR = " + i);
			}
		}

	}

}
