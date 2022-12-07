// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner, 
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);". 
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println.

import java.util.Scanner;

public class FilaBanco {
    public static void main(String[] args) {
        String[] nomesFila = new String[3];
        Scanner nome = new Scanner(System.in);

        for (int i = 0; i < nomesFila.length; i++) {
            nomesFila[i] = nome.next();

            System.out.format("%s - esta na posicao: %d%n",nomesFila[i],(i + 1) );
        }
    }
}

 //TODO: Implemente uma condição que simule uma fila bancaria, gerando o nome a posição do cliente na fila:
  
