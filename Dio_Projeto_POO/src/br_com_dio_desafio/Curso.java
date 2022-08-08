public class Curso extends Conteudo{

   private int cargaHororia;
    
   @Override
   public double calcularXp() {
      
       return XP_PADRAO * cargaHororia ;
   }
    public Curso (){

    }

    public int getCargaHororia() {
        return cargaHororia;
    }
    public void setCargaHororia(int cargaHororia) {
        this.cargaHororia = cargaHororia;
    }

    @Override
    public String toString(){
        return "Mentoria{ " +
        "titulo' = " + getTitulo() + '\'' +
        ", descricao= '" + getDescricao() + '\'' +
        ", data= " + cargaHororia + 
        '}';
    }

}