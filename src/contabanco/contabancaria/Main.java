package contabanco.contabancaria;

/**
 * Classe principal para executar o programa de gerenciamento de conta bancária.
 *
 * <p>Simula operações bancárias como depósito e saque.</p>
 */
public class Main {

    /**
     * Método principal para execução do programa.
     *
     * @param args Argumentos de linha de comando.
     */
    public static void main(String[] args) {

        // Cria uma nova conta bancária
        ContaBancaria conta = new ContaBancaria("João Silva");

        // Exibe o saldo inicial
        System.out.println("Titular: " + conta.getTitular());
        System.out.println("Saldo inicial: R$ " + conta.getSaldo());

        // Realiza um depósito
        conta.depositar(200.0);
        System.out.println("Saldo após depósito: R$ " + conta.getSaldo());

        // Realiza um saque
        conta.sacar(50.0);
        System.out.println("Saldo após saque: R$ " + conta.getSaldo());
    }
}