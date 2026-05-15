package calculadora;

/**
 * <strong>Projeto Calculadora - FinançApp</strong>
 * <p>Classe responsável por operações matemáticas básicas e validação de dados.</p>
 * @author Nicole Kerne
 * @version 1.0
 */
public class Calculadora {

    /**
     * Soma dois números inteiros.
     * @param a Primeiro operando
     * @param b Segundo operando
     * @return Resultado da soma
     */
    public int somar(int a, int b) {
        return a + b;
    }

    /**
     * Subtrai dois números inteiros.
     */
    public int subtrair(int a, int b) {
        return a - b;
    }

    /**
     * Multiplica dois números inteiros.
     */
    public int multiplicar(int a, int b) {
        return a * b;
    }

    /**
     * Divide a por b.
     * @throws IllegalArgumentException caso o divisor seja zero.
     */
    public int dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisão por zero não permitida.");
        }
        return a / b;
    }

    /**
     * Método principal que direciona a operação baseada no símbolo.
     * @param a Primeiro operando
     * @param b Segundo operando
     * @param op Operador (+, -, *, /)
     * @return Resultado da operação
     */
    public int calcular(int a, int b, String op) {
        return switch (op) {
            case "+" -> somar(a, b);
            case "-" -> subtrair(a, b);
            case "*" -> multiplicar(a, b);
            case "/" -> dividir(a, b);
            default -> throw new IllegalArgumentException("Operação inválida: " + op);
        };
    }
}