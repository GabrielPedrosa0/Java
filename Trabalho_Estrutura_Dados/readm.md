# Sistema de Autenticação Textual Baseado em Árvore AVL e Hash Criptográfico
## 1. Introdução

Este trabalho apresenta o desenvolvimento de um sistema de autenticação textual fundamentado na integração de estruturas de dados clássicas — Lista Encadeada e Árvore AVL — com técnicas de hashing criptográfico. O objetivo principal é gerar uma assinatura digital determinística para cada linha de um arquivo de texto, garantindo integridade estrutural e sensibilidade a alterações no conteúdo.

 A solução combina conceitos de:
 
+ Estruturas de Dados Balanceadas

+ Recursividade

+ Funções Hash Criptográficas

+ Processamento de Arquivos

+ Estrutura de Pilha (LIFO)

## 2. Objetivo

Desenvolver um mecanismo capaz de:

+ Ler um arquivo texto linha por linha.

+ Processar cada linha separando suas palavras.

+ Armazenar as palavras em uma estrutura dinâmica.

+ Inserir as palavras em uma Árvore AVL.

+ Calcular um hash estrutural da árvore.

+ Exibir o hash resultante para cada linha.

O sistema deve garantir que qualquer modificação no conteúdo textual produza um hash diferente.

# 3. Fundamentação Teórica
  ## 3.1 Lista Encadeada Simples

 Estrutura linear dinâmica composta por nós interligados por ponteiros. Permite crescimento dinâmico e inserção sequencial.

Complexidade:

Inserção no final: O(n) (na versão original)

Acesso: O(n)

  ## 3.2 Árvore AVL

Árvore Binária de Busca Autobalanceada proposta por Adelson-Velsky e Landis. Mantém a propriedade:

> ∣altura(esquerda)−altura(direita)∣≤1
> ∣altura(esquerda)−altura(direita)∣≤1

Complexidade:

+ Inserção: O(log n)

+ Busca: O(log n)

O balanceamento ocorre por rotações:

+ LL (Left-Left)

+ RR (Right-Right)

+ LR (Left-Right)

+ RL (Right-Left)

## 3.3 Hash Criptográfico

O sistema original utilizava SHA-1. Embora funcional, SHA-1 é considerado criptograficamente vulnerável.

Recomendação moderna: SHA-256.

Função hash utilizada:

  > Hash(nó) = SHA − 256(Hash(esquerda) + Hash(direita) + valor)


Essa estrutura é conceitualmente equivalente a uma árvore de Merkle.

# 4. Metodologia

Para cada linha do arquivo:

Tokenização por espaço.

Inserção das palavras em lista encadeada.

Inserção reversa na árvore AVL.

Cálculo recursivo do hash estrutural.

Armazenamento da árvore em pilha.

Impressão dos hashes (ordem LIFO).

# 5. Complexidade Computacional

Se W representa o número de palavras por linha:

Construção da lista: O(W²) (na versão original)

Inserção AVL: O(W log W)

Cálculo de hash: O(W)

Complexidade total aproximada:

O(W2+Wlog⁡W)
O(W
2
+WlogW)

Após refatoração (com melhoria na lista):

O(Wlog⁡W)
O(WlogW)
# 6. Resultados e Análise

O sistema apresenta:

Determinismo estrutural

Sensibilidade à ordem de inserção

Sensibilidade a alterações no conteúdo

Balanceamento automático

Integridade estrutural garantida

Limitações identificadas:

Uso de SHA-1

Caminho de arquivo fixo

Ausência de normalização textual

Inserção ineficiente na lista

# 7. Conclusão

O projeto demonstra aplicação prática de estruturas de dados avançadas associadas a técnicas criptográficas, produzindo um sistema eficiente para autenticação estrutural de texto.

A integração entre AVL e hashing recursivo cria uma solução robusta para verificação de integridade, com forte base conceitual em árvores de Merkle.
