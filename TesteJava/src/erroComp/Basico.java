package erroComp;

public class Basico {
    public static void main(String[] args) {
       // System.out.println(7/0);

        Aluno aluno1 = new Aluno("Gabrielle"); 
        aluno1.gerarMatricula();

        System.out.println(aluno1.getNome());
        System.out.println(aluno1.getMatricula());
    }
}
