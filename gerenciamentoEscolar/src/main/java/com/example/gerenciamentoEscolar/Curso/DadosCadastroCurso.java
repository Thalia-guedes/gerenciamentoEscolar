package com.example.gerenciamentoEscolar.Curso;

import com.example.gerenciamentoEscolar.Professor.DadosCadastroProfessor;
import com.example.gerenciamentoEscolar.Professor.Professor;
import jakarta.validation.constraints.NotNull;

public record DadosCadastroCurso(
        String nomeCurso,
        @NotNull(message = "O campo 'dadosProfessor' não deve ser nulo")
        Professor professor
) {
}
