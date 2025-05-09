package Questao1;

import java.util.Stack;

public class Main {

        public static void main(String[] args) {
            String texto = "ESTE EXERCÍCIO É MUITO FACIL.";

            Pilha pilha = new Pilha();

            for(int i =0; i<texto.length();i++){
                char c = texto.charAt(i);

                if(c != ' ' && c != '.'){
                    pilha.empilhar(c);
                }
                else{
                    while(!pilha.isEmpty()){
                        pilha.desempilhar();
                    }
                    System.out.print(c);
                }
            }

        }
    }

