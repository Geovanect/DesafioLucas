package Questao4;

public class Main {
    public static void main(String[] args) {
        Lista lista = new Lista();

        lista.insere(30);
        lista.insere(50);
        lista.insere(60);

        System.out.println("Elementos:");
        lista.imprimeLista(lista);
        lista.remove();
        System.out.println("Após remoção de um elemnto: ");
        lista.imprimeLista(lista);
        lista.remove();
        lista.remove();
        System.out.println("Após remover todos");
        lista.imprimeLista(lista);
    }
}
