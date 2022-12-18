package Map;

import java.util.HashMap;
import java.util.Map;

public class ExemplosMap {
    public static void main(String[] args) {
        
        System.out.println("Crie um discionário que relacione modelos e s");
        Map<String, Double> carrosPopulares = new HashMap<>() {{
            put("uno", 14.4);
            put("gol", 15.3);
            put("hb20", 14.1);
            put("mobi", 14.4);
            put("kwid", 16.0);
            

        }};

        System.out.println(carrosPopulares.toString());
        



    }
    
}
