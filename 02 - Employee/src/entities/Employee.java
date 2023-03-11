package entities;

public class Employee {
	
	public String name;
	public double grossSalary;
	public double tax;
	
	public double netSalary() { //	salário líquido
		return grossSalary - tax;
	}
	public void increaseSalary(double porcentage) {
		grossSalary = grossSalary * ((porcentage/100)+1);
	}
	public String toString() {
		return  name;
	}
}

