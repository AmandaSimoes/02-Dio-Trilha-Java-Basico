import java.lang.System.Logger;

import javax.management.loading.PrivateClassLoader;

public class BancoDeDados {

    private static final Logger LOGGER = Logger.getLooger(BancoDeDados.class.getName()); 

    public static void iniciarConexao(){
        Logger.info("Iniciou conexão");

    }

    
    public static void finalizarConexao(){
        Logger.info("Finalizou conexão");

    }

    public static void insereDados(Pessoa pessoa){
        Logger.info("Inseriu dados");

    }

    public static void removeDados(Pessoa pessoa){
        Logger.info("Removeu dados");

    }
    
}
