package Trabalho;
public class Bolsista extends Aluno {

    Bolsista(String nome, String cpf, int idade, String matricula){
        super(nome, cpf, idade, matricula);
    }


    @Override
    public void pagarMensalidade() {
        System.out.println(nome + " pagou com desconto de 50%");
    }
}
