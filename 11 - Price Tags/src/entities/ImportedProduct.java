package entities;

public class ImportedProduct extends Product {
	private Double customsFee;

	public ImportedProduct() {
	}

	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}

	public Double totalPrice() {
		return getPrice() + customsFee;
	}

	@Override
	public String toString() {
		StringBuilder obj = new StringBuilder();
		obj.append(getName());
		obj.append(" $ ");
		obj.append(String.format("%.2f", totalPrice()));
		obj.append(" (Customs fee: $ ");
		obj.append(String.format("%.2f", customsFee) + ")");
		return obj.toString();
	}
}
