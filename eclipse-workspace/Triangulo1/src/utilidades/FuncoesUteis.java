package utilidades;
//Utilizando estas bibliotecas juntas para fazer a leitura de textos (ou fluxos de entrada)
import java.io.BufferedReader;
import java.io.FileReader;
// Classe que representa uma exceção que pode ocorrer durante operações de entrada e saída de dados.
import java.io.IOException;
public class FuncoesUteis {
// Método para somar os dois números.
    public int soma(int a, int b) {
        return a + b;
    }
// Método para imprimir o triângulo de altura "x".
    public void triangulo(int altura) {
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <=i; i++) {
                System.out.print("x");
            }
            System.out.println();
        }
    }

// Método para ler um arquivo e mostrar tudo aquilo que se encontra neste.
    public void printArquivo(String caminhoArquivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}
