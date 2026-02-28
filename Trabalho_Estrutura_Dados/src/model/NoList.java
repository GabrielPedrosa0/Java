package model;

public class NoList{

    public String valor; // Armazena a palavra lida da linha do arquivo
    public NoList proximo; // Referência para o proximo nó da lista

    // construtor do nó
    public NoList(String valor){
        this.valor = valor; // Define o consteudo do nó
        this.proximo = null; // Inicialmente não aponta para ninguem
    }
}
