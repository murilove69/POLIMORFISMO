package pessoas;

public class Teacher extends Pessoa {
	private String mensagem; // Mensagem individual a ser enviada para o prof
	// Criando os métodos nome em ambas as classes, para que elas sejam o
	// diferencial nas classes, para serem inseridos nos emails.

	public Teacher(String nome, String mensagem) {
		super(nome);
		this.mensagem = mensagem;
	}
	// Novamente usando o @Override para instanciar individualmente os métodos
	// abstracts.

	@Override
	public void enviarEmail() {
		String email = "Olá excelentíssimo prof. " + nome + "\n";
		System.out.println(email + mensagem);
	}

	// Este @Override está aqui para instanciar o método email
	@Override
	public void enviarEmail(String email) {

	}
}
