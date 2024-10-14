package pessoaluno;

public class Pessoa {
//Atributos privados para que não sofram alterações na classe principal, ao menos que haja um set.
	private String nome;
	private String cpf;
	private double peso;
	private double altura;

//Criando meu construtor
	public Pessoa(String nome, String cpf, double peso, double altura) {
		this.nome = nome;
		this.cpf = cpf;
		this.peso = peso;
		this.altura = altura;
	}

//Deixando publico os atributos que até então eram privados
	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public double getPeso() {
		return peso;
	}

	public double getAltura() {
		return altura;
	}
}
