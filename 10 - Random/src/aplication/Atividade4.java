package aplication;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();

		int acum = 0;
		int[] v = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			v[i] = sc.nextInt();
			if (v[i] % 2 == 0) {
				acum += 1;
			}
		}

		System.out.println();
		System.out.println("NUMEROS PARES:");
		for (int i = 0; i < n; i++) {
			if (v[i] % 2 == 0) {
				System.out.print(v[i] + " ");
			}
		}
		
		System.out.println();
		System.out.println("QUANTIDADE DE PARES = " + acum);
		sc.close();
	}
}
