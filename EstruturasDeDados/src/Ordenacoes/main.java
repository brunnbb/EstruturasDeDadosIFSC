package Ordenacoes;

public class main {
    public static void main(String[] args) {
        int qtde = 0;
        int[] vetor = { 7, 3, 9, 1 };
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + "");
        }
        quickSort(vetor, 0, 3);
        System.out.println("");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + "");
        }

    }

    public static void quickSort(int[] vetor, int inicio, int fim) {
        int esquerda = inicio;
        int direita = fim;
        int pivo = vetor[(esquerda + direita) / 2];
        while (esquerda <= direita) {
            while (vetor[esquerda] < pivo) {
                esquerda = esquerda + 1;
            }
            while (vetor[direita] > pivo) {
                direita = direita - 1;
            }
            if (esquerda <= direita) {
                int esq = vetor[esquerda];
                int dir = vetor[direita];
                vetor[esquerda] = dir;
                vetor[direita] = esq;
                esquerda = esquerda + 1;
                direita = direita - 1;
            }
        }
        if (direita > inicio) {
            quickSort(vetor, inicio, direita);
        }
        if (esquerda < fim) {
            quickSort(vetor, esquerda, fim);
        }

    }

}
