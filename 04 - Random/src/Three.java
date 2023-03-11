import java.util.Scanner;

public class Three {

	public static void main(String[] args) {
		int a, b, c, d, difereca;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();

		difereca = ((a * b) - (c * d));
		System.out.print("DIFERENCA = " + difereca);
		sc.close();
	}

}
