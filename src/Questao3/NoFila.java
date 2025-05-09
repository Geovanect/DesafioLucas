package Questao3;

public class NoFila {
    Pilha pilha;
    NoFila proximo;

    public NoFila(Pilha Pilha){
        this.pilha  = pilha;
        this.proximo = null;
    }
}
