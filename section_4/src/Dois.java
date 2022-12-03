import java.util.Scanner;

public class Dois {

	public static void main(String[] args) {
		double pi = 3.14159, r, area;
		Scanner sc = new Scanner(System.in);
		r = sc.nextDouble();
		area = (pi*r*r);
		System.out.printf("A= %.4f", area);
	}

}
