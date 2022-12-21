package aplication;

import java.util.Locale;
import java.util.Scanner;

public class Atividade7 {

	public static void main(String[] args) {
		int n, i;
		double media, sum;
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos elementos vai ter o vetor? ");
		n = sc.nextInt();

		double[] v = new double[n];
		sum = 0;
		for (i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			v[i] = sc.nextDouble();
			sum += v[i];
		}
		media = sum / v.length;
		System.out.println();
		System.out.printf("MEDIA DO VETOR = %.3f%n", media);
		System.out.println("ELEMENTOS ABAIXO DA MEDIA:");

		for (i = 0; i < n; i++) {
			if (v[i] < media) {
				System.out.println(v[i]);
			}
		}
		
		sc.close();
	}

}
