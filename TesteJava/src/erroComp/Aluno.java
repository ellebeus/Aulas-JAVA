package erroComp;


import java.util.Random;

public class Aluno {
    private String nome;
    private String matricula;
    private static final int CONT_MAT = 10000;

    public Aluno(String nome) {
        this.nome = nome;
    }

    public void gerarMatricula() {
        Random random = new Random();
        this.matricula = "Matricula: " + random.nextInt(CONT_MAT);
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Aluno [nome=" + nome + ", matricula=" + matricula + "]";
    }

    

}
