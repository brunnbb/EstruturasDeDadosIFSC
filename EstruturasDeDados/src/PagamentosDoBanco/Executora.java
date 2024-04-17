package PagamentosDoBanco;

import java.util.ArrayList;
import java.util.Random;

public class Executora {
    public static void main(String[] args) throws Exception {
        testarBanco();
    }

    public static void testarBanco() {
        int classes = 111;
        TabelaDePagamentos tabela = new TabelaDePagamentos(classes);

        ArrayList<Integer> lista = new ArrayList<>();
        Random gerador = new Random();
        int numero;

        for (int i = 0; i < 1000; i++) {

            numero = gerador.nextInt(5000);
            if (lista.contains(numero)) {
                do {
                    numero = gerador.nextInt(5000);
                } while (lista.contains(numero));
            }
            lista.add(numero);
            tabela.inserir(numero);
        }
        tabela.mostrar();

        int consulta = 300;
        int consultado = tabela.consultar(consulta);
        if (consultado != -1) {
            System.out.println("Pagamento n° " + consulta + " localizado.");
        } else {
            System.out.println("Não foi encontrado o pagamento n° " + consulta);
        }
    }

}
