import java.util.Scanner;

public class One {

	public static void main(String[] args) {
		int x;
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		if (x > 0)
			System.out.print("POSITIVO");
		else {
			if (x < 0)
				System.out.print("NEGATIVO");
			else
				System.out.println("ZERO");
		}
		sc.close();
	}

}
