package aplication;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();

		int[] v = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			v[i] = sc.nextInt();
		}
		
		System.out.println("NUMEROS NEGATIVOS:");
		for (int i = 0; i < v.length; i++) {
			if (v[i] < 0) {
				System.out.println(v[i]);
			}
		}
		
		
		sc.close();
	}

}
