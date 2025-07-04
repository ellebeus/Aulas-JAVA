package atividades;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner texto = new Scanner(System.in);
        System.out.println("Digite a letra inicial do seu sexo: ");
        String sexo = texto.nextLine();
        texto.close();

        // Verifica o sexo informado e exibe a mensagem correspondente
        if (sexo.equalsIgnoreCase("M")) {
            System.out.println("Você é do sexo masculino.");
        } else if (sexo.equalsIgnoreCase("F")) {
            System.out.println("Você é do sexo feminino.");
        } else {
            System.out.println("Sexo inválido. Por favor, informe 'M' para masculino ou 'F' para feminino.");
        }
    }
}
