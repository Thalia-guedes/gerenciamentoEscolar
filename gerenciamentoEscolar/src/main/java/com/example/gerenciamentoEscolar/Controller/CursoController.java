package com.example.gerenciamentoEscolar.Controller;

import com.example.gerenciamentoEscolar.Aluno.AlunoRepository;
import com.example.gerenciamentoEscolar.Curso.Curso;
import com.example.gerenciamentoEscolar.Curso.CursoRepository;
import com.example.gerenciamentoEscolar.Curso.DadosCadastroCurso;
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
    @RequestMapping
    @Transactional
    public void cadastra(@RequestBody @Valid DadosCadastroCurso dados){
        repository.save(new Curso(dados));
    }
}
