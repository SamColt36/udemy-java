import java.util.Scanner;

public class Two {

	public static void main(String[] args) {
		double raio, area;
		Scanner sc = new Scanner(System.in);
		raio = sc.nextDouble();
		sc.close();
		
		area = (Math.PI * Math.pow(raio, 2));
		System.out.printf("A= %.4f", area);
	}

}
