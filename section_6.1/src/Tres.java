import java.util.Locale;
import java.util.Scanner;

public class Tres {

	public static void main(String[] args) {
		int n, i;
		double x, y, z, m;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		for (i=1; i<=n; i++) {
			x = sc.nextDouble();// peso 2
			y = sc.nextDouble();// peso 3
			z = sc.nextDouble();// peso 5
			m = (x*2.0 + y*3 + z*5)/ 10;
			Locale.setDefault(Locale.US);
			System.out.printf("MEDIA = %.1f%n", m);
		}
		sc.close();
	}

}
