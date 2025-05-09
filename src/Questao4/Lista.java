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
        else{
            ultimo = ultimo.anterior;
        }
    }

}
