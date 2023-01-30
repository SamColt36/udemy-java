package entities;

public class ContributorPhysicist extends Contributor {

	private Double spendHealth;

	public ContributorPhysicist() {
		super();
	}

	public ContributorPhysicist(String name, Double income, Double spendHealth) {
		super(name, income);
		this.spendHealth = spendHealth;
	}

	public Double getSpendHealth() {
		return spendHealth;
	}

	public void setSpendHealth(Double spendHealth) {
		this.spendHealth = spendHealth;
	}

	@Override
	public Double imcomeTax() {
		if (getIncome() < 20000.00) {
			return getIncome() * 0.15 - spendHealth * 0.5;
		} else {
			if (spendHealth > 0) {
				return getIncome() * 0.25 - spendHealth * 0.5;
			} else {
				return getIncome() * 0.25;
			}
		}
	}

}
