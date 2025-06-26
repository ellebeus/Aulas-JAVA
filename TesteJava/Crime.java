// Programa que faça 5 perguntas para uma pessoa sobre um crime.
// As perguntas são:
// "Telefonou para a vítima?"   
// "Esteve no local do crime?"
// "Mora perto da vítima?"
// "Devia para a vítima?"
// "Já trabalhou com a vítima?"
import java.util.Scanner;
public class Crime { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;

        System.out.println("Responda as perguntas com 'Sim' e 'Não'.");

        System.out.print("Telefonou para a vítima? ");
        if (scanner.nextLine().equalsIgnoreCase("Sim")) count++;

        System.out.print("Esteve no local do crime? ");
        if (scanner.nextLine().equalsIgnoreCase("Sim")) count++;

        System.out.print("Mora perto da vítima? ");
        if (scanner.nextLine().equalsIgnoreCase("Sim")) count++;

        System.out.print("Devia para a vítima? ");
        if (scanner.nextLine().equalsIgnoreCase("Sim")) count++;

        System.out.print("Já trabalhou com a vítima? ");
        if (scanner.nextLine().equalsIgnoreCase("Sim")) count++;

        scanner.close();

        // Determina o tipo de suspeito com base nas respostas
        if (count == 2) {
            System.out.println("Suspeito.");
        } else if (count == 3 || count == 4) {
            System.out.println("Cúmplice.");
        } else if (count == 5) {
            System.out.println("Assassino.");
        } else {
            System.out.println("Inocente.");
        }
    }

}
