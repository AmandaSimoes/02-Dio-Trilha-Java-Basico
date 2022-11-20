public class AnatomiaDasClasses {
    
    public static void main (String [] args ) {
        
        String primeiroNome = "Amanda";
        String segundoNome = "Simões";

        String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);
        System.out.print (nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return primeiroNome.concat (" ").concat(segundoNome);
    }

}