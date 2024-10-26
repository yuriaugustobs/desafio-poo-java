import br.Conteudo;
import br.Curso;
import br.Mentoria;
import br.com.dio.desafio.Bootcamp;
import br.com.dio.desafio.Dev;
import java.time.LocalDate;

public class Main {

/**
 * @param args
 */
public static void main(String[] args) {

    //criando novos objetos CURSO 
    Curso curso1 = new Curso();
    curso1.setTitulo("curso java");
    curso1.setDescricao("descricao curso java");
    curso1.setCargaHoraria(8);

    Curso curso2 = new Curso();
    curso2.setTitulo("curso js");
    curso2.setDescricao("descricao curso js");
    curso2.setCargaHoraria(4);

    Conteudo conteudo = new Curso();

    // criando novos objetos MENTORIA 
    Mentoria mentoria = new Mentoria();

    mentoria.setTitulo("mentoria de java");
    mentoria.setDescricao("descricao mentoria java");
    mentoria.setData(LocalDate.now());

    
   /* System.out.println(curso1);
    System.out.println(curso2);
    System.out.println(mentoria); */

    Bootcamp bootcamp = new Bootcamp();
    bootcamp.setNome("Bootcamp Java Developer");
    bootcamp.setDescricao("Descrição Bootcamp Java Developer");
    bootcamp.getConteudos().add(curso1);
    bootcamp.getConteudos().add(curso2);
    bootcamp.getConteudos().add(mentoria);

  //Adicionando DEVS e inscrevendo em bootcamps, progredindo e exibindo inscricoes, conclusoes e xp calculados de cada dev.
    Dev devYuri = new Dev();
    devYuri.setNome("Yuri");
    devYuri.inscreverBootcamp(bootcamp);
    System.out.println("Conteúdos Inscritos" + devYuri.getConteudosInscritos());

    devYuri.progredir();
    System.out.println("------------");


    System.out.println("Conteúdos Inscritos yuri:" + devYuri.getConteudosInscritos());
    System.out.println("Conteudos concluidos yuri:" + devYuri.getConteudosConcluidos());

    System.out.println("------------");

    System.out.println("XP atual yuri:" + devYuri.calcularTotalXp());

    Dev devMaria = new Dev();
    devMaria.setNome("Maria");
    devMaria.inscreverBootcamp(bootcamp);

    devMaria.progredir();
    devMaria.progredir();
    devMaria.progredir();

    System.out.println("------------");

    System.out.println("Conteúdos Inscritos maria" + devMaria.getConteudosInscritos());
    System.out.println("Conteudos concluidos maria:" + devMaria.getConteudosConcluidos());

    System.out.println("------------");

    System.out.println("XP atual maria:" + devMaria.calcularTotalXp());




}
}
