package Questao7;

public class Lista {
    Elemento primeiro, ultimo, atual;


    public Lista(){
        primeiro = ultimo = atual =null;
    }

    public boolean estaVazio(){
        if(primeiro ==  null){
            return true;
        }
        return false;
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
        for(int i =0; i<pos ; i++){
            atual = atual.proximo;
        }
    }

    public void inserirPrimeiro(int v){
        Elemento novo = new Elemento(v);
        if(estaVazio()){
            primeiro = novo;
            ultimo = novo;
        }
            novo.proximo = primeiro;
            primeiro = novo;
    }

    public void inserirUltimo(int v){
        Elemento novo = new Elemento(v);
        if(estaVazio()){
            primeiro = novo;
            ultimo = novo;
        }
        ultimo.proximo = novo;
        ultimo = novo;
    }

    public void removerPrimeiro(){
        if(estaVazio()){
            System.out.println("Lista vazia");
        }
        primeiro = primeiro.proximo;

    }

    public void removerUltimo(){
        int pos = comprimento() -1;
        moveParaPosicao(pos);
        atual.proximo = null;
        atual = ultimo;

    }
}
