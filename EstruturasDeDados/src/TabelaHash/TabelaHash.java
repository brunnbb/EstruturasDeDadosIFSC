package TabelaHash;

import java.util.*;

public class TabelaHash {
    private int m;
    private LinkedList<Integer> tabela[];

    @SuppressWarnings("unchecked")
    public TabelaHash(int m) {
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

    public void mostrar() {
        for (int i = 0; i < this.m; i++) {
            System.out.println("Tabela[" + i + "]=" + this.tabela[i].toString());
        }
    }

}