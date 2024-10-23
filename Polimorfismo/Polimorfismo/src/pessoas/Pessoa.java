package pessoas;

public abstract class Pessoa {
	protected String nome;

//Criando a classe pessoa que será "genérico" nas duas classes seguintes.
	public Pessoa(String nome) {
		this.nome = nome;
	}

	// Método abstrato para enviar e-mail através polimorfismo.
	// Para que assim, o método possa ser instanciado separadamente em cada classe.
	public abstract void enviarEmail(String mensagem);

//Criando este método para que as mensagens dos emails sejam diferentes.
	public void enviarEmail() {
	}
}
//ola mundo
