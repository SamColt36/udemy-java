package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Product {
	private LocalDate manufactureDate;
	DateTimeFormatter f1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	public UsedProduct() {
	}

	public UsedProduct(String name, Double price, LocalDate manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	public LocalDate getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(LocalDate manufactureDate) {
		this.manufactureDate = manufactureDate;
	}

	@Override
	public String toString() {
		StringBuilder obj = new StringBuilder();
		obj.append(getName() + " (used)");
		obj.append(" $ ");
		obj.append(String.format("%.2f", getPrice()));
		obj.append(" (Manufacture date: " + manufactureDate.format(f1) + ")");
		return obj.toString();
	}

}
