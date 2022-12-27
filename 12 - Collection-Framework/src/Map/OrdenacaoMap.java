package Map;

import java.util.Objects;
import java.util.Map;

public class OrdenacaoMap {
    public static void main(String[] args) {
        Map <String, Livros>
    }
    
}

class Livros {
    private String nome;
    private Integer paginas;

    public Livros (String nome, Integer paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }

    public String getNome(){
        return nome;
    }

    public Integer getPaginas() {
        return paginas;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livros livros =(Livros) o ;
        return nome.equals(livros.nome) &&  paginas.equals(livros.paginas);

    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, paginas);
    }

    @Override
    public String toString(){
        return "Livro{" + 
        "nome{" + nome + ", paginas"
        + paginas + "}";
    }
}