import java.util.Locale;
import java.util.Scanner;

public class Quatro {

	public static void main(String[] args) {
		double z, x, y;
		int n, i;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for (i=1; i<=n; i++) {
			x = sc.nextDouble();
			y = sc.nextDouble();
			if (y==0.0) {
				System.out.printf("DIVISAO(%d) = divisao impossivel%n", i);
			} else {
				z = x/y;
				Locale.setDefault(Locale.US);
				System.out.printf("DIVISAO(%d) = %.1f%n", i, z);
			}
		}
		sc.close();
	}

}
