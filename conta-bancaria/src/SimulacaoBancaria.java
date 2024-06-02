import java.text.DecimalFormat;
import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;

        // Cria uma instância de DecimalFormat para o padrão desejado
        DecimalFormat decimalFormat = new DecimalFormat("#0.0");

        while (continuar) {
            // Lê a opção escolhida pelo usuário
            int opcao = scanner.nextInt();

            // Manipula a escolha do usuário
            switch (opcao) {
                case 1:
                    // Opção para depositar
                    double valorDeposito = scanner.nextDouble();
                    if (valorDeposito > 0) {
                        saldo += valorDeposito;
                        System.out.println("Saldo atual: " + decimalFormat.format(saldo));
                    } else {
                        System.out.println("Valor de depósito inválido.");
                    }
                    break;
                case 2:
                    // Opção para sacar
                    double valorSaque = scanner.nextDouble();
                    if (valorSaque > 0 && valorSaque <= saldo) {
                        saldo -= valorSaque;
                        System.out.println("Saldo atual: " + decimalFormat.format(saldo));
                    } else if (valorSaque > saldo) {
                        System.out.println("Saldo insuficiente.");
                    } else {
                        System.out.println("Valor de saque inválido.");
                    }
                    break;
                case 3:
                    // Opção para consultar saldo
                    System.out.println("Saldo atual: " + decimalFormat.format(saldo));
                    break;
                case 0:
                    // Opção para encerrar
                    System.out.println("Programa encerrado.");
                    continuar = false;  // Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    // Caso o usuário digite uma opção inválida
                    System.out.println("Opção inválida. Tente novamente.");
            }

            // Para evitar a repetição da exibição do menu no final da execução, caso a opção seja 0 (encerrar)
            if (!continuar) {
                break;
            }
        }
        scanner.close();
    }
}