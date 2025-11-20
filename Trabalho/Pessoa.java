package Trabalho;
public abstract class Pessoa {
    String nome;
    String cpf;
    int idade;

    Pessoa(String nome, String cpf, int idade){
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }

    public void fezAniversario(){
        idade++;
        System.out.println(nome + " fez aniversario e esta com " + idade);
    }

    public void apresentar(){
        System.out.println(
            "Nome: " + nome +
            " | CPF: " + cpf + 
            " | Idade: " + idade
        );
    }
}
