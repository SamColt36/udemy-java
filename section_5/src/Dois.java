import java.util.Scanner;

public class Dois {

	public static void main(String[] args) {
		int x, y;
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		y = (x%2);
		if (y == 0) {
			System.out.println("PAR");
		}
		else {
			System.out.println("IMPAR");
		}
	}

}
