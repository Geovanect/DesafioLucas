package Questao3;

public class NoFila {
    Pilha pilha;
    NoFila proximo;

    public NoFila(Pilha pilha){
        this.pilha  = pilha;
        this.proximo = null;
    }
}
