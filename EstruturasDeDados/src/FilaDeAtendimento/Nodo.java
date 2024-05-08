package filadeatendimento;

public class Nodo {

    private int numero;
    private char prioridade;
    private Nodo prox;

    public Nodo() {

        this.prox = null;
    }

    public Nodo(int numero, char prioridade) {
        this.numero = numero;
        this.prioridade = prioridade;
        this.prox = null;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public char getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(char prioridade) {
        this.prioridade = prioridade;
    }

    public Nodo getProx() {
        return prox;
    }

    public void setProx(Nodo prox) {
        this.prox = prox;
    }

    @Override
    public String toString() {
        return numero + "-" + prioridade;
    }

}
