public class TerminalArgumentos02 {
    public static void main(String[] args) {
        String nome = args [0];
        String sombrenome = args [1];
        int idade =  Integer.valueOf(args [2]);
        double altura = Double.valueOf(args [3]);

        System.out.println("Olá, me chamo" + nome + " " + sombrenome + ", ");
        System.out.println("tenho " + idade + " anos");
        System.out.println("minha altura é de " + altura + " m");
    }
    
}
