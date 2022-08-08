import java.time.LocalDate;

public class Main{

public static void main(String[] args) {
    Curso curso1 = new Curso();
    curso1.setTitulo("Curso java");
    curso1.setDescricao("Cursos em Java");
    curso1.setCargaHororia(6);
    
    Curso curso2 = new Curso();
    curso2.setTitulo("Curso javaScript");
    curso2.setDescricao("curso completo em Javascript");
    curso2.setCargaHororia(6);
   

    //Conteudo conteudo = new Curso(); polimorfismo


    Mentoria mentoria = new Mentoria();
    mentoria.setTitulo("Mentoria BD");
    mentoria.setDescricao("Mentoria de Banco de Dados");
    mentoria.setData(LocalDate.now());
 
    System.out.println(curso1);
    System.out.println(curso2);
    System.out.println(mentoria);


    Bootcamp bootcamp = new Bootcamp();
    bootcamp.setNome("Kotlin");
    bootcamp.setDescricao("aprenda Kotlin em 6 semanas");
    bootcamp.getConteudos().add(curso1);
    bootcamp.getConteudos().add(curso2);
    bootcamp.getConteudos().add(mentoria);
    
    Dev devAluno = new Dev();
    devAluno.setNome("Maria");
    devAluno.inscreverBootcamp(bootcamp);
    System.out.println("Conteudo inscritos Maria" + devAluno.getConteudoInscritos());
    devAluno.progredir();
    System.out.println("------");
    System.out.println("Conteudo inscritos Maria" + devAluno.getConteudoConcluidos());
    System.out.println("XP: " + devAluno.calcularTotalXp());
    
    System.out.println("-----------------------------------------------");
    
    Dev devAluno2 = new Dev();
    devAluno2.setNome("Joao");
    devAluno2.inscreverBootcamp(bootcamp);
    System.out.println("Conteudo inscritos Joao" + devAluno.getConteudoInscritos());
    devAluno2.progredir();
    System.out.println("------");
    System.out.println("Conteudo inscritos Joao" + devAluno.getConteudoConcluidos());
    System.out.println("XP: " + devAluno2.calcularTotalXp());

    }
}