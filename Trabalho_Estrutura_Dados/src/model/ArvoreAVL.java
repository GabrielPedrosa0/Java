package model;

public class ArvoreAVL {
    private NoAVL raiz; // Raix da arvore

    public void inserir(String valor) { // Metodo publico de inserção
        raiz = inserirRec(raiz, valor); // Chama método recursivo
    }

    // Método recursivo de inseção
    private NoAVL inserirRec(NoAVL no, String valor) {
        if (no == null) { // caso base: posição vazia encontrada
            return new NoAVL(valor);
        }

        int comparacao = valor.compareToIgnoreCase(no.valor); // Comparação lexicográfica ignorando maiúsculas/minúsculas

        if (comparacao < 0) {
            no.esquerda = inserirRec(no.esquerda, valor); // Inserir na subárvore esquerda
        } else if (comparacao > 0) { 
            no.direita = inserirRec(no.direita, valor); // Inserir na subárvore direirta
        } else {
            return no; // se for igual (duplicado), não insere
        }

        atualizarAltura(no); // atualiza altura após inserção

        int balanceamento = getBalanceamento(no); // Calcula fator de balanceamento

        // Caso 1: Desbalanceamento esqueda-esquerda
        if (balanceamento > 1 && valor.compareToIgnoreCase(no.esquerda.valor) < 0)
            return rotacaoDireita(no);
        
        // Caso 2: direita-direita
        if (balanceamento < -1 && valor.compareToIgnoreCase(no.direita.valor) > 0)
            return rotacaoEsquerda(no);

        // Caso 3: esquerda-direita
        if (balanceamento > 1 && valor.compareToIgnoreCase(no.esquerda.valor) > 0) {
            no.esquerda = rotacaoEsquerda(no.esquerda);
            return rotacaoDireita(no);
        }

        // Caso 4: direita-esquerda
        if (balanceamento  < -1 && valor.compareToIgnoreCase(no.direita.valor) < 0) {
            no.direita = rotacaoDireita(no.direita);
            return rotacaoEsquerda(no);
        }

        return no;
    }

    private void atualizarAltura(NoAVL no) { // Atualiza altura do nó
        no.altura = 1 + Math.max(altura(no.esquerda), altura(no.direita));
    }

    private int altura(NoAVL no) { // Retorna altura de um nó
        return (no == null) ? 0 : no.altura;
    }
    
    private int getBalanceamento(NoAVL no) { // calcura o fator balanceamento
        return (no == null) ? 0 : altura(no.esquerda) - altura(no.direita);
    }

    // Rotação simples à direita
    private NoAVL rotacaoDireita(NoAVL y){
        NoAVL x = y.esquerda;
        NoAVL T2 = x.direita;

        x.direita = y;
        y.esquerda = T2;

        atualizarAltura(y);
        atualizarAltura(x);

        return x;
    }

    // Rotação simples à esquerda
    private NoAVL rotacaoEsquerda(NoAVL x) {
        NoAVL y = x.direita;
        NoAVL T2 = y.esquerda;

        y.esquerda = x;
        x.direita = T2;

        atualizarAltura(x);
        atualizarAltura(y);

        return y;
    }

    public NoAVL getRaiz() {
        return raiz;
    }
}