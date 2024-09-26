# Algoritmos de Ordenação em Java

Este projeto implementa três algoritmos de ordenação clássicos em Java, sem o uso de bibliotecas externas. O projeto apresenta um menu para que o usuário possa escolher entre os algoritmos de ordenação e visualizar como eles funcionam passo a passo.

## Descrição

Um **algoritmo de ordenação** organiza uma coleção de dados em uma ordem específica (geralmente crescente ou decrescente). Esses algoritmos são essenciais em várias aplicações de software, desde a organização de dados simples até a otimização de sistemas complexos. Neste projeto, são implementados três tipos de algoritmos de ordenação:

1. **Bubble Sort**
2. **Insertion Sort**
3. **Quick Sort**

### Bubble Sort
O **Bubble Sort** é um algoritmo simples de ordenação que repetidamente percorre a lista, compara elementos adjacentes e os troca se estiverem na ordem errada. O processo se repete até que a lista esteja ordenada.

### Insertion Sort
O **Insertion Sort** percorre a lista e insere cada elemento em sua posição correta comparando com os elementos anteriores, construindo a lista ordenada à medida que avança.

### Quick Sort
O **Quick Sort** é um algoritmo eficiente que utiliza o conceito de divisão e conquista. Ele escolhe um elemento como pivô e particiona o array em dois subarrays: um com valores menores que o pivô e outro com valores maiores. Em seguida, aplica a ordenação de forma recursiva.

## Exemplo de Uso

### Como Usar

1. **Baixe ou clone este repositório**.
2. Compile e execute o arquivo `Menu.java`:
   ```
   javac Menu.java
   java Menu
   ```

3. **Escolha o algoritmo de ordenação**:
   - Após a execução do programa, o sistema exibirá o seguinte menu:
     ```
     ====================================
     Escolha um algoritmo de ordenação:
     1. Bubble Sort
     2. Insertion Sort
     3. Quick Sort
     4. Sair
     ====================================
     ```

4. **Exemplo de escolha**:
   - Se você escolher `1`, o algoritmo **Bubble Sort** será executado e mostrará o processo de ordenação passo a passo.

   **Exemplo de execução para Bubble Sort**:
   ```
   Array original: 
   49 15 40 27 20 19 50 2 12 28 49 44 9 59 18 5 30 6 7 28 
   
   Iteração 1: 15 40 27 20 19 49 2 12 28 49 44 9 50 18 5 30 6 7 28 59 
   Iteração 2: 15 27 20 19 40 2 12 28 49 44 9 49 18 5 30 6 7 28 50 59 
   ...
   ```

5. **Após o término**:
   - O programa exibirá o array ordenado após o fim da execução do algoritmo escolhido.

### Exemplo de Execução

Abaixo está um exemplo de execução do **Menu** onde o usuário escolhe o **Bubble Sort**:

```
====================================
Escolha um algoritmo de ordenação:
1. Bubble Sort
2. Insertion Sort
3. Quick Sort
4. Sair
====================================

Digite sua escolha: 1

Bubble Sort:

Array original: 
49 15 40 27 20 19 50 2 12 28 49 44 9 59 18 5 30 6 7 28 

Iteração 1: 15 40 27 20 19 49 2 12 28 49 44 9 50 18 5 30 6 7 28 59 
Iteração 2: 15 27 20 19 40 2 12 28 49 44 9 49 18 5 30 6 7 28 50 59 
...
Array ordenado:
2 5 6 7 9 12 15 18 19 20 27 28 28 30 40 44 49 49 50 59
```

## Requisitos

- **Java JDK**: O código foi escrito em Java e requer o JDK instalado para compilação e execução.
