import java.util.Scanner;

public class One {

	public static void main(String[] args) {
		int x, y;
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		y = sc.nextInt();
		
		System.out.print("SOMA = " + (x + y));
		sc.close();
	}

}
