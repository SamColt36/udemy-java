package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.AtividadeTres;

public class Atividade9 {

	public static void main(String[] args) {
		int maior = 0;

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantas pessoas voce vai digitar? ");
		int n = sc.nextInt();
		System.out.println();

		AtividadeTres[] v = new AtividadeTres[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Dados da " + (i + 1) + "a pessoa:");

			System.out.print("Nome: ");
			String nome = sc.next();

			System.out.print("Idade: ");
			int idade = sc.nextInt();

			v[i] = new AtividadeTres(nome, idade);
			maior = Math.max(v[i].getIdade(), maior);
		}
		for (int i = 0; i < n; i++) {
			if (v[i].getIdade() == maior) {
				System.out.println("PESSOA MAIS VELHA: " + v[i].getNome());
			}
		}

		sc.close();
	}

}
