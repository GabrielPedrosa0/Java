package Trabalho;
public class Aluno extends Pessoa{
    String matricula;

    Aluno(String nome, String cpf, int idade, String matricula){
        super(nome, cpf, idade);
        this.matricula = matricula;
    }

    public void pagarMensalidade(){
        System.out.println(nome + ", pagou a mensalidade!");
    }

    @Override
    public String toString(){
        return nome;
    }
}
