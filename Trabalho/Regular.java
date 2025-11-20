package Trabalho;
public class Regular extends Aluno {
    
    Regular(String nome, String cpf, int idade, String matricula){
        super(nome, cpf, idade, matricula);
    }

    @Override
    public void pagarMensalidade() {
        System.out.println(nome + ", pagou a mensalidade Integral!");
    }
}
