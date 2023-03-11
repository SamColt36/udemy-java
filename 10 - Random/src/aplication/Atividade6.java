package aplication;

import java.util.Scanner;

public class Atividade6 {

	public static void main(String[] args) {
		int n, i;
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos valores vai ter cada vetor? ");
		n = sc.nextInt();

		int[] a = new int[n];
		int[] b = new int[n];

		System.out.println("Digite os valores do vetor A:");
		for (i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		System.out.println("Digite os valores do vetor B:");
		for (i = 0; i < n; i++) {
			b[i] = sc.nextInt();
		}
		
		System.out.println("VETOR RESULTANTE: ");
		for (i = 0; i < n; i++) {
			System.out.println(a[i] + b[i]);
		}
		
		sc.close();
	}

}
