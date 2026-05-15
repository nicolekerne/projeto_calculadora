package calculadora;

public class TesteCalculadora {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println("--- INÍCIO DOS TESTES ---");
        
        // Testes de Sucesso
        System.out.println("Teste Soma (5+5): " + calc.calcular(5, 5, "+"));
        System.out.println("Teste Subtração (10-7): " + calc.calcular(10, 7, "-"));
        System.out.println("Teste Multiplicação (3*4): " + calc.calcular(3, 4, "*"));
        System.out.println("Teste Divisão (20/5): " + calc.calcular(20, 5, "/"));

        
        try {
            calc.calcular(10, 0, "/");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro esperado (Divisão por zero): " + e.getMessage());
        }

        
        try {
            calc.calcular(10, 2, "X");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro esperado (Op. Inválida): " + e.getMessage());
        }
        
        System.out.println("--- FIM DOS TESTES ---");
    }
}