public class OperadoresLogicos {
    public static void main(String[] args) {
        boolean b1 = true;
        boolean b2 = true;
        boolean b3 = false;
        boolean b4 = false;

        System.out.println ("true && e true = " + (b1 && b2));
        System.out.println ("true && false = " + (b1 && b3));
        /*o && que é uma conjunção, só é verdade quando ambos são true */

        System.out.println ("true || ou false = " + (b2 || b3));
        System.out.println ("false || ou true = " + (b4 || b2));
        System.out.println ("false || ou false = " + (b4 || b3));
        /*o || que é OU, só é falso quando ambos são false */

        System.out.println ("true ^ false (true se são opostos) = " + (b1 ^ b3));
        System.out.println ("true ^ true (true se são opostos) = " + (b1 ^ b2));
        /*o ^, só é verdade quando ambos são opostos */

        System.out.println ("true ! vai virar falso) = " + (!b1));
        System.out.println ("false ! vai virar true) = " + (!b4));
        /*! inverte o valor, quando é false vira true, quando é true vira false*/

        int i1 = 10;
        int i2 = 5;
        float f1 = 20f;
        float f2 = 50f;

        System.out.println ("10 + 5) < (50 - 20)  " + ((i1 + i2) < (f2 - f1)));
        System.out.println ("10 > 5) || (50 < 20)  " + ((i1 > i2) || (f2 < f1)));

        double salMes = 2500.00d;
        double salMedio = 3200.00d;

        int quantDep = 4;
        int mediaDep = 2;

        System.out.println((salMes < salMedio) && (quantDep >= mediaDep));

        boolean salBaixo = salMes < salMedio;
        boolean muitosDep = quantDep >= mediaDep;

        System.out.println((salBaixo) && (muitosDep));

        boolean recebeAuxilio = (salBaixo) && (muitosDep);
        System.out.println("recebe auxílio " + recebeAuxilio);

    }
    
}
