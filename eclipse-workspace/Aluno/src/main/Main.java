package main;

import pessoaluno.Aluno;
import funcoes.FuncoesUteis;

public class Main {

	public static void main(String[] args) {
		// Chamando os atributos do Aluno
		Aluno a = new Aluno("Murilo Ramos Terra Rodrigues", "123.456.789-07", 88.4, 1.5, 5.0, 70.0);

		// Verificando se o CPF é valido
		boolean cpf = FuncoesUteis.verificarCpf(a.getCpf());
		System.out.println("CPF válido: " + cpf);

		// Cálculo do IMC
		double imc = FuncoesUteis.calcularImc(a.getPeso(), a.getAltura());
		System.out.printf("Aluno: %s \n", a.getNome());
		System.out.printf("IMC: %.2f\n", imc);

		// Avaliação do aluno
		String Nota = FuncoesUteis.avaliarAluno(a.getNota(), a.getFrequencia());
		System.out.println("Resultado da avaliação: " + Nota);
	}
}
