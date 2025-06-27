package equalsHash;

public class EqualsHash {
    public static void main(String[] args) {
        Usuario u1 = new Usuario();
        Usuario u2 = new Usuario();

        u1.setNome("Nathaly");
        u1.setEmail("nathalyxm13@gmail.com");

        u2.setNome("Gabriela");    
        u2.setEmail("g.ferreira.aleixo@gmail.com");

        System.out.println(u1 == u2); // false
        System.out.println(u1.equals(u2)); 
        System.out.println(u2.equals(u1)); 
    }
}