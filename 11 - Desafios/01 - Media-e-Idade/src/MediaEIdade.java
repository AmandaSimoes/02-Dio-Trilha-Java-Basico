// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner, 
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);". 
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println.  

/*Desafio
Faça um programa que peça para 3 pessoas a sua idade, ao final o programa deverá verificar se a média de idade da turma varia entre 0 e 25, 26 e 60 e maior que 60; e então, dizer se a turma é jovem, adulta ou idosa, conforme a média calculada.
 */

 /*Entrada
A entrada consiste em três números inteiros que representam a idade das pessoas.

Saída
A saída imprimirá a média de idade da turma, conforme o exemplo abaixo:
70

60      Idosa!

61

7

14       Jovem!

22	 */

import java.util.Scanner;

public class MediaEIdade {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        
        int idade1 = leitor.nextInt();
        
        int idade2 = leitor.nextInt();
        
        int idade3 = leitor.nextInt();

        if (idade1 >= 60){
            System.out.println("Idosa!");
        }else {
            System.out.println("Jovem!");
        }

        if (idade2 >= 60){
            System.out.println("Idosa!");
        }else {
            System.out.println("Jovem!");
        }

        if (idade3 >= 60){
            System.out.println("Idosa!");
        }else {
            System.out.println("Jovem!");
        }
        
        

 //TODO: Implemente um condição de verifique a média de idade da turma conforme a descrição do desafio:
       
    }
}