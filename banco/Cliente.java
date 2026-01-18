package banco;

import java.util.ArrayList;

public class Cliente extends Conta{
    private String cpf;
    private ArrayList<Cliente> clientes = new ArrayList<>();
    
    public Cliente(String titular, String conta, Boolean status, String cpf){
        super(titular, conta, status);
        this.cpf = cpf;
    }
    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public void AdicionarCliente(Cliente cliente){
        clientes.add(cliente);
    }

    public void listarClientes(){
        System.out.println("Clintes: ");
        for(int i = 0; i<clientes.size(); i++){
            System.out.println(clientes.get(i));
        }
    }

    public void aprensentar(){
        System.out.println("------------------------------");
        System.out.println("Dados do Cliente");
        System.out.println("Nome: " + getTitular());
        System.out.println("CPF do titular: " + getCpf());
        System.out.println("Numero da conta: " + getNumeroConta());
        System.out.println("Status da conta: " + getStatus());
    }
}
