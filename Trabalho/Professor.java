package Trabalho;
public class Professor extends Pessoa{
    String centro;

    Professor(String nome, String cpf, int idade, String centro){
        super(nome, cpf, idade);
        this.centro = centro;
    }

    public void darAula(){
        System.out.println(nome + " diz: sei lá, senta e faz a prova!");
    }

    @Override
    public String toString(){
        return "Professor: " + nome + " (centro: " + centro + ")";
    }
}
