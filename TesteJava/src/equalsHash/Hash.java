package equalsHash;

import java.util.HashSet;

public class Hash {
    public static void main(String[] args) {
        HashSet<Usuario> usuarios = new HashSet<>();
        usuarios.add(new Usuario("Nathaly"));
        usuarios.add(new Usuario("Gabriela"));

        boolean resultado = usuarios.contains(new Usuario("Nathaly"));
        System.out.println("Usuário encontrado: " + resultado);
    }
}