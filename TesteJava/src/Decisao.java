// Exemplo de estrutura de decisão em Java
// Este código demonstra o uso de uma estrutura condicional if-else e o operador ternário.
public class Decisao {
    public static void main(String[] args) {
        int idade = 20;

        if (idade >= 18) {
            System.out.println("Você é maior de idade.");
        } else {
            System.out.println("Você é menor de idade.");
        }

        // Exemplo de uso do operador ternário
        String resultado = (idade >= 18) ? "Maior de idade" : "Menor de idade";
        System.out.println("Resultado: " + resultado);
    }
}
