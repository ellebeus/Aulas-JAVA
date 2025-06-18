import java.util.Scanner;

public class ClasseScanner {
    public static void main(String[] args) {
        Scanner texto = new Scanner (System.in);
        String str;

        System.out.println("Digite seu nome: ");
        str = texto.nextLine();
        System.out.println("Bem vindo(a) " + str);

        System.out.println("Digite sua idade: ");
        int idade = texto.nextInt();
        System.out.println("Sua idade é: " + idade);

        texto.close();
    }
}
