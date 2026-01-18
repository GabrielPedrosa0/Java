package banco;

public abstract class Conta {
    private String titular;
    private String numeroConta;
    private Boolean status;

    public Conta(String titular, String numeroConta, Boolean status){
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.status = status;
    }

    public String getTitular(){
        return titular;
    }

    public void setTitular(String titular){
        this.titular = titular;
    }

    public String getNumeroConta(){
        return numeroConta;
    }

    public void setNumeroConta(String conta){
        this.numeroConta = conta;
    }

    public Boolean getStatus(){
        return status;
    }

    public void setStatus(Boolean status){
        this.status = status;
    }

}
