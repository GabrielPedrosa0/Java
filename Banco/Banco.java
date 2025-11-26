package Banco;

public abstract class Banco {
    private String tipoDaConta;
    private String nomeDoDono;
    private int saldoDaConta;
    private String numeroDaConta;
    String statusDaConta;
    

    public Banco(String tipoDaConta, String nomeDoDono, int saudoDaConta, String statusDaConta, String numeroDaConta){
        this.tipoDaConta = tipoDaConta;
        this.nomeDoDono = nomeDoDono;
        this.saldoDaConta = saudoDaConta;
        this.statusDaConta = statusDaConta;
        this.numeroDaConta = numeroDaConta;
    }

    public String getTipoDaConta(){
        return tipoDaConta;
    }

    public void setTipoDaConta(String tipoDaConta) {
        this.tipoDaConta = tipoDaConta;
    }

    public String getNomeDoDono(){
        return nomeDoDono;
    }

    public void setNomeDoDono(String nomeDoDono){
        this.nomeDoDono = nomeDoDono;
    }

    public int getSaldoDaConta(){
        return saldoDaConta;
    }

    public void setSaldoDaConta(int saudoDaConta){
        this.saldoDaConta = saudoDaConta;
    } 

    public void depositar(double valor){
        if (valor <= 0){
            System.out.println("Valor do Deposito deve ser maior que zero!");
            return;
        }

        saldoDaConta += valor;
        System.out.println(getNomeDoDono() + ", seu deposito foi realizado com sucesso! Novo saldo: " + saldoDaConta);
    }

    public void sacar(double valor){
        if(valor <= 0){
            System.out.println("O valor do Saque precisa ser maior que zero!");
            return;
        }

        if (valor > saldoDaConta) {
            System.out.println(getNomeDoDono() + ", seu saldo é insuficiente!");
            return;
        }


        saldoDaConta -= valor;
        System.out.println(getNomeDoDono() + ", seu Saque foi realizado! Novo Saldo: " + saldoDaConta);
    }

    public void apresentar(){
        System.out.println();
        System.out.println( "Nº da Conta: " + numeroDaConta + " | " + "Nome: " + getNomeDoDono() + " | Tipo da Conta: " + getTipoDaConta() + " | Saldo atual: " + saldoDaConta + " | Status: " + statusDaConta);
        System.out.println();
    }
}
