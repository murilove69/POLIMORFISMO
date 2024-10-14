package main;
import utilidades.FuncoesUteis;
public class Main {
    public static void main(String[] args) {
        FuncoesUteis funcoes = new FuncoesUteis();

        // Confirmar se o método soma funciona.
        int resultadoSoma = funcoes.soma(20, 60);
        System.out.println("Soma: " + resultadoSoma);

        // Exibindo para testar se o triângulo sairá com a altura especificada.
        System.out.println("Triângulo:");
        funcoes.triangulo(4);

        // Testando o método printArquivo
        System.out.println("Conteúdo do arquivo: ");
        funcoes.printArquivo("C:\\Users\\muril\\eclipse-workspace\\Triangulo\\src\\main\\Main.java"); // Caminho do arquivo que será lido, como pedido no exercicio
    }
}
