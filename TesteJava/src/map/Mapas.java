package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapas {
    public static void main(String[] args) {
        Map<Integer, String> usuario = new HashMap<>();

        usuario.put(1, "Alice");
        usuario.put(2, "Bob");
        usuario.put(3, "Charlie");
        usuario.put(4, "Diana");

        System.out.println(usuario.size());
        System.out.println(usuario.values());
        System.out.println(usuario.entrySet());

        System.out.println(usuario.containsKey(4));
        System.out.println(usuario.containsValue("Alice"));
        System.out.println(usuario.get(2));

        for (Entry<Integer, String> registro: usuario.entrySet()) {
            System.out.println("Chave: " + registro.getKey() + ", Nome: " + registro.getValue());
            
        }
    }

}
