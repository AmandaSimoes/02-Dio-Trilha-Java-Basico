import javax.swing.JOptionPane;

public class UncheckedException {
    public static void main(String[] args) {

        boolean continueLooping = true;
        do{ 
        String a  = JOptionPane.showInputDialog("Numerador: ", args);
        String b = JOptionPane.showInputDialog("Denominador: ", a);

        try{
            int resultado = dividir (Integer.parseInt(a), Integer.parseInt(b));
            System.out.println("Resultado" + resultado);
            continueLooping = false;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida! Informe um número inteiro" + e.getMessage());
          
            //  e.printStackTrace();
        } catch(ArithmeticException e){
            JOptionPane.showMessageDialog(null, "Zero não é um número válido" + e.getMessage());

        } 
        finally {
            System.out.println("Chegou ao finally!");
        }

        } while (continueLooping);

        
        

        System.out.println("O código continua");
    }
    
    public static int dividir(int a, int b){
        return a / b;
    }
}
