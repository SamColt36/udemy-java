package entities;

public class AtividadeTres {
	private String nome;
	private int idade;
	private double altura;

	public AtividadeTres(String nome, int idade, double altura) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
	}

	public AtividadeTres(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public double getAltura() {
		return altura;
	}
}
