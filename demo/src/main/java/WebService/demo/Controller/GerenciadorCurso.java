package WebService.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import WebService.demo.Curso;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/cursos")
public class GerenciadorCurso {

    private List<Curso> listaCursos = new ArrayList<>();

    @Autowired
    public GerenciadorCurso() {

        listaCursos.add(new Curso("Sistemas da Informação", 120));
        listaCursos.add(new Curso("Marketing", 80));
    }

    @GetMapping
    public List<Curso> listarTodosCursos() {
        return listaCursos;
    }

    @PostMapping
    public Curso adicionarNovoCurso(@RequestBody Curso curso) {  // Nome alterado
        listaCursos.add(curso);
        return curso;
    }

    @GetMapping("/{nomeCurso}")
    public Curso obterCursoPeloNome(@PathVariable String nomeCurso) {  // Nome alterado
        return listaCursos.stream()
                .filter(c -> c.getNomeCurso().equalsIgnoreCase(nomeCurso))
                .findFirst()
                .orElse(null);
    }

    @PutMapping("/{nomeCurso}")
    public Curso atualizarCursoExistente(@PathVariable String nomeCurso, @RequestBody Curso cursoAtualizado) {  // Nome alterado
        Curso curso = obterCursoPeloNome(nomeCurso);
        if (curso != null) {
            curso.setNomeCurso(cursoAtualizado.getNomeCurso());
            curso.setTempoDuracao(cursoAtualizado.getTempoDuracao());
        }
        return curso;
    }

    @DeleteMapping("/{nomeCurso}")
    public void deletarCurso(@PathVariable String nomeCurso) {  // Nome alterado
        listaCursos.removeIf(c -> c.getNomeCurso().equalsIgnoreCase(nomeCurso));
    }
}

// Pedro Andrade 10408394
