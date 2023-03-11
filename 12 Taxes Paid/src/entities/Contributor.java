package entities;

public abstract class Contributor {
	private String name;
	private Double income;

	public Contributor() {
	}

	public Contributor(String name, Double income) {
		this.name = name;
		this.income = income;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getIncome() {
		return income;
	}

	public void setIncome(Double income) {
		this.income = income;
	}

	public abstract Double imcomeTax();
	
	@Override
	public String toString() {
		return getName() + ": $ " + String.format("%.2f", imcomeTax());
	}
}
