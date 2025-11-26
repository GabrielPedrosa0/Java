package Trabalho;
import java.util.*;

public class Turma {
    public Disciplina disciplina;
    public Professor professor;
    public ArrayList <Aluno> alunos = new ArrayList<>();



    public void adicionarAluno(Aluno aluno){
        alunos.add(aluno);
    } 

    public void removerAluno(Aluno aluno){
        alunos.remove(aluno);

    }

    public void listarAluno(){
        for(int i = 0; i < alunos.size(); i++){
            System.out.println(alunos.get(i));
        }
    }

}
