import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) { 

        // Criar o objeto Scanner para leitura dos dados do usuário, configurado para usar o locale dos EUA para suportar ponto decimal.
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Solicitar e ler o número da conta
        System.out.println("Digite o número da sua conta: ");
        int numeroConta = scanner.nextInt();

        // Solicitar e ler o número da agência
        System.out.print("Digite o número da Agência: ");
        String agencia = scanner.next();

        // Consumir a quebra de linha pendente após a leitura do número da agência
        scanner.nextLine();

        // Solicitar e ler o nome completo do cliente
        System.out.println("Digite o seu nome completo: ");
        String nomeCliente = scanner.nextLine();

        // Solicitar e ler o valor do depósito inicial
        System.out.println("Digite o valor que você deseja depositar na sua conta: ");
        double saldoDepositado = scanner.nextDouble();

        // Imprimir a mensagem final com os dados obtidos
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldoDepositado + " já está disponível para saque.");

        // Fechar o scanner
        scanner.close();
    }
}
