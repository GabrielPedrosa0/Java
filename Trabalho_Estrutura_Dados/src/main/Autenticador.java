package main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Stack;
import model.ArvoreAVL;
import model.ListaDinamica;
import model.NoList;
import util.HashAVL;

public class Autenticador {
    
    public static void main(String[] args) throws Exception {
        
        Stack<ArvoreAVL> pilha = new Stack<>(); // Cra pilha para armazenar árvores

        try (BufferedReader br = new BufferedReader(new FileReader("/home/gabriel/Documentos/Programação/Java/texto.txt"))) { // abre arquivo de texto

            String linha;

            // Enquanto houver linha no arquivo
            while ((linha = br.readLine()) != null) {
                ListaDinamica lista = new ListaDinamica(); // Cria lista dinamica

                String[] palavras = linha.split(" "); // Divide linhas por espaços

                // Insere cada palavra na lista
                for (String palavra : palavras) {
                    lista.inserir(palavra);
                }

                ArvoreAVL arvore = new ArvoreAVL(); // Cria arvore AVL

                inserirReverso(lista.getInicio(), arvore); // Insere palavras na árvore em ordem reversa

                pilha.push(arvore);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        while (!pilha.isEmpty()) {
            ArvoreAVL arvore = pilha.pop();

            String hashFinal = HashAVL.calcularHash(arvore.getRaiz());
            System.out.println(hashFinal);
        }
    }

    private static void inserirReverso(NoList no, ArvoreAVL arvore) {

        if (no == null)
            return;
        inserirReverso(no.proximo, arvore);

        arvore.inserir(no.valor);
    }
}
