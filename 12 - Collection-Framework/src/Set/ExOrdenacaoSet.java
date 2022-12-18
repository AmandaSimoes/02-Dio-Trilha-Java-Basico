package Set;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class ExOrdenacaoSet {

    public static void main(String[] args) {

        System.out.println( "--- Ordem aleatória ---");

        Set<Serie> minhaSeries = new HashSet<>(){{
            add(new Serie("Friends", "Comédia", 25 ));
            add(new Serie("Anne with E", "Drama", 60));
            add(new Serie("Bom dia, Veronica!", "Drama", 45));
          
        }};

        for (Serie serie: minhaSeries) System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        

        System.out.println( "--- Ordem de inserção ---");

        Set<Serie> minhaSeries1 = new LinkedHashSet<>() {{
            add(new Serie("Friends", "Comédia", 25 ));
            add(new Serie("Anne with E", "Drama", 60));
            add(new Serie("Bom dia, Veronica!", "Drama", 45));
          
        }};

        for (Serie serie: minhaSeries1) System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        

        System.out.println( "--- Ordem de natural (Tempo de Episódio) ---");
        Set<Serie> minhasSeries2 = new TreeSet<>(minhaSeries1);
        for (Serie serie: minhasSeries2) System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());


        System.out.println( "--- Ordem Nome / Genero / Tempo de Episódio) ---");
        Set<Serie> minhasSeries3 = new TreeSet<>(new ComparatoNomeGeneroTempoEpisodio());
        minhasSeries3.addAll(minhaSeries);
        for (Serie serie: minhasSeries3) System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
    }
    
}

class Serie implements Comparable <Serie> {
    private String nome;
    private String genero;
    private Integer tempoEpisodio;

    public Serie (String nome, String genero, Integer tempoEpisodio) {
        this.nome = nome;
        this.genero = genero;
        this.tempoEpisodio = tempoEpisodio;
        }

        public String getGenero(){
            return genero;
        }
        
        public String getNome (){
            return nome;
        }
        
        public Integer getTempoEpisodio () {
            return tempoEpisodio;
        }

        @Override 
        public String toString(){
        return "{" + "nome: " + nome + ", genero: " +
        genero + ", tempo episodio: " + tempoEpisodio 
        + "}";
    }

        @Override
        public boolean equals (Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return nome.equals(serie.nome) && genero.equals(serie.genero) && tempoEpisodio.equals(serie.tempoEpisodio);
        }

        @Override
        public int hashCode() {
        return Objects.hash(nome, genero, tempoEpisodio);

}

        @Override
        public int compareTo (Serie serie) {
        return Integer.compare (this.getTempoEpisodio(), serie.getTempoEpisodio()) ;

}


}

class ComparatoNomeGeneroTempoEpisodio implements Comparator <Serie>{

    @Override
    public int compare (Serie s1, Serie s2){
        int nome= s1.getNome().compareTo(s2.getNome());
        if (nome != 0) return nome;

        int genero = s1.getGenero().compareTo(s2.getGenero());
        if (genero != 0) return genero;

        return Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio());
        
    }
}

