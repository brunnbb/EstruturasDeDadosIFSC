package Ordenacoes;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        testarBubble1();
        System.out.println("-------------------------------------------------------");
        testarQuick1();
        System.out.println("-------------------------------------------------------");
    }

    public static void testarBubble1() {
        Ordenacao ordem = new Ordenacao();
        System.out.println("-------------------------------------------------------");
        System.out.println("Teste Bubble Sort");
        int n = 9;
        int[] vetor = new int[n];
        vetor[0] = 12;
        vetor[1] = 1;
        vetor[2] = 17;
        vetor[3] = 89;
        vetor[4] = 51;
        vetor[5] = -9;
        vetor[6] = 67;
        vetor[7] = 3;
        vetor[8] = 8;
        System.out.println("Vetor original: " + Arrays.toString(vetor));
        vetor = ordem.bubbleSort(vetor, 0, n - 1);
        System.out.println("Total de trocas: " + ordem.getnTrocas());
        System.out.println("Vetor ordenado: " + Arrays.toString(vetor));

    }

    public static void testarQuick1() {
        Ordenacao ordem = new Ordenacao();
        System.out.println("-------------------------------------------------------");
        System.out.println("Teste Quick Sort");
        int n = 9;
        int[] vetor = new int[n];
        vetor[0] = 12;
        vetor[1] = 1;
        vetor[2] = 17;
        vetor[3] = 89;
        vetor[4] = 51;
        vetor[5] = -9;
        vetor[6] = 67;
        vetor[7] = 3;
        vetor[8] = 8;
        System.out.println("Vetor original: " + Arrays.toString(vetor));
        vetor = ordem.quickSort(vetor, 0, n - 1);
        System.out.println("Total de trocas: " + ordem.getnTrocas());
        System.out.println("Vetor ordenado: " + Arrays.toString(vetor));
    }
}