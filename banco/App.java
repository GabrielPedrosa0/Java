package banco;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CriarConta criarContaService = new CriarConta();
        Cliente cliente = null;

        System.out.println("Olá, bem-vindo!");
        System.out.println("1 - Criar uma conta");
        System.out.println("2 - Buscar conta");
        System.out.print("Escolha uma opção: ");

        int opcao = sc.nextInt();
        sc.nextLine();

        switch (opcao) {
            case 1:
                System.out.println("Digite o nome: ");
                String nome = sc.nextLine();

                System.out.println("Digite o CPF: ");
                String cpf = sc.nextLine();

                cliente = criarContaService.criar(nome, cpf);
                System.out.println("\nConta criada com sucesso");
                cliente.aprensentar();
                break;
        
            case 2:
                System.out.println("Funcionalidade não implementada");
            default:
                break;
        }

        sc.close();
    }
}
