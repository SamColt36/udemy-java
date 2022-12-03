import java.util.Scanner;

public class Um {

	public static void main(String[] args) {
		int pw, in;
		pw = 2002;
		Scanner sc = new Scanner(System.in);
		//Crtl+Shift+O chama essa biblioteca
		in = sc.nextInt();
		while (in != pw) {
			System.out.println("Senha Invalida");
			in = sc.nextInt();
		}
		System.out.println("Acesso Permitido");
	}

}
