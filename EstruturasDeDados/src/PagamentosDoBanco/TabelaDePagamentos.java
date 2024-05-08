package pagamentosdobanco;

import java.util.LinkedList;

public class TabelaDePagamentos {
    private int m;
    private LinkedList<Integer> tabela[];

    @SuppressWarnings("unchecked")
    public TabelaDePagamentos(int m) {
        this.m = m;
        this.tabela = new LinkedList[this.m];
        for (int i = 0; i < this.m; i++) {
            this.tabela[i] = new LinkedList<>();
        }
    }

    public int calcularRestoDaDivisaoInteira(int valor) {
        return valor % this.m;
    }

    public void inserir(int valor) {
        int classe = calcularRestoDaDivisaoInteira(valor);
        this.tabela[classe].add(valor);
    }

    public int consultar(int valor) {
        int classe = calcularRestoDaDivisaoInteira(valor);

        if (tabela[classe].contains(valor)) {
            return valor;
        } else {
            return -1;
        }
    }

    public void remover(int valor) {
        int classe = calcularRestoDaDivisaoInteira(valor);
        Integer valoInteger = Integer.valueOf(valor);

        if (tabela[classe].contains(valoInteger)) {
            tabela[classe].remove(valoInteger);
            System.out.println("Pagamento n° " + valor + " removido.");
        } else {
            System.out.println("Pagamento n° " + valor + " não existe.");
        }
    }

    public void mostrar() {
        for (int i = 0; i < this.m; i++) {
            System.out.println("Tabela[" + i + "]" + " (" + tabela[i].size() + ") " + this.tabela[i].toString());
        }
    }

}