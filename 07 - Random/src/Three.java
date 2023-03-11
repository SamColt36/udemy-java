import java.util.Locale;
import java.util.Scanner;

public class Three {

	public static void main(String[] args) {
		int n;
		double x, y, z, m;
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			x = sc.nextDouble();// peso 2
			y = sc.nextDouble();// peso 3
			z = sc.nextDouble();// peso 5
			m = (x * 2.0 + y * 3.0 + z * 5.0) / 10;
			System.out.printf("MEDIA = %.1f%n", m);
		}
		sc.close();
	}

}
