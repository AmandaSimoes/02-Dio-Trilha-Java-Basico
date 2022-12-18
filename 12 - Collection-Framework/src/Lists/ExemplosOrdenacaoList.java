package Lists;

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class ExemplosOrdenacaoList {
    public static void main(String[] args) {

        List <Gato> meusGatos = new ArrayList<>(){{
            add(new Gato ( "Batman", 18, "preto" ));
            add(new Gato ( "Phoebe", 6, "amarela" ));
            add(new Gato ( "Batman", 2, "cinza" ));
        }};

        System.out.println("Ordem de inserção " + meusGatos);

        System.out.println("Ordem aleatória ");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);
        
        
    }  
}
class Gato {
    private String nome;
    private Integer idade;
    private String cor;

    public Gato ( String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome(){
        return nome;
   }

   public Integer getIdade(){
        return idade;

   }

   public String getCor(){
        return cor;
   }

   @Override
   
   public String toString() {
    return
       "{ " + "nome: " + nome + ", "
            + "idade: " + idade + ", "
                + "cor: " + cor  + " }";
   };

    
 }
 
 