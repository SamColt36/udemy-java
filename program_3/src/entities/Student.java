package entities;

public class Student {
	public String name;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double nota_final() {
		return (nota1 + nota2 + nota3);
	}
	public double restante() {
		return 60 - nota_final();
	}
}
