import java.util.Scanner;

public class MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        int media = 0;        
        int  count = 0;

        do {
            System.out.println("Digite sua nota: ");
            numero = scan.nextInt();

            media = media + numero;

            if (numero > maior) maior = numero;
            count = count +1;

        } while(count < 5);
            System.out.println("A maior nota tirada foi: " +  maior);
            
            System.out.println("A média de suas notas é de: " + (media / 5));
    }
    
}
