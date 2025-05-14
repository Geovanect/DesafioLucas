package Questao3;

public class Main {
    public static void main(String[] args) {
        FiladePilhas fila = new FiladePilhas();


        Pilha pilha1 = new Pilha();
        pilha1.empilhar(10);
        pilha1.empilhar(20);
        pilha1.empilhar(30);


        fila.enfileirarPilha(pilha1);


        Pilha pilha2 = new Pilha();
        pilha2.empilhar(100);
        pilha2.empilhar(200);


        fila.enfileirarPilha(pilha2);


        System.out.println("Fila após inserção de pilhas:");
        fila.imprimirFila();


        Pilha removida = fila.desenfileira();
        System.out.println("Pilha removida da fila:");
        removida.imprimir();


        int valorDesempilhado = removida.desempilhar();
        System.out.println("Valor desempilhado da pilha removida: " + valorDesempilhado);


        System.out.println("Fila após remoção:");
        fila.imprimirFila();

    }
}
