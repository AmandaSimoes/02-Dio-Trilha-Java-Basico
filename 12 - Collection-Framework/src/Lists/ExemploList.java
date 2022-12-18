package Lists;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class ExemploList {
    public static void main(String[] args) {

        System.out.println("Crie uma lista e insira as sete notas: ");

        List <Double> notas = new ArrayList<>(); 
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(3.2);
        notas.add(5.0);
        notas.add(8.0);
        notas.add(4.9);
        
        System.out.println(notas.toString());

        System.out.println("Exiba a posição da nota 5 " + notas.indexOf(5.0));

        System.out.println("Adicione a nota 2.0 na posição 1: ");

        notas.add(1, 2.0);

        System.out.println(notas);
        
        System.out.println("Substitua a nota 5.0 pela nota 6.9: ");

        notas.set(notas.indexOf(5.0), 6.9);

        System.out.println(notas);

        System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5.0));

        System.out.println("Exiba todas as notas na ordem em que foram informadas: ");

        for (Double nota: notas) {
            System.out.println(nota);           
        }

        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));
        
        System.out.println("Exiba a menor nota: " + Collections.min (notas) );

        System.out.println("Exiba a maior nota: " + Collections.max (notas) );

        

        Iterator <Double> iterator = notas.iterator();
        Double soma = 0.0;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        
        System.out.println("Exiba a soma dos valores: " + soma);

        System.out.println("Exiba a média das notas: " + (soma / notas.size()));

        System.out.println("Remova a menor nota (2.0): ");
        notas.remove(2.0);
        System.out.println(notas);

        System.out.println("Remova a nota da posição 0: ");
        notas.remove(0);
        System.out.println(notas);

        Iterator <Double> remover = notas.iterator();
        while (remover.hasNext()) {
            Double proNumero = remover.next();
            if (proNumero < 7.0 )  remover.remove();
        }

        System.out.println("Remova notas menores que 7.0: ");
        System.out.println(notas);

        System.out.println("Apague toda a lista ");
        notas.clear();
        System.out.println(notas);

        System.out.println("Confira se a lista está vazia, se tiver dá true: " + notas.isEmpty());
        
        




    }
}
