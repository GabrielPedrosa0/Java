package Trabalho;
public class Disciplina {
    String codigo;
    String nome;
    int semestre;

    Disciplina(String codigo, String nome, int semestre){
        this.codigo = codigo;
        this.nome = nome;
        this.semestre = semestre;
    }

    @Override
    public String toString(){
        return "Disciplina: " + nome + " (Codigo: " + codigo + ")";
    }
}
