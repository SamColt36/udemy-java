package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.AtividadeDez;

public class Atividade10 {

	public static void main(String[] args) {
		double sum = 0.0;
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos alunos serao digitados? ");
		int n = sc.nextInt();
		System.out.println();

		AtividadeDez[] v = new AtividadeDez[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Digite nome, primeira e segunda nota do " + (i + 1) + "o aluno:");
			String nome = sc.next();
			double nota1 = sc.nextDouble();
			double nota2 = sc.nextDouble();
			double media = (nota1 + nota2) / 2;
			v[i] = new AtividadeDez(nome, nota1, nota2, media);
		}

		System.out.println("Alunos aprovados:");
		for (int i = 0; i < n; i++) {
			if (v[i].getMedia() >= 6.0) {
				System.out.println(v[i].getNome());
			}
		}

		sc.close();

	}

}
