package Questao1;

public class Pilha {
    public Character[] pilha;
    public int indicepilha;

    public Pilha(){
        this.pilha = new Character[24];
        this.indicepilha = -1;
    }

    public boolean isEmpty(){
        if(indicepilha == -1){
            return true;
        }
        else {
            return false;
        }
    }

    public void empilhar(Character palavra){
        if(indicepilha<pilha.length && palavra != null){
            indicepilha++;
            this.pilha[indicepilha] = palavra;
            System.out.println("Valor empilhado: " + palavra);
        }
        else {
            System.out.println("Pilha cheia");
        }
    }

    public void desempilhar(){
        if(!isEmpty()){
            char removido = this.pilha[indicepilha];
            indicepilha--;
            System.out.print(removido);
        }
        else {
            System.out.println("Pilha Vazia");
        }
    }

}
