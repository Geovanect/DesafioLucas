package Questao6;

public class Fila {
    public Elemento inicio , fim;

    public Fila(){
        inicio = fim = null;
    }

    public boolean estaVazio(){
        if(inicio == null){
            return true;
        }
        return false;
    }

    public int tamanho(){
        int comprimento = 0;
        Elemento atual;
        atual = inicio;
        while(atual != null){
            atual = atual.proximo;
            comprimento++;
        }
        return comprimento;

    }

    public void inserir(int v){
        Elemento novo = new Elemento(v);
        if(estaVazio()){
            inicio = novo;
            fim = novo;
        }
        else{
            fim.proximo = novo;
            fim = novo;
        }
    }

    public int remover(){
        if(estaVazio()){
            throw new RuntimeException("Está vazia");
        }
        else{
            inicio = inicio.proximo;
        }
        return inicio.valor;
    }

    public void testaFila(Fila fila1, Fila fila2){
        if(fila1.tamanho() == fila2.tamanho()){
            System.out.println("As filas são iguais");
        } else if (fila1.tamanho()>fila2.tamanho()) {
            System.out.println("Fila 1 é maior");
        }
        else{
            System.out.println("Fila 2 é maior");
        }
    }

    public void maiorMenorMedia() {
        Elemento atual;
        atual = inicio;
        int maior = atual.valor;
        int menor = atual.valor;
        int soma = 0;
        int cont = 0;


        while (atual != null) {
            int v = atual.valor;
            if (v > maior) {
                maior = v;
            }
            if (v < menor) {
                menor = v;
            }
            soma += v;
            cont++;
            atual = atual.proximo;
        }
        int media = soma / cont;

        System.out.println("O maior numero é: " + maior);
        System.out.println("O menor numero é: " + menor);
        System.out.println("A media aritimetica é: " + media);
    }

    public void transferirElementos(Fila f1, Fila f2){
        while(!f1.estaVazio()){
            f2.inserir(f1.remover());
        }
    }

    public int retornaPares(){
        Elemento atual;
        atual = inicio;
        while(atual != null){
            if(atual.valor % 2 == 0){
                return atual.valor;
            }
            atual = atual.proximo;
        }
        return 0;
    }
    public int retornaImpares(){
        Elemento atual;
        atual = inicio;
        while(atual != null){
            if(atual.valor % 2 == 1){
                return atual.valor;
            }
            atual = atual.proximo;
        }
        return 0;
    }

}
