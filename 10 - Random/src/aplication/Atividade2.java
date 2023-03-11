package aplication;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();

		double[] v = new double[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			v[i] = sc.nextDouble();
		}
		
		System.out.println();
		System.out.print("VALORES = ");
		for (int i = 0; i < v.length; i++) {
			System.out.print(v[i] + " ");
		}
		
		 double sum = 0;
		 for (int i = 0; i < v.length; i++) {
				sum += v[i];
		}
		
		System.out.println();
		System.out.println("SOMA = " + sum);
		System.out.println("MEDIA = " + sum/v.length);
		sc.close();
	}

}
