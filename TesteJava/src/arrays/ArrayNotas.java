package arrays;
// Essa classe é um exemplo de como criar e manipular um array de notas em Java. 
public class ArrayNotas {
    public static void main(String[] args) {
        double[] notasAlunoA = new double[3]; // Array de notas com 3 posições
        // Inicializando o array com valores
        notasAlunoA[0] = 7.5; // Primeira nota
        // Atribuindo valores às outras posições do array
        notasAlunoA[1] = 8.0;
        notasAlunoA[2] = 6.5;

        double [] notasAlunoB = {
            9.0, // Primeira nota do aluno B
            8.5, // Segunda nota do aluno B
            7.0  // Terceira nota do aluno B
        };

        // Exibindo as notas do aluno A (usando loop for)
        /* for (int i = 0; i < notasAlunoA.length; i++) {
            // Exibindo cada nota do array
            System.out.println("Nota " + (i + 1) + " do aluno A: " + notasAlunoA[i]);
        } */

        // Exibindo as notas do aluno A (usando enhanced for loop)
        // O enhanced for loop é uma maneira mais simples de iterar sobre arrays ou coleções
        for (double nota : notasAlunoA) {
            // Exibindo cada nota do aluno A usando enhanced for loop
            System.out.println("Notas do aluno A: " + nota);
        }
        // Exibindo uma linha em branco para separar as notas dos alunos
        System.out.println();

        // Exibindo as notas do aluno B (usando loop for)
        /* for (int i = 0; i < notasAlunoB.length; i++) {
            // Exibindo cada nota do array do aluno B
            System.out.println("Nota " + (i + 1) + " do Aluno B: " + notasAlunoB[i]);
        } */

        // Exibindo as notas do aluno B (usando enhanced for loop)
        for (double nota : notasAlunoB) {
            // Exibindo cada nota do aluno B usando enhanced for loop
            System.out.println("Notas do aluno B: " + nota);
        }
    }

}
