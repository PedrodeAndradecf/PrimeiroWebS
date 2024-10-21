package WebService.demo;

import java.util.*;

public class CursoService {
    private List<Curso> listaCursos;

    public CursoService() {
        this.listaCursos = new ArrayList<>();
        this.listaCursos.add(new Curso("Sistemas de Informação", 3000));
        this.listaCursos.add(new Curso("Ciência da Computação", 3000));
    }

    public List<Curso> obterTodosCursos() {
        return this.listaCursos;
    }
}

// Pedro Andrade 10408394
