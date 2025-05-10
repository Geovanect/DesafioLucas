package Questao8;

public class Lista {
    Elemento primeiro, atual, ultimo;

    public Lista(){
        primeiro = atual = ultimo = null;
    }

    public boolean estaVazio(){
        if(primeiro == null){
            return true;
        }
        return false;
    }

    public int tamanho(){
       int tamanho = 0;
        while(atual != null){
            tamanho++;
            atual = atual.proximo;
        }
        return tamanho;
    }

    public void inserePrimeiro(int v){
        Elemento novo = new Elemento(v);
        if(estaVazio()){
            primeiro = novo;
            ultimo = novo;
        }
        novo.proximo = primeiro;
        primeiro = novo;
    }
    public void moveParaPosicao(int p){
        for(int i = 0; i<p; i++){
            atual = atual.proximo;
        }
    }

    public void insereUltimo(int v){
        Elemento novo = new Elemento(v);
        if(estaVazio()){
            primeiro = novo;
            ultimo = novo;
        }
        int pos = tamanho() -1;
        moveParaPosicao(pos);
        atual.proximo = null;
        atual = ultimo;

    }

    public Lista uniao(Lista l1, Lista l2){
        Lista lista3 = new Lista();
       Elemento atuall1 = l1.primeiro;
        while(atuall1 != null){
            lista3.insereUltimo(atuall1.valor);
            atuall1 = atuall1.proximo;
        }
        Elemento atuall2 = l2.primeiro;

        while(atuall2 != null){
            if(!lista3.contemValor(atuall2.valor)) {
                lista3.insereUltimo(atuall2.valor);
            }
            atuall2 = atuall2.proximo;
        }
         return lista3;
    }


    public boolean contemValor(int valor) {
        Elemento atual = primeiro;
        while (atual != null) {
            if (atual.valor == valor) {
                return true;
            }
            atual = atual.proximo;
        }
        return false;
    }



    public Lista insersecao(Lista l1, Lista l2){
        Lista lista4 = new Lista();
        Elemento atual1;
        atual1 = l1.primeiro;
        while(atual1 != null){
            Elemento atuall2 = l2.primeiro;
            while(atuall2 != null){
                if(atuall2.valor == atual1.valor && !lista4.contemValor(atual1.valor)){
                    lista4.insereUltimo(atuall2.valor);
                    break;
                }
                atuall2 = atuall2.proximo;
            }
            atual1 = atual1.proximo;
        }
        return lista4;
    }

}
