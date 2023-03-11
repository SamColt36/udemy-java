package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.AtividadeOnze;

public class Atividade11 {

	public static void main(String[] args) {
		int n, i, cont1 = 0, cont2 = 0;
		double altura, menor = 100, maior = 0, sum = 0, media = 0;
		char genero, m = 'M', f = 'F';
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		System.out.print("Quantas pessoas serao digitadas? ");
		n = sc.nextInt();

		AtividadeOnze[] v = new AtividadeOnze[n];
		for (i = 0; i < n; i++) {
			System.out.print("Altura da " + (i + 1) + "a pessoa: ");
			altura = sc.nextDouble();

			System.out.print("Genero da " + (i + 1) + "a pessoa: ");
			genero = sc.next().charAt(0);

			v[i] = new AtividadeOnze(altura, genero);
			maior = Math.max(v[i].getAltura(), maior);
			menor = Math.min(v[i].getAltura(), menor);

			if (Character.toUpperCase(genero) == m) {
				cont1 += 1;
			} else if (Character.toUpperCase(genero) == f) {
				sum += v[i].getAltura();
				cont2 += 1;
				media = sum / cont2;
			}
		}

		System.out.println();
		System.out.printf("Menor altura = %.2f%n", menor);
		System.out.printf("Maior altura = %.2f%n", maior);
		System.out.printf("Media das alturas das mulheres = %.2f%n", media);
		System.out.println("Numero de homens = " + cont1);
		sc.close();

	}

}
