import java.util.Scanner;

public class Sete {

	public static void main(String[] args) {
		int i, n, x, y, z;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for (i=1; i<=n; i++) {
			x = (int) Math.pow(i, 1);
			y = (int) Math.pow(i, 2);
			z = (int) Math.pow(i, 3);
			System.out.println(x + " " + y + " " + z);
		}
	}

}
