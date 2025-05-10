package Questao9;

public class Elemento {
    public Elemento proximo,anterior;
    public int valor;

    public Elemento(int v){
        this.valor = v;
        this.proximo = null;
        this.anterior = null;
    }
}
