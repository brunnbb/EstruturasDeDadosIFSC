package FilaDeAtendimento;

public class Executora {

    public static void main(String[] args) throws Exception {
        System.out.println("Filas de prioridade: ");
        System.out.println("____________________________________________");
        testar1();
        System.out.println("\n____________________________________________");
        testar2();
        System.out.println("\n____________________________________________");
        testar3();
        System.out.println("\n____________________________________________");
        testar4();
        System.out.println("\n____________________________________________");
        testar5();
        System.out.println("\n____________________________________________");
    }

    // Conjunto das funcoes para testar as 5 situacoes requisitadas pelo trabalho
    public static void testar1() {
        FilaAtendimento fila = new FilaAtendimento();
        Nodo nodo1 = new Nodo(1, 'N');
        fila.inserir(nodo1);
        Nodo nodo2 = new Nodo(2, 'N');
        fila.inserir(nodo2);
        Nodo nodo3 = new Nodo(1, 'U');
        fila.inserir(nodo3);
        Nodo nodo4 = new Nodo(2, 'U');
        fila.inserir(nodo4);
        Nodo nodo5 = new Nodo(3, 'N');
        fila.inserir(nodo5);
        Nodo nodo6 = new Nodo(4, 'N');
        fila.inserir(nodo6);
        fila.mostrar();

    }

    public static void testar2() {
        FilaAtendimento fila = new FilaAtendimento();
        Nodo nodo1 = new Nodo(1, 'U');
        fila.inserir(nodo1);
        Nodo nodo2 = new Nodo(2, 'U');
        fila.inserir(nodo2);
        Nodo nodo3 = new Nodo(3, 'U');
        fila.inserir(nodo3);
        Nodo nodo4 = new Nodo(1, 'N');
        fila.inserir(nodo4);
        Nodo nodo5 = new Nodo(2, 'N');
        fila.inserir(nodo5);
        fila.mostrar();

    }

    public static void testar3() {
        FilaAtendimento fila = new FilaAtendimento();
        Nodo nodo1 = new Nodo(1, 'N');
        fila.inserir(nodo1);
        Nodo nodo2 = new Nodo(2, 'N');
        fila.inserir(nodo2);
        Nodo nodo3 = new Nodo(3, 'N');
        fila.inserir(nodo3);
        Nodo nodo4 = new Nodo(4, 'N');
        fila.inserir(nodo4);
        Nodo nodo5 = new Nodo(1, 'U');
        fila.inserir(nodo5);
        fila.mostrar();

    }

    public static void testar4() {
        FilaAtendimento fila = new FilaAtendimento();
        Nodo nodo1 = new Nodo(1, 'U');
        fila.inserir(nodo1);
        Nodo nodo2 = new Nodo(2, 'U');
        fila.inserir(nodo2);
        Nodo nodo3 = new Nodo(3, 'U');
        fila.inserir(nodo3);
        Nodo nodo4 = new Nodo(4, 'U');
        fila.inserir(nodo4);
        Nodo nodo5 = new Nodo(5, 'U');
        fila.inserir(nodo5);
        fila.mostrar();

    }

    public static void testar5() {
        FilaAtendimento fila = new FilaAtendimento();
        Nodo nodo1 = new Nodo(1, 'N');
        fila.inserir(nodo1);
        Nodo nodo2 = new Nodo(1, 'U');
        fila.inserir(nodo2);
        Nodo nodo3 = new Nodo(2, 'U');
        fila.inserir(nodo3);
        Nodo nodo4 = new Nodo(2, 'N');
        fila.inserir(nodo4);
        Nodo nodo5 = new Nodo(3, 'U');
        fila.inserir(nodo5);
        Nodo nodo6 = new Nodo(3, 'N');
        fila.inserir(nodo6);
        fila.mostrar();

    }

    // funcao de teste generica, construida para testar no inicio
    public static void testar() {
        FilaAtendimento fila = new FilaAtendimento();
        for (int i = 1; i <= 5; i++) {
            Nodo novoNodo = new Nodo();
            novoNodo.setNumero(i);
            novoNodo.setPrioridade('N');
            fila.inserir(novoNodo);
        }
        for (int i = 1; i <= 3; i++) {
            Nodo novoNodo = new Nodo();
            novoNodo.setNumero(i);
            novoNodo.setPrioridade('U');
            fila.inserir(novoNodo);
        }
        System.out.println("\nFila: ");
        fila.mostrar();
    }
}
