package util;

import model.NoAVL;

public class HashAVL {
    
    public static String calcularHash(NoAVL no) {

        if (no == null)
            return "";
        
        String hashEsq = calcularHash(no.esquerda); // Calcula hash recursivamente da esquerda
        String hashDir = calcularHash(no.direita); // Calcula hash recursivamente da direita

        String conteudo = hashEsq + hashDir + no.valor; // Concatena filhos + valor do nó

        no.hash = SHA1Util.gerarHash(conteudo); // Gera hash SHA-1

        return no.hash;

    }
}
