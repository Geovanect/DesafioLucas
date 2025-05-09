package Questao5;

public class Pilha {
    private int[] pilha;
    private int topo;


    public Pilha(int capacity){
        this.pilha = new int[capacity];
        this.topo = -1;
    }

    public boolean estaVazio(){
        if(topo == -1){
            return true;
        }
        return false;
    }


    public void push(int value){
        if(topo<pilha.length -1){
            topo++;
            pilha[topo] = value;
        }
    }

    public int pop(){
        if(!estaVazio()){
            int removido = pilha[topo];
            pilha[topo]--;
            return removido;
        }
        return 0;
    }

    public void stackTest(Pilha pilhadois){
        if(topo == pilhadois.topo){
            System.out.println("As Pilhas tem o mesmo tamanho");
        } else if (topo> pilhadois.topo) {
            System.out.println("A primeira pilha é maior");
        } else if (pilhadois.topo > topo) {
            System.out.println("Pilha dois maior");
        }
    }

    public int mediaAritimetica(Pilha pilha){
        int soma = 0;
        for(int i =0; i<pilha.topo -1; i++){
            soma += pilha.pilha[i];
        }
        if(pilha.topo>= 0){
            return soma / (pilha.topo +1);
        }
        return 0;
    }

    public void maiorEMenor(){
        if(topo< 0 ){
            throw new RuntimeException("Pilha Vazia");
        }

        int maior = pilha[0];

        for(int i = 0; i<=topo; i++){
            if(pilha[i]>maior){
                maior = pilha[i];
            }
        }
        System.out.println("Maior numero: "+ maior);

        int menor = pilha[0];
        for(int i = 0; i<=topo; i++){
            if(pilha[i]<menor){
                menor = pilha[i];
            }
        }
        System.out.println("Menor numero: " +menor);
    }

    public void copiar(Pilha origem, Pilha destino){
        Pilha temp = new Pilha(origem.pilha.length);

        for(int i = origem.topo; i>= 0; i--){
            temp.push(origem.pilha[i]);
        }

        for(int i = origem.topo; i>=0; i--){
            destino.push(temp.pilha[i]);
        }
    }

    public int retornaImpares(Pilha pilha){
        for(int i =0; i<pilha.topo -1; i++){
            if(pilha.pilha[i] % 2 == 1){
                return pilha.pilha[i];
            }
        }
        return 0;
    }
    public int retornaPares(Pilha pilha){
        for(int i =0; i<pilha.topo -1; i++){
            if(pilha.pilha[i] % 2 == 0){
                return pilha.pilha[i];
            }
        }
        return 0;
    }

}
