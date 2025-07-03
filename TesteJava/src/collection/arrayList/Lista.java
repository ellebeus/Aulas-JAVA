package collection.arrayList;

import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {
        ArrayList<Cliente> lista = new ArrayList<>();

        /* Forma 1 de como criar uma lista: 
        Cliente c1 = new Cliente("João"); */

        /*  Forma 2 de como criar uma lista: 
        lista.add(c1) */

        // Forma 3 de como criar uma lista: 
        lista.add(new Cliente("Maria")); // Cliente 0
        lista.add(new Cliente("José")); // Cliente 1
        lista.add(new Cliente("João")); // Cliente 2
        lista.add(new Cliente("Ana")); // Cliente 3 
        lista.add(new Cliente("Pedro")); // Cliente 4

        // System.out.printf("Tamanho da lista 3: %d\n", lista.size());

        // Exibindo os elementos da lista
        for (Cliente cliente : lista) {
            System.out.println(cliente.getNome());
        }

        System.out.println("................................");
        System.out.println("Nome do cliente: " + lista.get(0).getNome());

        
    }
}
