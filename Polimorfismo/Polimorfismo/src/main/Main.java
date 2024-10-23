package main;

import pessoas.*;

public class Main {
	public static void main(String[] args) {
		// Cria objetos do tipo Pessoa usando polimorfismo e utilizando de mensagens
		// individuais.
		// Criando objetos com mensagens individuais
		Pessoa professor = new Teacher("Daniel Ohata", "Poderia me ajudar com a tarefa?");
		Pessoa aluno = new Aluno("Murilo", "Cadê as entregas dos trabalhos?!.");

		// Enviando os e-mails
		professor.enviarEmail();
		aluno.enviarEmail();
	}
}
