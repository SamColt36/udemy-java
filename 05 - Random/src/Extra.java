import java.util.Scanner;

public class Extra {

	public static void main(String[] args) {	
		int x, p;
		double y;
		System.out.print("Digite a quantidade de minutos usados: ");
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		p = 50;
		if (x < 101) {
			System.out.printf("Valor a pagar: R$ %d", p);
		}
		else {
			y = (((x - 100)*2) + p);
			System.out.printf("Valor a pagar: R$ %.2f", y);
		}
		sc.close();
	}

}
