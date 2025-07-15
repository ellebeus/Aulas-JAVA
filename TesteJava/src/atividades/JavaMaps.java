package atividades;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class JavaMaps {

    public static void main(String[] args) {
        Map<String, String> contatos = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        contatos.put("Alice", "123-4567");
        contatos.put("Bob", "987-6543");
        contatos.put("Charlie", "555-1234");
        contatos.put("Diana", "111-2222");

        System.out.println("--- Informações Iniciais da Agenda ---");
        System.out.println("Número de contatos: " + contatos.size()); // Equivalent to usuario.size()
        System.out.println("Todos os números: " + contatos.values()); // Equivalent to usuario.values()
        System.out.println("Entradas completas: " + contatos.entrySet()); // Equivalent to usuario.entrySet()

        System.out.println("Contém 'Diana'? " + contatos.containsKey("Diana")); // Equivalent to containsKey(4)
        System.out.println("Contém o número '123-4567'? " + contatos.containsValue("123-4567")); // Equivalent to containsValue("Alice")
        System.out.println("Número do Bob: " + contatos.get("Bob")); // Equivalent to get(2)
        System.out.println();

        System.out.println("--- Lista de Contatos Atual (via entrySet) ---");
        for (Entry<String, String> contato : contatos.entrySet()) { // Iterating through entries
            System.out.println("Nome: " + contato.getKey() + ", Telefone: " + contato.getValue());
        }
        System.out.println();

        // --- Menu de Opções da Agenda Telefônica ---
        do {
            displayMenu();
            choice = getUserChoice(scanner);

            switch (choice) {
                case 1:
                    addContact(contatos, scanner);
                    break;
                case 2:
                    removeContact(contatos, scanner);
                    break;
                case 3:
                    searchContact(contatos, scanner);
                    break;
                case 4:
                    displayAllContacts(contatos);
                    break;
                case 5:
                    System.out.println("Saindo da Agenda Telefônica. Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, tente novamente.");
            }
            System.out.println(); // Add a blank line for better readability
        } while (choice != 5);

        scanner.close();
    }

    /**
     * Displays the menu options to the user.
     */
    private static void displayMenu() {
        System.out.println("--- Menu da Agenda Telefônica ---");
        System.out.println("1. Adicionar Contato");
        System.out.println("2. Remover Contato");
        System.out.println("3. Buscar Contato");
        System.out.println("4. Exibir Todos os Contatos");
        System.out.println("5. Sair");
        System.out.print("Digite sua opção: ");
    }

    /**
     * Gets and validates the user's menu choice.
     * @param scanner The Scanner object for user input.
     * @return The user's valid choice, or -1 if input is invalid.
     */
    private static int getUserChoice(Scanner scanner) {
        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Por favor, digite um número.");
            scanner.next(); // Consume the invalid input
            return -1;
        } finally {
            scanner.nextLine(); // Consume the newline character after reading the integer
        }
    }

    /**
     * Adds a new contact to the phone book.
     * @param contatos The HashMap representing the phone book.
     * @param scanner The Scanner object for user input.
     */
    private static void addContact(Map<String, String> contatos, Scanner scanner) {
        System.out.print("Digite o nome do contato: ");
        String name = scanner.nextLine();
        System.out.print("Digite o número de telefone: ");
        String phoneNumber = scanner.nextLine();

        if (name.isEmpty() || phoneNumber.isEmpty()) {
            System.out.println("Nome e número de telefone não podem ser vazios. Contato não adicionado.");
            return;
        }

        if (contatos.containsKey(name)) {
            System.out.println("O contato '" + name + "' já existe. Atualizando o número de telefone.");
        }
        contatos.put(name, phoneNumber);
        System.out.println("Contato '" + name + "' adicionado/atualizado com sucesso!");
    }

    /**
     * Removes a contact from the phone book.
     * @param contatos The HashMap representing the phone book.
     * @param scanner The Scanner object for user input.
     */
    private static void removeContact(Map<String, String> contatos, Scanner scanner) {
        System.out.print("Digite o nome do contato para remover: ");
        String name = scanner.nextLine();

        if (contatos.containsKey(name)) {
            contatos.remove(name);
            System.out.println("Contato '" + name + "' removido com sucesso!");
        } else {
            System.out.println("Contato '" + name + "' não encontrado na agenda.");
        }
    }

    /**
     * Searches for a contact in the phone book and displays its number.
     * @param contatos The HashMap representing the phone book.
     * @param scanner The Scanner object for user input.
     */
    private static void searchContact(Map<String, String> contatos, Scanner scanner) {
        System.out.print("Digite o nome do contato para buscar: ");
        String name = scanner.nextLine();

        if (contatos.containsKey(name)) {
            String phoneNumber = contatos.get(name);
            System.out.println("Número de telefone para '" + name + "': " + phoneNumber);
        } else {
            System.out.println("Contato '" + name + "' não encontrado na agenda.");
        }
    }

    /**
     * Displays all contacts currently in the phone book.
     * @param contatos The HashMap representing the phone book.
     */
    private static void displayAllContacts(Map<String, String> contatos) {
        if (contatos.isEmpty()) {
            System.out.println("A agenda está vazia.");
        } else {
            System.out.println("--- Todos os Contatos ---");
            for (Entry<String, String> contato : contatos.entrySet()) {
                System.out.println("Nome: " + contato.getKey() + ", Telefone: " + contato.getValue());
            }
        }
    }
}