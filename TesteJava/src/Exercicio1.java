import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner texto = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = texto.nextInt();
        texto.close();
        // Verifica se o número é positivo ou negativo
        // Utilizando o operador ternário para simplificar a decisão
        System.out.println("O número digitado foi: " + numero);
        System.out.println("Resultado: " + ((numero >= 0) ? "Positivo" : "Negativo"));
        
    }
}
