package com.example.gerenciamentoEscolar.Controller;

import com.example.gerenciamentoEscolar.Curso.Curso;
import com.example.gerenciamentoEscolar.Matricula.DadosMatricula;
import com.example.gerenciamentoEscolar.Matricula.Matricula;
import com.example.gerenciamentoEscolar.Matricula.MatriculaRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("matriculas")
public class MatriculaController {
    @Autowired
    private MatriculaRepository repository;
    @RequestMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosMatricula dados){
        repository.save(new Matricula(dados));

    }
}
