import java.util.Scanner;

public class Two {

	public static void main(String[] args) {
		int x;
		Scanner sc = new Scanner(System.in);

		x = sc.nextInt();
		if ((x % 2) == 0)
			System.out.println("PAR");

		else
			System.out.println("IMPAR");

		sc.close();
	}

}
