import java.util.Scanner;

public class Tres {

	public static void main(String[] args) {
		int a, b, c, d;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = a % b;
		d = b % a;
		if (a > b) {
			if (c == 0) {
				System.out.println("Sao multiplos");
			}
			else {
				System.out.println("Nao sao Multiplos");
			}
		}
		else {
			if (d == 0) {
				System.out.println("Sao multiplos");
			}
			else {
				System.out.println("Nao sao Multiplos");
			}
		}
	}

}
