package Questao5;

public class main {
    public static void main(String[] args) {
        Pilha p1 = new Pilha(10);
        Pilha p2 = new Pilha(10);


        p1.push(10);
        p1.push(5);
        p1.push(7);
        p1.push(2);

        p2.push(10);
        p2.push(5);
        p2.push(7);
        p2.push(2);

        p1.stackTest(p2);

        System.out.println("\nAnálise da Pilha P1:");
        p1.maiorEMenor();
        System.out.println("Média aritmética: " + p1.mediaAritimetica(p1));


        Pilha copiaP2 = new Pilha(10);
        p1.copiar(p1, copiaP2);
        System.out.println("\nPilha P1 copiada para nova pilha P2 (copia).");


        int qtdImpares = p1.retornaImpares(p1);
        int qtdPares = p1.retornaPares(p1);
        System.out.println("\nQuantidade de números ímpares na P1: " + qtdImpares);
        System.out.println("Quantidade de números pares na P1: " + qtdPares);
    }
}
