package pesquisaseordenacoes;

public class Pesquisas {

    private int numeroDeComparacoes;

    public Pesquisas() {

    }

    public int pesquisaLinear(int[] vetor, int chave) {
        numeroDeComparacoes = 1;
        int fim = vetor.length - 1;
        int i = 0;

        while (i <= fim && chave != vetor[i]) {
            i++;
            numeroDeComparacoes++;
        }

        if (i > fim) {
            return -1;
        } else {
            return i;
        }
    }

    public int pesquisaBinaria(int[] vetor, int chave) {
        numeroDeComparacoes = 1;
        int fim = vetor.length - 1;
        int inicio = 0;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;
            if (vetor[meio] == chave) {
                return meio;
            } else {
                numeroDeComparacoes++;
                if (chave < vetor[meio]) {
                    fim = meio - 1;
                } else {
                    inicio = meio + 1;
                }
            }
        }

        return -1;
    }

    public int getNumeroDeComparacoes() {
        return numeroDeComparacoes;
    }
}
