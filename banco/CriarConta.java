package banco;

import java.util.concurrent.ThreadLocalRandom;

public class CriarConta {
    

    public Cliente criar (String nome, String cpf){
       String numeroConta = gerarNumero();
       boolean status = true;

       return new Cliente(nome, numeroConta, status, cpf);
    }

    private String gerarNumero(){
        int numero = ThreadLocalRandom.current().nextInt(100000, 999999);
        return String.valueOf(numero);
    }
}
