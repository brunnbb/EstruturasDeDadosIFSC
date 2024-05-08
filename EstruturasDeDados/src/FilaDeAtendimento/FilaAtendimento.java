package filadeatendimento;

public class FilaAtendimento {

    private Nodo head;
    private Nodo tail;

    public FilaAtendimento() {
        this.head = null;
        this.tail = null;
    }

    // Insere um paciente qualquer
    public void inserir(Nodo novo) {
        if (this.head == null) {
            // Se a fila estiver vazia, o novo nodo se torna o primeiro e o �ltimo da fila
            this.head = novo;
            this.tail = novo;
        } else {
            char prioridade = novo.getPrioridade();
            // Se a prioridade for 'U', insere no in�cio da fila mantendo a ordem de chegada
            if (prioridade == 'U') {
                Nodo anterior = null;
                Nodo atual = this.head;
                // Encontra o �ltimo nodo com prioridade 'U'
                while (atual != null && atual.getPrioridade() == 'U') {
                    anterior = atual;
                    atual = atual.getProx();
                }
                // Insere o novo nodo ap�s o �ltimo nodo com prioridade 'U' encontrado
                if (anterior == null) {
                    // Caso n�o existam nodos 'U' na lista
                    novo.setProx(this.head);
                    this.head = novo;
                    if (this.tail == null) {
                        // Se a fila estava vazia, o novo nodo � tamb�m o �ltimo da fila
                        this.tail = novo;
                    }
                } else {
                    novo.setProx(atual);
                    anterior.setProx(novo);
                    if (atual == null) {
                        // Se o novo nodo for inserido no final da lista, atualiza o tail
                        this.tail = novo;
                    }
                }
            } else {
                // Se a prioridade for 'N', insere no final da fila
                this.tail.setProx(novo);
                this.tail = novo;
            }
        }
    }

    // Remove os pacientes pela ordem de prioridade First in First out (FIFO).
    public void atender() {

    }

    public void mostrar() {
        if (this.head == null) {
            System.out.println("Fila vazia!");
        } else {
            Nodo aux = this.head;
            while (aux != null) {
                System.out.print(aux.toString() + "\t");
                aux = aux.getProx();
            }
        }
    }

}
