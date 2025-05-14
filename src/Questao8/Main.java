package Questao8;

public class Main {
    public static void main(String[] args) {
        Lista L1 = new Lista();
        Lista L2 = new Lista();


        L1.insereUltimo(1);
        L1.insereUltimo(2);
        L1.insereUltimo(3);
        L1.insereUltimo(4);


        L2.insereUltimo(3);
        L2.insereUltimo(4);
        L2.insereUltimo(5);
        L2.insereUltimo(6);


        Lista L3 = L1.uniao(L1, L2);


        Lista L4 = L1.intersecao(L1, L2);

        System.out.print("L1: ");
        L1.exibir();

        System.out.print("L2: ");
        L2.exibir();

        System.out.print("L3 (união sem repetição): ");
        L3.exibir();

        System.out.print("L4 (interseção): ");
        L4.exibir();
    }
}
