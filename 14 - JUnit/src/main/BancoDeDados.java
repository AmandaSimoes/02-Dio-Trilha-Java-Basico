import java.lang.System.Logger;

import javax.management.loading.PrivateClassLoader;

public class BancoDeDados {

    private static final Logger LOGGER = Logger.getLooger(BancoDeDados.class.getName()); 

    public static void iniciarConexao(){
        Logger.info("Iniciou conexão");

    }

    
    public static void FinalizarConexao(){
        Logger.info("Finalizou conexão");

    }
    
}
