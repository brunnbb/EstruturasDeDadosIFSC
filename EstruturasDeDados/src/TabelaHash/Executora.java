package TabelaHash;

import java.util.Random;

public class Executora {

    public static void main(String[] args) throws Exception {
        testarAleatorio();
    }

    public static void testar() {
        int m = 105;
        TabelaHash tabela = new TabelaHash(m);
        for (int i = 0; i < 1000; i++) {
            tabela.inserir(i);
        }
        tabela.mostrar();
    }

    public static void testarAleatorio() {
        int m = 401;
        TabelaHash tabela = new TabelaHash(m);

        Random gerador = new Random();
        for (int i = 0; i < 10000; i++) {
            int numero = gerador.nextInt(1000);
            tabela.inserir(numero);
        }
        tabela.mostrar();
    }

}