package erroComp;

public class Basico {
    public static void main(String[] args) {

        /* COMO CORRIGIR ERROS DE COMPILAÇÃO:
        Aluno aluno1 = new Aluno("Gabrielle"); 
        aluno1.gerarMatricula(); 
        System.out.println(aluno1.getNome());
        System.out.println(aluno1.getMatricula());  */
        
        // EXEMPLOS DE ERROS DE COMPILAÇÃO:

        try {
            System.out.println(7/0);
        } catch (ArithmeticException e) {
            System.out.println("Erro de divisão por zero" + e.getMessage());
            // e.printStackTrace(); uma forma de imprimir o erro
        }

        Aluno aluno1 = new Aluno("Roberto");
        try {
            aluno1.gerarMatricula();
            System.out.println(aluno1.toString());
        } catch (Exception e){
            System.out.println("Erro ao tentar imprimir!");
        }
    }
}
