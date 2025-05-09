package Questao2;

public class Pilha {
    public int[] pilha;
    public int indicepilha;

    public Pilha(){
        this.pilha = new int[10];
        this.indicepilha = -1;
    }

    public boolean isEmpty(){
        return indicepilha == -1;
    }

    public void empilhar(int v){
        if(indicepilha < pilha.length -1){
            indicepilha++;
            pilha[indicepilha] = v;
        }
        else {
            System.out.println("Pilha Cheia");
        }
    }

    public int topo(){
        if(!isEmpty()){
            return pilha[indicepilha];
        }
        else{
            throw new IllegalStateException();
        }
    }

    public int desempilhar(){
        if(!isEmpty()){
            int removido = pilha[indicepilha];
            indicepilha--;
            return removido;

        }
        else{
            System.out.println("Pilha vazia;");
            return -1;
        }
    }

    public void exibirPilha(){
        if(isEmpty()){
            System.out.println("Pilha Vazia: ");
            return;
        }
        for(int i = indicepilha; i >=0; i--){
            System.out.println(pilha[i]);
        }
    }

    public void ordenarPilha(){
        Pilha pilha2 = new Pilha();

        while(!this.isEmpty()){
            int temp = desempilhar();

            while(!pilha2.isEmpty() && pilha2.topo()>temp){
                this.empilhar(pilha2.desempilhar());
            }

            pilha2.empilhar(temp);
        }
        while(!pilha2.isEmpty()){
            this.empilhar(pilha2.desempilhar());
        }


    }
}
