import java.time.LocalDate;
import java.util.*;

public class Bootcamp {
     private String Nome;
     private String Descricao;
     private final LocalDate dataInicial = LocalDate.now();
     private final LocalDate dataFinal = dataInicial.plusDays(45) ;

     private Set<Dev> devsInscritos = new HashSet<>();
     private Set<Conteudo> conteudos = new LinkedHashSet<>();
   
     public String getNome() {
        return Nome;
    }
    public void setNome(String nome) {
        Nome = nome;
    }
    public String getDescricao() {
        return Descricao;
    }
    public void setDescricao(String descricao) {
        Descricao = descricao;
    }
    public Set<Dev> getDevsInscritos() {
        return devsInscritos;
    }
    public void setDevsInscritos(Set<Dev> devsInscritos) {
        this.devsInscritos = devsInscritos;
    }
    public Set<Conteudo> getConteudos() {
        return conteudos;
    }
    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }
    @Override
    public int hashCode() {
        return Objects.hash(Nome,Descricao,dataInicial, dataFinal,devsInscritos,conteudos);
    }
   
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) obj;
        return Objects.equals(Nome, bootcamp.Nome) &&  
        Objects.equals(Descricao, bootcamp.Descricao) && 
        Objects.equals(dataInicial, bootcamp.dataInicial) && 
        Objects.equals(dataFinal, bootcamp.dataFinal) && 
        Objects.equals(devsInscritos, bootcamp.devsInscritos) &&
        Objects.equals(conteudos, bootcamp.conteudos);
    }
    
















    
}
