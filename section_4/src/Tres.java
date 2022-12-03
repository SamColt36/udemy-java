import java.util.Scanner;

public class Tres {

	public static void main(String[] args) {
		int a, b, c, d, ab, cd, dif;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		ab = (a * b);
		cd = (c * d);
		dif = (ab - cd);
		System.out.print("DIFERENCA = " + dif);
	}

}
