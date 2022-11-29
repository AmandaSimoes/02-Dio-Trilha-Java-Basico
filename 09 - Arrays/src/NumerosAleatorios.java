import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();

        int [] numerosAleatorios = new int [20];

        for (int i = 0; i < numerosAleatorios.length; i++) {
            int numeros = random.nextInt(100);
            numerosAleatorios[i] = numeros;
        }

        System.out.print("Números aleatórios: ");
        for (int numeros : numerosAleatorios) {
            System.out.print(numeros + " ");
            
        }

        System.out.print("\nSucessores de números aleatórios: ");
        for (int numeros : numerosAleatorios) {
            System.out.print((numeros+1) + " ");
            
        }

        System.out.print("\nAntecessores de números aleatórios: ");
        for (int numeros : numerosAleatorios) {
            System.out.print((numeros-1) + " ");
            
        }
    }
    
}
