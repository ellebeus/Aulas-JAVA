package arrays;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        double[][] notaTurma = new double[3][3]; // Matriz para armazenar 3 notas de 3 alunos
        // Inicializando a matriz com valores
        int totalTurma = 0; // Variável para armazenar o total de alunos

        for (int i = 0; i < notaTurma.length; i++) {
            for (int j = 0; j < notaTurma[i].length; j++) {
                System.out.println("Digite a nota  " + (i + 1) + " do aluno " + (j + 1) + ": ");
                notaTurma[i][j] = ent.nextDouble(); 
            }
        }

        for (double[] aluno : notaTurma) {
            for (double nota : aluno) {
                System.out.println("Nota do aluno: " + nota);
            }
        }

        double media = totalTurma / (3*3); // Cálculo da média
        System.out.println("A média da turma é: " + media);
        /* System.out.printf("A média da turma é: %.1f", media); */
        
        // Fechando o scanner3
        
        ent.close();
    }
}
