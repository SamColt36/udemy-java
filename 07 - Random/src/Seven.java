import java.util.Scanner;

public class Seven {

	public static void main(String[] args) {
		int n, x, y, z;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			x = (int) Math.pow(i, 1);
			y = (int) Math.pow(i, 2);
			z = (int) Math.pow(i, 3);
			System.out.println(x + " " + y + " " + z);
		}
		sc.close();
	}

}
