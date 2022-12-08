import java.util.Scanner;

public class Um {

	public static void main(String[] args) {
		int x, i;
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		sc.close();
		if (x >= 1 && x <= 1000) {
			for (i=1; i<=x ; i++) {
				if (i % 2 == 1) {
					System.out.println(i);
				}
			}
		} else {
			System.out.println("Escreva um numero entre 1 e 1000");
		}
	}

}
