package Questao9;

public class ListaDupla {
    public Elemento primeiro, atual, ultimo;

    public ListaDupla(){
        primeiro = atual = ultimo = null;
    }

    public boolean estaVazio(){
        if(primeiro == null){
            return true;
        }
        return false;
    }

    public int tamanho(){
        atual = primeiro;
        int tamanho = 0;
        while(atual != null){
            atual = atual.proximo;
            tamanho++;
        }
        return tamanho;
    }

    public void moveParaPosicao(int pos){
        int tamanho = tamanho();
        if(pos<=tamanho && pos> 0) {
            atual = primeiro;
            for (int i = 1; i < pos; i++) {
                atual = atual.proximo;
            }
        }
        throw new RuntimeException("Erro ao buscar posicao solicitada");
    }

    public Elemento Locate(ListaDupla l1, int pos){
        if(l1.tamanho() < pos){
            return null;
        }
        l1.moveParaPosicao(pos);
        return l1.atual;
    }

    public void insereP(ListaDupla l1, int valor, int pos){
        if(l1.tamanho()<pos){
            throw new RuntimeException("Valor da posicao indicada maior que o numero de elementos");
        }
        Elemento novo = new Elemento(valor);
        if(pos == 0){
            novo.proximo = l1.primeiro;
            if(l1.primeiro != null){
                l1.primeiro.anterior = novo;
            }
            primeiro = novo;
        }
        l1.Locate(l1, pos);
        novo.proximo = atual;
        novo.anterior = atual.anterior;

        if(atual.anterior!= null){
            atual.anterior.proximo = novo;
        }

    }

    public Elemento RemovaP(ListaDupla l1, int pos) {
        if (l1.tamanho() <= pos) {
            throw new RuntimeException("Valor da posicao indicada maior que o numero de elementos");
        }
        Elemento removido = l1.Locate(l1,pos);
        if(removido.anterior != null){
            removido.anterior.proximo = removido.proximo;
        }else {
            l1.primeiro = removido.proximo;
        }
        if(removido.proximo != null){
            removido.proximo.anterior = removido.anterior;
        }

        return removido;
    }
}
