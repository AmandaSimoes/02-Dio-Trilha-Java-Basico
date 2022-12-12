package Cast;

class RodarAplicacao {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();

        /* upcast - gerente, faxineiro e vendedor são filhos (extends) de funcionario e receberam um upcast para se tornar a classe funcionario. */


       Funcionario gerente = new Gerente();
       Funcionario faxineiro = new Faxineiro();
       Funcionario vendedor = new Vendedor();
       

       /*  EXEMPLO DE DOWNCAST

        Vendedor vendedor_ = (vendedor) new funcionario ();
        */
        
    }
    
}
