package WebService.demo;

public class Curso {
    private String nomeCurso;  // Nome alterado
    private int tempoDuracao;  // Nome alterado

    public Curso() {
    }

    public Curso(String nomeCurso, int tempoDuracao) {
        this.nomeCurso = nomeCurso;
        this.tempoDuracao = tempoDuracao;
    }

    public int getTempoDuracao() {
        return tempoDuracao;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setTempoDuracao(int tempoDuracao) {
        this.tempoDuracao = tempoDuracao;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }
}

// Pedro Andrade 10408394
