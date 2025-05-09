package Questao2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Pilha pilha = new Pilha();
        pilha.empilhar(3);
        pilha.empilhar(1);
        pilha.empilhar(4);
        pilha.empilhar(2);

        System.out.println("Pilha antes da ordenação: ");
        pilha.exibirPilha();

        pilha.ordenarPilha();

        System.out.println("Pilha depois da ordenação: ");
        pilha.exibirPilha();

    }
}
