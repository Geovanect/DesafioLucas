package Questao7;

public class Main {
    public static void main(String[] args) {
        Lista lista = new Lista();


        System.out.println("Inserindo no início:");
        lista.inserirPrimeiro(10);
        lista.inserirPrimeiro(20);
        lista.inserirPrimeiro(30);
        lista.exibir();


        System.out.println("\nInserindo no final:");
        lista.inserirUltimo(40);
        lista.inserirUltimo(50);
        lista.exibir();


        System.out.println("\nRemovendo primeiro:");
        lista.removerPrimeiro();
        lista.exibir();


        System.out.println("\nRemovendo último:");
        lista.removerUltimo();
        lista.exibir();


        System.out.println("\nRemovendo todos:");
        lista.removerPrimeiro();
        lista.removerPrimeiro();
        lista.removerPrimeiro();
        lista.exibir();
        lista.removerUltimo();
    }
}
