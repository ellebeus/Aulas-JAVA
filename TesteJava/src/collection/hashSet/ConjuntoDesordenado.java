package collection.hashSet;

import java.util.HashSet;

public class ConjuntoDesordenado {
    
    @SuppressWarnings({"rawtypes", "unchecked"})
    public static void main(String[] args) {
        // Criando um conjunto desordenado
        HashSet conjunto = new HashSet<>();

        // Adicionando elementos ao conjunto
        conjunto.add("Teste");
        conjunto.add(1); // Adicionando um número inteiro
        conjunto.add(3.14); // Adicionando um número decimal
        conjunto.add(true); // Adicionando um valor booleano

        // Exibindo o tamanho do conjunto
        System.out.printf("Tamanho do conjunto: %d", conjunto.size());
    }

}
