import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String Nome;
    private Set<Conteudo> conteudoInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudoConcluidos= new LinkedHashSet<>();

    public void inscreverBootcamp (Bootcamp bootcamp){
        this.conteudoInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);

    }
    
    public void progredir(){
       Optional<Conteudo> conteudo =  this.conteudoInscritos.stream().findFirst();
       if(conteudo.isPresent()){
        this.conteudoConcluidos.add(conteudo.get());
        this.conteudoInscritos.add(conteudo.get());
       }else{
        System.err.println("Você não está matriculado em nenhum curso");
       }
    }
    
    public double calcularTotalXp(){
        // return this.conteudoConcluidos.stream().mapToDouble(conteudo -> conteudo.calcularXp()).sum();
        //ou
        return this.conteudoConcluidos.stream()
                                      .mapToDouble(Conteudo :: calcularXp)
                                      .sum();
    }



    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public Set<Conteudo> getConteudoInscritos() {
        return conteudoInscritos;
    }

    public void setConteudoInscritos(Set<Conteudo> conteudoInscritos) {
        this.conteudoInscritos = conteudoInscritos;
    }

    public Set<Conteudo> getConteudoConcluidos() {
        return conteudoConcluidos;
    }

    public void setConteudoConcluidos(Set<Conteudo> conteudoConcluidos) {
        this.conteudoConcluidos = conteudoConcluidos;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Dev dev = (Dev) obj;

        return Objects.equals(Nome, dev.Nome) &&  
        Objects.equals(conteudoInscritos, dev.conteudoInscritos) && 
        Objects.equals(conteudoConcluidos, dev.conteudoConcluidos);
        
    }
 
    @Override
    public int hashCode() {
        
        return Objects.hash(Nome,conteudoInscritos,conteudoConcluidos);
    }

  
}
