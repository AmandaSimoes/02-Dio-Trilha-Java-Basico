package Map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ExemplosMap {
    public static void main(String[] args) {
        
        System.out.println("Crie um discionário que relacione modelos e s");
        Map<String, Double> carrosPopulares = new HashMap<>() {{
            put("uno ", 14.4);
            put("gol ", 15.3);
            put("hb20 ", 14.1);
            put("mobi ", 14.4);
            put("kwid ", 16.0);
            

        }};

        System.out.println(carrosPopulares.toString());

        System.out.println("Substitua o consumo do Gol para 16.0 Km/l: ");
        carrosPopulares.put("gol", 16.0);
        System.out.println(carrosPopulares.toString());


        System.out.println("Confira se o modelom Tucson está no dicionário: " + carrosPopulares.containsKey("Tucson"));
        System.out.println("Confira se o modelom Uno está no dicionário: " + carrosPopulares.containsKey("uno"));

        System.out.println("Confira o consumo do uno: " + carrosPopulares.get("uno"));

        System.out.println("Exiba os modelos adicionados: ");
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println(modelos.toString());

        System.out.println("Exiba os consumos: ");
        Collection <Double> consumo = carrosPopulares.values();
        System.out.println(consumo.toString());

        System.out.println("Exiba o modelo mais econômico e seu consumo: ");
        Double consEficiencia = Collections.max(carrosPopulares.values());
        Set <Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modeloMaisEficiente = "";

        for (Map.Entry<String,Double> entry : entries) {
            if (entry.getValue().equals(consEficiencia)){
            modeloMaisEficiente = entry.getKey();

            System.out.println("Modelo mais eficiente: " + modeloMaisEficiente + " - " + consEficiencia );
        }}

        System.out.println("Exiba o modelo menos econômico e seu consumo: ");

        Double menorConsumo = Collections.min(carrosPopulares.values());
        String modeloMenosEficiente = "";
        for (Map.Entry<String,Double> entry : carrosPopulares.entrySet()) {
            if(entry.getValue().equals(menorConsumo)) 
            modeloMaisEficiente = entry.getKey();
            
        }
        System.out.println("Modelo menos eficiente: " + modeloMenosEficiente + " - " + menorConsumo);


        
        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double soma = 0.0;
        while (iterator.hasNext()){
            soma += iterator.next();
        }

        System.out.println("Exiba a soma dos consumos: " + soma);


        System.out.println("Exiba a média dos consumos do dicionário: " + (soma/carrosPopulares.size()));


        System.out.println("Remova modelos com consumo igual a 14.4 km/l");
        Iterator<Double> iterator1 = carrosPopulares.values().iterator();
        while (iterator1.hasNext()){
           if (iterator1.next().equals(14.4)) iterator1.remove();
        }
        System.out.println(carrosPopulares);


        System.out.println("Exiba todos os carros nas ordens que foram informados");
        Map<String, Double> carrosPopulares1 = new LinkedHashMap<>() {{
            put("uno ", 14.4);
            put("gol ", 15.3);
            put("hb20 ", 14.1);
            put("mobi ", 14.4);
            put("kwid ", 16.0);
            

        }};

        System.out.println(carrosPopulares1);

        System.out.println("Exiba do dicionário ordenado pelo modelo (ordem alfabética): ");
        Map<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares1);
        System.out.println(carrosPopulares2.toString());

        System.out.println("Apague o dicionário de carros: ");
        carrosPopulares.clear();
        System.out.println(carrosPopulares);

        System.out.println("Confira se o dicionário está vazio: " + carrosPopulares.isEmpty());





        



    }
    
}
