public class Sobrecarga {

    public static void area(double lado){
        System.out.println("Área do quadrado " + lado * lado);
    }

    public static void area (double lado1, double lado2) {
        System.out.println("Área do retangulo " + lado1 * lado2);
    }

    public static void area (double baseMAior, double laterais, double baseMenor){
        System.out.println("Área do trapézio: " + (baseMAior + baseMenor)*laterais/2);
    }

    public static void area( Float diag1, Float diag2 ){
        System.out.println("Área do losango " + (diag1 * diag2) / 2);
    }
} 