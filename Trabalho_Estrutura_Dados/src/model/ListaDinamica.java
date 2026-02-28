package model;

public class ListaDinamica {
    
    private NoList inicio; // Ponteiro para o primeiro elemento da lista 

    // Construtor da lista
    public ListaDinamica(){
        inicio = null; // lista começa vazia
    }

    // Método pra inserir palavras no final da lista
    public void inserir(String valor){
        NoList novo = new NoList(valor); // Cria um novo nó com a palavra

        if (inicio == null){ // Se a lista estiver vazia
            inicio = novo; // o novo nó se torna o primeiro
        } else {
            NoList atual = inicio; // Caso já exista elemento, percorremos até o final

            while (atual.proximo != null) { // Enquanto houver próximo nó
                atual = atual.proximo; // Avança na lista
            }

            atual.proximo = novo; // Ao chegar no último nó, conecta o novo nó
        }
    }

    public NoList getInicio() { // Retorna o inicio da lista (necessario para inserção reversa)
        return inicio;
    }
}
