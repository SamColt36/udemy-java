import java.util.Scanner;

public class Eight {

	public static void main(String[] args) {
		double x, y, z, s, i;
		System.out.print("Escreva seu salario (R$): ");
		Scanner sc = new Scanner(System.in);
		s = sc.nextDouble();
		if (s < 0)
			System.out.println("O salario deve ser maior que zero!");
		else {
			if (s < 2000.01)
				System.out.println("Isento");
			else { // s > 2000,01
				if (s < 3000.01) { // 2000.01<s<3000.01
					x = (s - 2000);
					i = (x * 0.08);
					System.out.printf("R$ %.2f", i);
				} else {
					if (s < 4500.01) { // 3000.01<s<4500.01
						x = (s - 2000); // isento
						y = (x - 1000); // ref. 18%
						// i = ((1000 * 0.08) + (y * 0.18))
						i = (80 + (y * 0.18));
						System.out.printf("R$ %.2f", i);
					} else { // s>4500
						z = (s - 4500);
						// i = ((1000 * 0.08) + (1500 * 0.18) + (z * 0.28))
						i = (350 + (z * 0.28));
						System.out.printf("R$ %.2f", i);
					}

				}
			}
		}
		sc.close();
	}

}
