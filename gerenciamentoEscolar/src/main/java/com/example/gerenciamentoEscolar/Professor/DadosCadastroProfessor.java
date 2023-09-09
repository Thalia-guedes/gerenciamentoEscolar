package com.example.gerenciamentoEscolar.Professor;

import com.example.gerenciamentoEscolar.Curso.Disciplina;
import jakarta.persistence.Embedded;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;

public record DadosCadastroProfessor(
        String nome,
        @Valid
        @Embedded
        Disciplina disciplina
) {
}
