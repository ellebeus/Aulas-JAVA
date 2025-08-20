package matrizJava;

public class Matriz {
    public static void main(String[] args) {
        int[][] matriz = new int[5][5]; // Criando uma matriz 5x5   
        
        // Inicializando a matriz com zeros
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = 0; // Preenchendo a matriz com zeros
            }
        }
        // Preenchendo a matriz
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) { matriz[i][i] = 1; // Preenchendo a diagonal principal com 1
            }
        }

        // Imprimindo a matriz
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
