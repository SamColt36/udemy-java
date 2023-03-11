package aplication;

import java.util.Locale;
import java.util.Scanner;

public class Atividade8 {

	public static void main(String[] args) {
		int n, i, sum = 0, cont = 0;
		double media;

		Locale.setDefault(Locale.US);
		System.out.print("Quantos elementos vai ter o vetor? ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		int[] v = new int[n];
		for (i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			v[i] = sc.nextInt();

			if (v[i] % 2 == 0) {
				sum += v[i];
				cont += 1;
			}
		}

		if (cont > 0) {
			media = (sum / cont);
			System.out.println();
			System.out.printf("MEDIA DOS PARES = %.1f%n", media);
		} else {
			System.out.println();
			System.out.println("NENHUM NUMERO PAR");
		}

		sc.close();
	}

}
