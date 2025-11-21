package Banco;

public class Main {
    public static void main(String[] args) {
        Agencia c1 = new Agencia("corrente", "Gabriel", 10000, "Ativa", "15478896");
        Agencia c2 = new Agencia("poupança", "Cintia", 50000, "Ativa", "98496846");
        Agencia c3 = new Agencia("corrente", "Jefferson", 80000, "Ativa", "98741005");

        c1.apresentar();
        c1.depositar(5500);
        c1.sacar(7811);
        
        c2.apresentar();
        c2.sacar(10000);

        c3.apresentar();
        c3.depositar(9000);

    }
}
