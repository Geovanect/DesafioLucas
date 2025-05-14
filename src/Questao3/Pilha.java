package Questao3;

public class Pilha {
    private NoPilha topo;

    public void empilhar(int v){
        NoPilha novo = new NoPilha(v);
        novo.proximo = topo;
        topo = novo;
    }

    public int desempilhar(){
        if(estaVazia()){
            throw new RuntimeException("Pilha Vazia");
        }
        int valor= topo.valor;
        topo = topo.proximo;
        return valor;
    }

    public boolean estaVazia(){
        return topo == null;
    }

    public void imprimir(){
        NoPilha atual = topo;
        while(atual != null){
            System.out.println(atual.valor + " ");
            atual = atual.proximo;
        }
        System.out.println();
    }
}
