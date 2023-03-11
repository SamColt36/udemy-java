import java.util.Scanner;

public class Five {

	public static void main(String[] args) {
		int c, n;
		double p;
		System.out.println("       TABELA DE PREÇOS");
		System.out.println("CODIGO  ESPECIFICACAOO  PRECO(R$)");
		System.out.println("  1    cachorro-quente   4,00 ");
		System.out.println("  2        x-salada      4,50 ");
		System.out.println("  3        x-bacon       5,00 ");
		System.out.println("  4    torrada simples   2,00 ");
		System.out.println("  5     refrigerante     1,50 ");
		System.out.print("Digite o codigo do produto: ");
		Scanner sc = new Scanner(System.in);
		c = sc.nextInt();
		System.out.print("Digite a quantidade desejada: ");
		n = sc.nextInt();
		switch (c) {
			case 1:
				p = (4.00 * n);
				Response(p);
			break;
			case 2:
				p = (4.50 * n);
				Response(p);
			break;
			case 3:
				p = (5.00 * n);
				Response(p);
			break;
			case 4:
				p = (2.00 * n);
				Response(p);
			break;
			case 5:
				p = (1.50 * n);
				Response(p);
			break;
			default:
			System.out.println("SELECIONE UM CODIGO VALIDO!");
		}
		sc.close();
	}
	public static void Response(double p) {
		System.out.println("Total R$ " + String.format("%.2f", p));
	}
}
