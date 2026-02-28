
package model;

public class NoAVL {
    
    public String valor;   // Palavra armazenada no nó
    public NoAVL esquerda; // Referencia para filho esquerdo
    public NoAVL direita;  // Referencia para filho direito
    public int altura;     // Altura do nó (usando balanceamento)
    public String hash;    // Hash calculado para esse nó

    public NoAVL(String valor) {
        this.valor = valor; // Define palavra
        this.altura = 1; // Nó folha inicia com altura 1
    }

}
