import java.util.Scanner;

public class Contador {

    // Método principal que inicia o programa
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Cria um Scanner para ler a entrada do usuário

        // Solicita ao usuário para digitar o primeiro número
        System.out.println("Digite o primeiro número:");
        int primeiroNumero = scanner.nextInt(); // Lê o primeiro número

        // Solicita ao usuário para digitar o segundo número
        System.out.println("Digite o segundo número:");
        int segundoNumero = scanner.nextInt(); // Lê o segundo número

        try {
            // Tenta executar o método contar com os números fornecidos
            contar(primeiroNumero, segundoNumero);
        } catch (ParametrosInvalidosException e) {
            // Captura a exceção customizada e imprime a mensagem de erro
            System.out.println(e.getMessage());
        } finally {
            // Fecha o Scanner para liberar os recursos
            scanner.close();
        }
    }

    // Método que realiza a contagem e impressão dos números incrementados
    public static void contar(int primeiroNumero, int segundoNumero) throws ParametrosInvalidosException {
        // Verifica se o primeiro número é maior ou igual ao segundo número
        if ( primeiroNumero >= segundoNumero ) {
            // Lança a exceção customizada se a condição for verdadeira
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        // Calcula a diferença entre o segundo e o primeiro número
        int diferenca = segundoNumero - primeiroNumero;

        // Laço for que itera da posição 1 até a diferença calculada
        for ( int i = 1; i <= diferenca; i++ ) {
            // Imprime o número atual da iteração
            System.out.println("Imprimindo o número " + i);
        }
    }
}