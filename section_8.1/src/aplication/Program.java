package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		System.out.println("Enter product data:");
		System.out.print("Name: ");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		
		System.out.print("Price: ");
		Double price = sc.nextDouble();
		
		System.out.print("Quantity in stock: ");
		int quantity = sc.nextInt();
		
		System.out.println(""); 
		Product obj = new Product(name, price, quantity);
		System.out.println("Product data: " + obj.toString());
		
		System.out.println("");
		System.out.print("Enter  the number of products to be added in stock: ");
		quantity = sc.nextInt();
		obj.addProducts(quantity);
		
		System.out.println("");
		System.out.println("Update data: " + obj.toString());
		
		System.out.println("");
		System.out.print("Enter  the number of products to be removed in stock: ");
		quantity = sc.nextInt();
		obj.removeProducts(quantity);
		
		System.out.println("");
		System.out.println("Update data: " + obj.toString());
		
		
		sc.close();
	}

}
