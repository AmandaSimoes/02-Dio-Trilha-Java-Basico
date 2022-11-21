public class operadores04 {
    public static void main(String[] args) {
        /*Exemplo de condicional usando if/else */

        int a, b;
        
        a = 5;
        b = 6;
        String resultado = "";
            if (a==b)
                resultado = "verdadeiro";
                else 
                    resultado = "falso ";

        System.out.print(resultado);

        int c, d;
        c = 3;
        d = 3;
        String res = c==d ? "verdadeiro " : "falso";


        System.out.print(res);

        int e, f;
        e = 4;
        f = 5;
         int result = e==f ? 1 : 0;

         System.out.print(result);

    }
    
}
