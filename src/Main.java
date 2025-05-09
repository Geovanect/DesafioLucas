import Questao1.Pilha;

import java.util.Stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String texto = "ESTE EXERCÍCIO É MUITO FACIL.";

        Stack<Character> pilha = new Stack<>();

        for(int i =0; i<texto.length();i++){
            char c = texto.charAt(i);

            if(c != ' ' && c != '.'){
                pilha.push(c);
            }
            else{
                while(!pilha.isEmpty()){
                    System.out.print(pilha.pop());
                }
                System.out.print(c);
            }
        }

    }
}
