
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersPares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        // 1. Avise o usuário e armazene os números
        System.out.println("Insira uma lista de números inteiros. Digite '-1' Para encerrar.");

        int numero;
        do {
            System.out.print("Digite um número: ");
            while (!scanner.hasNextInt()) { // Validação para garantir que a entrada é um inteiro
                System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
                System.out.print("Digite um número: ");
                scanner.next(); // Descarta a entrada inválida
            }
            numero = scanner.nextInt();

            if (numero != -1) {
                numeros.add(numero);
            }
        } while (numero != -1);

        // 2. Filtrar e exibir números pares
        ArrayList<Integer> numerosPares = new ArrayList<>();
        for (int num : numeros) {
            if (isPar(num)) {
                numerosPares.add(num);
            }
        }

        if (numerosPares.isEmpty()) {
            System.out.println("Nenhum número par foi inserido.");
        } else {
            System.out.print("Os números pares são: [");
            for (int i = 0; i < numerosPares.size(); i++) {
                System.out.print(numerosPares.get(i));
                if (i < numerosPares.size() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }

        scanner.close(); // Fechar o scanner para evitar vazamento de recursos
    }

    /**
     * Método para verificar se um número é par.
     * @param num O número inteiro a ser verificado.
     * @return true se o número for par, false caso contrário.
     */
    public static boolean isPar(int num) {
        return num % 2 == 0;
    }
}

