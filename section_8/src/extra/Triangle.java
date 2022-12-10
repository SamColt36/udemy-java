package extra;

import java.util.Locale;
import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		double a1, b1, c1, p1, area1;
		double a2, b2, c2, p2, area2;
		System.out.println("Enter the measures  of triangle X: ");
		Scanner sc = new Scanner(System.in);
		a1 = sc.nextDouble(); 
		b1 = sc.nextDouble(); 
		c1 = sc.nextDouble(); 
		
		System.out.println("Enter the measures  of triangle Y: ");
		a2 = sc.nextDouble(); 
		b2 = sc.nextDouble(); 
		c2 = sc.nextDouble(); 
		
		p1 = (a1+b1+c1)/2;
		area1 = Math.sqrt(p1*(p1-a1)*(p1-b1)*(p1-c1));
		p2 = (a2+b2+c2)/2;
		area2 = Math.sqrt(p2*(p2-a2)*(p2-b2)*(p2-c2));
		sc.close();
		
		System.out.printf("Triangle X area: %.4f%n", area1);
		System.out.printf("Triangle X area: %.4f%n", area2);
		
		if (area1 > area2) {
			System.out.println("Larger area: X");
		}
		else  {
			System.out.println("Larger area: Y");
		}
	}

}
