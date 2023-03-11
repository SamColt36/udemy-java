import java.util.Locale;
import java.util.Scanner;

public class Four {

	public static void main(String[] args) {
		double x, y;
		int n;
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			x = sc.nextDouble();
			y = sc.nextDouble();
			if (y == 0.0)
				System.out.printf("DIVISAO(%d) = divisao impossivel%n", i);
			else 
				System.out.printf("DIVISAO(%d) = %.1f%n", i, (x / y));
		}
		sc.close();
	}

}
