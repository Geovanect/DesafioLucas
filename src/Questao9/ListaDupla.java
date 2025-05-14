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

    public Elemento Locate(int pos) {
        if (pos < 0 || pos >= tamanho()) {
            return null;
        }

        Elemento atual = primeiro;
        for (int i = 0; i < pos; i++) {
            atual = atual.proximo;
        }
        return atual;
    }

    public void InsereP(int valor, int pos) {
        if (pos < 0 || pos > tamanho()) {
            throw new RuntimeException("Erro: posição inválida");
        }

        Elemento novo = new Elemento(valor);

        if (pos == 0) {
            novo.proximo = primeiro;
            if (primeiro != null) {
                primeiro.anterior = novo;
            } else {
                ultimo = novo;
            }
            primeiro = novo;
            return;
        }

        Elemento atual = Locate(pos);
        if (atual == null) {
            // Inserção no final
            novo.anterior = ultimo;
            if (ultimo != null) {
                ultimo.proximo = novo;
            }
            ultimo = novo;
        } else {
            novo.anterior = atual.anterior;
            novo.proximo = atual;
            if (atual.anterior != null) {
                atual.anterior.proximo = novo;
            }
            atual.anterior = novo;
            if (pos == 0) {
                primeiro = novo;
            }
        }
    }

    public Elemento RemovaP(int pos) {
        Elemento removido = Locate(pos);
        if (removido == null) {
            throw new RuntimeException("Erro: posição inválida");
        }

        if (removido.anterior != null) {
            removido.anterior.proximo = removido.proximo;
        } else {
            primeiro = removido.proximo;
        }

        if (removido.proximo != null) {
            removido.proximo.anterior = removido.anterior;
        } else {
            ultimo = removido.anterior;
        }

        return removido;
    }
}
