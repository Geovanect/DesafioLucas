package Questao6;

public class main {
    public static void main(String[] args) {
        Fila fila1 = new Fila();
        Fila fila2 = new Fila();


        fila1.inserir(10);
        fila1.inserir(5);
        fila1.inserir(3);
        fila1.inserir(8);
        fila1.inserir(2);


        fila2.inserir(1);
        fila2.inserir(6);
        fila2.inserir(9);


        System.out.println("Comparando Fila 1 e Fila 2:");
        fila1.testaFila(fila1, fila2);


        System.out.println("\nAnálise da Fila 1:");
        fila1.maiorMenorMedia();


        Fila fila3 = new Fila();
        fila1.transferirElementos(fila1, fila3);
        System.out.println("\nFila 1 foi copiada para Fila 3.");
        System.out.println("\nAnálise de Pares e Ímpares na Fila 3:");
        System.out.println("Quantidade de pares: " + fila3.retornaPares());
        System.out.println("Quantidade de ímpares: " + fila3.retornaImpares());
    }
}
