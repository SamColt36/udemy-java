package entities;

public class ContributorLegal extends Contributor {
	private Integer numberEmployee;

	public ContributorLegal() {
		super();
	}

	public ContributorLegal(String name, Double income, Integer numberEmployee) {
		super(name, income);
		this.numberEmployee = numberEmployee;
	}

	public Integer getNumberEmployee() {
		return numberEmployee;
	}

	public void setNumberEmployee(Integer numberEmployee) {
		this.numberEmployee = numberEmployee;
	}

	@Override
	public Double imcomeTax() {
		if (numberEmployee > 10) {
			return getIncome() * 0.14;
		} else {
			return getIncome() * 0.16;
		}
	}

}
