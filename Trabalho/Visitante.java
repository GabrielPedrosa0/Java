package Trabalho;
public class Visitante extends Pessoa {
    
    Visitante(String nome, String cpf, int idade){
        super(nome, cpf, idade);
    }

    @Override
    public void apresentar() {
        System.out.println(nome + ", está visitando a Universidade!");
        System.out.println("Seja Bem Vindo!" + nome);
    }
}
