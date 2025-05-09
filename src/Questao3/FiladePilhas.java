package Questao3;

public class FiladePilhas {
    private NoFila primeiro, ultimo;

    public boolean estaVazio(){
        if(primeiro == null){
            return true;
        }
        else{
            return false;
        }
    }



    public void enfileirarPilha(Pilha pilha){
        NoFila novo = new NoFila(pilha);
        if(estaVazio()){
            primeiro = novo;
            ultimo = novo;
        }else{
            ultimo.proximo = novo;
            ultimo = novo;
        }
    }

    public Pilha desenfileira(){
        if(estaVazio()){
            throw new RuntimeException("Não existe elemento");
        }
            Pilha removida = primeiro.pilha;
            primeiro = primeiro.proximo;

        return removida;
    }

    public void imprimirFila(){
        NoFila atual = primeiro;
        int i = 1;
        while(atual != null){
            System.out.println("Pilha " + i + ": ");
            atual.pilha.imprimir();
            atual = atual.proximo;
            i++;
        }
    }

}
