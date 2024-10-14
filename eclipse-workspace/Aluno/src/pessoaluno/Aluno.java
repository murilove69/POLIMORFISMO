package pessoaluno;

public class Aluno extends Pessoa {

	// Criando os atributos adicionais da classe, que diferenciam pessoa de aluno.
	private double nota;
	private double frequencia;

	public Aluno(String nome, String cpf, double peso, double altura, double nota, double frequencia) {
		super(nome, cpf, peso, altura);// Usando o "super" para validar os atributos utilizados na outra classe.
		this.nota = nota;
		this.frequencia = frequencia;
	}

//Deixando os atributos desta classe, agora publicos.
	public double getNota() {
		return nota;
	}

	public double getFrequencia() {
		return frequencia;
	}
}
