import java.util.Scanner;

public class Tres {

	public static void main(String[] args) {
		int x , a = 0, b = 0, c = 0;
		System.out.println("CODE ITEM");
		System.out.println(" 1   Alcool");
		System.out.println(" 2   Diesel");
		System.out.println(" 3   Gasolina");
		System.out.printf(" 4   Fim %n%n");
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		while (x != 4) {
			if (x == 1) {
				a = a + 1;
			}
			else if (x == 2){
				b = b + 1;
			}
			else if (x == 3){
				c = c + 1;
			}
			x = sc.nextInt();
		}
		System.out.println("MUITO OBRIGADO");
		System.out.printf("Alcool: %d%n", a);
		System.out.printf("Gasolina: %d%n", b);
		System.out.printf("Diesel: %d%n", c);
		
	}

}
