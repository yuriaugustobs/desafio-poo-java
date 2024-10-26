import java.time.LocalDate;

import br.Curso;
import br.Mentoria;

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
    Mentoria mentoria1 = new Mentoria();

    mentoria1.setTitulo("mentoria de java");
    mentoria1.setDescricao("descricao mentoria java");
    mentoria1.setData(LocalDate.now());

    
    System.out.println(curso1);
    System.out.println(curso2);
}
}
