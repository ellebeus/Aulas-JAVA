package collection.hashSet;

import java.util.HashSet;

import collection.equalsHash.Usuario;

public class Hash {
    public static void main(String[] args) {
        HashSet<Usuario> usuarios = new HashSet<>();
        usuarios.add(new Usuario("Nathaly"));
        usuarios.add(new Usuario("Gabriela"));

        boolean resultado = usuarios.contains(new Usuario("Nathaly"));
        System.out.println("Usuário encontrado: " + resultado);
    }
}