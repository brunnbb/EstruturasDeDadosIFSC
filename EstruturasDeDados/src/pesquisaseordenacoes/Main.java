package pesquisaseordenacoes;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // testarBubble1();
        System.out.println("-------------------------------------------------------");
        testarQuick1();
        System.out.println("-------------------------------------------------------");
    }

    public static void testarPesquisas() {
        Pesquisas pesquisas = new Pesquisas();
        int[] vetor = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int index;
        int chave = 5;

        System.out.println("Pesquisa linear: ");
        index = pesquisas.pesquisaLinear(vetor, chave);
        System.out.println(
                "Index da chave pesquisada: " + index + " N° de comparacoes: " + pesquisas.getNumeroDeComparacoes());
        System.out.println("Pesquisa binária: ");
        index = pesquisas.pesquisaBinaria(vetor, chave);
        System.out.println(
                "Index da chave pesquisada: " + index + " N° de comparacoes: " + pesquisas.getNumeroDeComparacoes());
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
        // int n = 9;
        int[] vetor = new int[] { 7, 2, 4, 2 };
        /*
         * vetor[0] = 12;
         * vetor[1] = 1;
         * vetor[2] = 17;
         * vetor[3] = 89;
         * vetor[4] = 51;
         * vetor[5] = -9;
         * vetor[6] = 67;
         * vetor[7] = 3;
         * vetor[8] = 8;
         */
        System.out.println("Vetor original: " + Arrays.toString(vetor));
        vetor = ordem.quickSort(vetor, 0, vetor.length - 1);
        System.out.println("Total de trocas: " + ordem.getnTrocas());
        System.out.println("Vetor ordenado: " + Arrays.toString(vetor));
    }

}