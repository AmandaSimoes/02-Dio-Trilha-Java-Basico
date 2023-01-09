
import org.junit.BeforeAll;
import org.junit.AfterAll;
import org.junit.Test;

public class ConsultarDadosPessoaTest {
    
   @BeforeAll

   static void configuraConexao(){
    BancoDeDados.iniciarConexao();
    System.out.println("Rodou Configura conexão ");

   }

   @Test
   void validarDadosDeRetorno(){
    Assertions.assertTrue(true);
   }

   @AfterAll
   static void finalizarConexao(){
    BancoDeDados.finalizarConexao();
    System.out.println("Finalizou conexão");
   }



  



}
