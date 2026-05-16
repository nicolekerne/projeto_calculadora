package contabanco.contabancaria;

/**
 * Representa uma conta bancária com funcionalidades básicas como depósito,
 * saque e consulta de saldo.
 *
 * @author Nicole Kerne
 * @version 1.0
 */
public class ContaBancaria {

    private String titular;
    private double saldo;

    /**
     * Construtor da classe ContaBancaria.
     *
     * @param titular Nome do titular da conta.
     */
    public ContaBancaria(String titular) {
        this.titular = titular;
        this.saldo = 0.0;
    }

    /**
     * Retorna o nome do titular da conta.
     *
     * @return Nome do titular.
     */
    public String getTitular() {
        return titular;
    }

    /**
     * Retorna o saldo atual da conta.
     *
     * @return O saldo disponível.
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Deposita um valor na conta bancária.
     *
     * @param valor O valor a ser depositado.
     * @throws IllegalArgumentException se o valor for negativo.
     */
    public void depositar(double valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("O valor do depósito deve ser positivo.");
        }
        saldo += valor;
    }

    /**
     * Realiza um saque na conta bancária.
     *
     * @param valor O valor a ser sacado.
     * @throws IllegalArgumentException se o valor for maior que o saldo disponível.
     */
    public void sacar(double valor) {
        if (valor > saldo) {
            throw new IllegalArgumentException("Saldo insuficiente para realizar o saque.");
        }
        saldo -= valor;
    }
}
