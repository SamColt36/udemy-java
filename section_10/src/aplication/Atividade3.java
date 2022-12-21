package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.AtividadeTres;

public class Atividade3 {

	public static void main(String[] args) {
		double acum1 = 0.0, acum2 = 0.0, media = 0.0;

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		System.out.println();

		AtividadeTres[] v = new AtividadeTres[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Dados da " + (i + 1) + "a pessoa:");

			System.out.print("Nome: ");
			String nome = sc.next();

			System.out.print("Idade: ");
			int idade = sc.nextInt();

			System.out.print("Altura: ");
			double altura = sc.nextDouble();

			v[i] = new AtividadeTres(nome, idade, altura);

			// Altura media
			acum1 += v[i].getAltura();
			media = acum1 / v.length;
			System.out.println();
		}
		for (int i = 0; i < n; i++) {
			// Pessoas com menos de 16 anos
			if (v[i].getIdade() < 16) {
				acum2 += 1;
			}
		}

		System.out.printf("Altura media: %.2f%n", media);
		System.out.printf("Pessoas com menos de 16 anos: %.2f%%%n", (100 * acum2 / v.length));
		for (int i = 0; i < n; i++) {
			// Pessoas com menos de 16 anos
			if (v[i].getIdade() < 16) {
				System.out.println(v[i].getNome());
			}
		}

		sc.close();

	}

}
