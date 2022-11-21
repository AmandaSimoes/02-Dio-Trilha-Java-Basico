public class operadores05 {
    public static void main(String[] args) {
        String nomeUm = "Amanda";
        String nomeDois = new  String("Amanda") ;
            System.out.println(nomeUm.equals(nomeDois));

        int num1 = 1;
        int num2 = 2;

        boolean simNao = num1 == num2;
            if (num1 < num2) {
                System.out.println("Nossa condição é verdadeira!");
            }

        System.out.print ("Número 1 é igual a número 2 ?" + simNao);

       simNao = num1 != num2;

        System.out.print (" Número 1 é diferente a número 2 ?" + simNao);

        simNao = num1 > num2;

        System.out.print (" Número 1 é maior que número 2 ?" + simNao);

        
       
    }
    
}
