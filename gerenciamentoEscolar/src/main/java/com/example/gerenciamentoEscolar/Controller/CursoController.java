package com.example.gerenciamentoEscolar.Controller;

import com.example.gerenciamentoEscolar.Aluno.AlunoRepository;
import com.example.gerenciamentoEscolar.Curso.Curso;
import com.example.gerenciamentoEscolar.Curso.CursoRepository;
import com.example.gerenciamentoEscolar.Curso.DadosCadastroCurso;
import com.example.gerenciamentoEscolar.Professor.Professor;
import com.example.gerenciamentoEscolar.Professor.ProfessorRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("cursos")
public class CursoController {
    @Autowired
    private CursoRepository repository;
    private Professor professorResponsavel;
    @Autowired
    private ProfessorRepository professorRepository;

    @RequestMapping
    @Transactional
    public void cadastra(@RequestBody @Valid DadosCadastroCurso dados) {

        Professor professor = dados.professor();
        if (professor.getId() == null) {
            professor = professorRepository.save(professor); // Salve o professor no banco de dados
        }

        Curso curso = new Curso(dados);
        curso.setProfessorResponsavel(professor);

        repository.save(curso);
    }

}
