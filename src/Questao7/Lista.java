package Questao7;
public class Lista {
    Elemento primeiro, ultimo, atual;

    public Lista(){
        primeiro = ultimo = atual = null;
    }

    public boolean estaVazio(){
        return primeiro == null;
    }

    public int comprimento(){
        atual = primeiro;
        int comprimento = 0;
        while(atual != null){
            comprimento++;
            atual = atual.proximo;
        }
        return comprimento;
    }

    public void moveParaPosicao(int pos){
        atual = primeiro;
        for(int i = 0; i < pos && atual != null; i++){
            atual = atual.proximo;
        }
    }

    public void inserirPrimeiro(int v){
        Elemento novo = new Elemento(v);
        if(estaVazio()){
            primeiro = ultimo = novo;
        } else {
            novo.proximo = primeiro;
            primeiro = novo;
        }
    }

    public void inserirUltimo(int v){
        Elemento novo = new Elemento(v);
        if(estaVazio()){
            primeiro = ultimo = novo;
        } else {
            ultimo.proximo = novo;
            ultimo = novo;
        }
    }

    public void removerPrimeiro(){
        if(estaVazio()){
            System.out.println("Lista vazia");
        } else {
            primeiro = primeiro.proximo;
            if(primeiro == null) {
                ultimo = null;
            }
        }
    }

    public void removerUltimo(){
        if(estaVazio()){
            System.out.println("Lista vazia");
            return;
        }

        if(primeiro == ultimo){ // só um elemento
            primeiro = ultimo = null;
            return;
        }

        Elemento anterior = primeiro;
        while(anterior.proximo != ultimo){
            anterior = anterior.proximo;
        }
        anterior.proximo = null;
        ultimo = anterior;
    }

    public void exibir(){
        Elemento atual = primeiro;
        System.out.print("Lista: ");
        while(atual != null){
            System.out.print(atual.valor + " ");
            atual = atual.proximo;
        }
        System.out.println();
    }
}