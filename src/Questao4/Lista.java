package Questao4;

public class Lista {
    Elemento primeiro, ultimo;

    public Lista(){
        primeiro = ultimo = null;
    }

    public boolean estaVazio(){
        if(primeiro == null){
            return true;
        }
        else{
            return false;
        }
    }

    public void insere(int v){
        Elemento novo = new Elemento(v);
        if(estaVazio()){
            primeiro = novo;
            ultimo = novo;
        }
        else{
            ultimo.proximo = novo;
            novo.anterior = ultimo;
            ultimo = novo;
        }
    }

    public void remove(){
        if(estaVazio()){
            System.out.println("Não há elementos para remover");
        }

            else if(primeiro == ultimo){
                primeiro = null;
                ultimo = null;
            }else {
            ultimo = ultimo.anterior;
            ultimo.proximo = null;
        }
    }

    public void imprimeLista(Lista lista){
        if(estaVazio()){
            System.out.println("Não há elementos na lista");
        }
        Elemento atual = lista.primeiro;
        while(atual!= null){
            System.out.println(atual.valor + " ");
            atual = atual.proximo;
        }
        System.out.println();
    }

}
