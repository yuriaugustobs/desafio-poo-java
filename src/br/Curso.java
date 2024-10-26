package br;

public class Curso extends Conteudo{

    //adicionando atributos da classe curso
    // boa pratica colocar modificadores de acesso: sendo eles:
    // private - so essa classe tem acesso (usar getters and setters)
    // protected - so essa classe e suas classes filhas tem acesso
    // public - qualquer classe tem acesso (se deixar sem nada é public automatico)

    private int cargaHoraria;

    @Override
    public double calcularXp() {
      return XP_PADRAO * cargaHoraria;
    }


    public Curso() {
    }

      public int getCargaHoraria() {
        return this.cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }


    @Override
    public String toString() {
        return "{" +
            " titulo='" + getTitulo() + "'" +
            ", descricao='" + getDescricao() + "'" +
            ", cargaHoraria='" + getCargaHoraria() + "'" +
            "}";
    }

}
