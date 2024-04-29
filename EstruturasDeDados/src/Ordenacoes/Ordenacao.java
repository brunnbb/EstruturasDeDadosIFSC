package Ordenacoes;

public class Ordenacao {

    private long nTrocas;

    public Ordenacao() {
        this.nTrocas = 0;
    }

    public int[] bubbleSort(int[] vetor, int inicio, int fim) {
        int n = fim - 1;
        boolean houverTroca = true;
        while (houverTroca) {
            houverTroca = false;
            for (int i = 0; i < n; i++) {
                if (vetor[i] > vetor[i + 1]) {
                    int aux = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = aux;
                    houverTroca = true;
                    this.nTrocas++;
                }
            }
        }
        return vetor;

    }

    public int[] quickSort(int[] vetor, int inicio, int fim) {
        int esquerda = inicio;
        int direita = fim;

        int meio = (esquerda + direita) / 2;
        int pivo = vetor[meio];

        while (esquerda <= direita) {
            while (vetor[esquerda] < pivo) {
                esquerda++;
            }
            while (vetor[direita] > pivo) {
                direita--;
            }
            if (esquerda <= direita) { // realiza a troca
                this.nTrocas++;
                int aux = vetor[esquerda];
                vetor[esquerda] = vetor[direita];
                vetor[direita] = aux;
                esquerda++;
                direita--;
            }
        }

        if (direita > inicio) {
            quickSort(vetor, inicio, direita);
        }
        if (esquerda < fim) {
            quickSort(vetor, esquerda, fim);
        }

        return vetor;
    }

    public long getnTrocas() {
        return nTrocas;
    }

    public void setnTrocas(long nTrocas) {
        this.nTrocas = nTrocas;
    }
}
