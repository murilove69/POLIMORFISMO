package pessoas;

public class Aluno extends Pessoa {
	private String mensagem; // Mensagem individual
	// Criando o atributo aluno nesta classe, usando o Polimorfismo, neste caso, com
	// a mesma variável" nome

	public Aluno(String nome, String mensagem) {
		super(nome);
		this.mensagem = mensagem;
	}

	// Usando o @Override para o mesmo definir individualmente a usabilidade desta
	// classe em específico
	@Override
	public void enviarEmail() {
		String email = "Olá caro " + nome + ",\n";
		System.out.println(email + mensagem);
	}

//Instanciando nesta classe o atributo mensagem.
	@Override
	public void enviarEmail(String mensagem) {

	}
}
