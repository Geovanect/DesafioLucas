package Questao4;

public class Elemento {
    Elemento proximo,anterior;
    public int valor;

    public Elemento(int valor){
        this.valor = valor;
        proximo = null;
        anterior = null;
    }

}
