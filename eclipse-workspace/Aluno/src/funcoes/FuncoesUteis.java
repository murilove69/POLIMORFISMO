package funcoes;

import java.util.regex.Pattern;

public class FuncoesUteis {
	// Vale ressaltar ao professor que esta foi a unica forma que achei de conseguir
	// "validar" a formatalção do cpf, sem deixa-lo apenas largado, usei todos meus
	// recursos e espero que entenda.

	// Verificar formato do CPF.
	public static boolean verificarCpf(String cpf) {
		String regex = "\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}|\\d{11}";
		return Pattern.matches(regex, cpf);
	}

	// Calculando o (IMC)
	public static double calcularImc(double peso, double altura) {
		if (altura > 0) {
			return peso / (altura * altura);
		}
		return 0;
	}

	// Usando os parametros presença e nota, para determinar se o aluno passou de
	// ano.
	public static String avaliarAluno(double nota, double presenca) {
		if (nota >= 5 && presenca >= 75) {
			return "Aprovado, meus parabéns!!!";
		}
		return "Reprovado!! Ano que vem estaremos juntos novamente hahahahaha!!";
	}
}
