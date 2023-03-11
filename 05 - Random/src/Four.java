import java.util.Scanner;

public class Four {

	public static void main(String[] args) {
		int hi, hf, dif;
		Scanner sc = new Scanner(System.in);
		hi = sc.nextInt();
		hf = sc.nextInt();
		if (hi > hf) {
			dif = (24 - hi + hf);
			System.out.printf("O JOGO DUROU %d HORA(S)", dif);
		} else if (hi < hf) { // hi < hf
			dif = (hf - hi);
			System.out.printf("O JOGO DUROU %d HORA(S)", dif);
		} else // hi = hf
			System.out.println("O JOGO DUROU 24 HORA(S)");
		sc.close();
	}

}
