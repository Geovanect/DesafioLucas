package Questao8;

public class Lista {
    Elemento primeiro, ultimo;

    public Lista() {
        primeiro = ultimo = null;
    }

    public boolean estaVazio() {
        return primeiro == null;
    }

    public int tamanho() {
        int tamanho = 0;
        Elemento atual = primeiro;
        while (atual != null) {
            tamanho++;
            atual = atual.proximo;
        }
        return tamanho;
    }

    public void inserePrimeiro(int v) {
        Elemento novo = new Elemento(v);
        if (estaVazio()) {
            primeiro = ultimo = novo;
        } else {
            novo.proximo = primeiro;
            primeiro = novo;
        }
    }

    public void insereUltimo(int v) {
        Elemento novo = new Elemento(v);
        if (estaVazio()) {
            primeiro = ultimo = novo;
        } else {
            ultimo.proximo = novo;
            ultimo = novo;
        }
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

    public Lista uniao(Lista l1, Lista l2) {
        Lista lista3 = new Lista();
        Elemento atual1 = l1.primeiro;
        while (atual1 != null) {
            if (!lista3.contemValor(atual1.valor)) {
                lista3.insereUltimo(atual1.valor);
            }
            atual1 = atual1.proximo;
        }
        Elemento atual2 = l2.primeiro;
        while (atual2 != null) {
            if (!lista3.contemValor(atual2.valor)) {
                lista3.insereUltimo(atual2.valor);
            }
            atual2 = atual2.proximo;
        }
        return lista3;
    }

    public Lista intersecao(Lista l1, Lista l2) {
        Lista lista4 = new Lista();
        Elemento atual1 = l1.primeiro;
        while (atual1 != null) {
            if (l2.contemValor(atual1.valor) && !lista4.contemValor(atual1.valor)) {
                lista4.insereUltimo(atual1.valor);
            }
            atual1 = atual1.proximo;
        }
        return lista4;
    }

    public void exibir() {
        Elemento atual = primeiro;
        while (atual != null) {
            System.out.print(atual.valor + " ");
            atual = atual.proximo;
        }
        System.out.println();
    }
}