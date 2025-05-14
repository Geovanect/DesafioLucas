package Questao9;

public class Main {
    public static void main(String[] args) {

        ListaDupla lista = new ListaDupla();

        lista.InsereP(10, 0);
        lista.InsereP(20, 1);
        lista.InsereP(30, 2);
        lista.InsereP(15, 1);

        System.out.println("Lista após inserções:");
        imprimir(lista);

        Elemento removido = lista.RemovaP(2);
        System.out.println("Removido: " + removido.valor);

        System.out.println("Lista após remoção:");
        imprimir(lista);
    }

    public static void imprimir(ListaDupla lista) {
        Elemento atual = lista.primeiro;
        while (atual != null) {
            System.out.print(atual.valor + " ");
            atual = atual.proximo;
        }
        System.out.println();
    }
}
