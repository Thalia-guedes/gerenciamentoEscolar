package com.example.gerenciamentoEscolar.Curso;

import com.example.gerenciamentoEscolar.Professor.DadosCadastroProfessor;
import com.example.gerenciamentoEscolar.Professor.Professor;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

public record DadosCadastroCurso(
        String nomeCurso,
        @Valid
        @NotNull(message = "O campo 'ProfessorResponsavel' não deve ser nulo")
        Professor professor
) {
}
