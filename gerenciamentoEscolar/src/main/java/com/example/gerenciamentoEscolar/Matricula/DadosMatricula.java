package com.example.gerenciamentoEscolar.Matricula;

import com.example.gerenciamentoEscolar.Aluno.Aluno;
import com.example.gerenciamentoEscolar.Curso.Curso;
import jakarta.validation.constraints.NotBlank;

import java.util.Date;

public record DadosMatricula(
        Aluno aluno,
        Curso curso,
        Date dataMatricula
) {
}
