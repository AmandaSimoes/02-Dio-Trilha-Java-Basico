import org.junit;
import org.junit.BeforeAll;
import org.junit.BeforeEach;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.junit.AfterAll;
import org.junit.AfterEach;
import org.junit.Test;

public class ConsultarDadosPessoaTest {
    
   @BeforeAll

   static void configuraConexao(){
    BancoDeDados.iniciarConexao();
    System.out.println("Rodou Configura conexão ");

   }

   @BeforeEach
   void insereDadosParaTeste(){
    BancoDeDados.insereDados(new Pessoa("João", LocalDateTime.of(2000, 1, 1,  15, 0, 0 )));
   }

   @AfterEach
   void removeDadosDoTeste(){
    BancoDeDados.removeDados("João", LocalDateTime.of(2000, 1, 1,  15, 0, 0));
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
