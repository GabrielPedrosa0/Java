package Trabalho;

public class Main {
    public static void main(String[] args) {

        Aluno a1 = new Aluno("Cíntia", "12345678901", 25, "ADS2025");
        Aluno a2 = new Aluno("Samira", "97643501264", 20, "ASD205");

        Bolsista ab1 = new Bolsista("Jefferson", "97502348531", 30, "SDA225");
        Regular ar1 = new Regular("Gabriel","00135894672", 19, "ADS252");


        Professor p1 = new Professor("Andrer", "98765432101", 55, "Tecnologia");

        

        a1.apresentar();
        a1.pagarMensalidade();

        System.out.println(a2.nome);

        p1.apresentar();
        p1.darAula();

        
        a2.pagarMensalidade();

        ab1.pagarMensalidade();
        ar1.pagarMensalidade();
        
    }
}

