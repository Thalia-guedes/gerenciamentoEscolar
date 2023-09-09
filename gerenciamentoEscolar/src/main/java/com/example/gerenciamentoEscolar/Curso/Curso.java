package com.example.gerenciamentoEscolar.Curso;

import com.example.gerenciamentoEscolar.Professor.DadosCadastroProfessor;
import com.example.gerenciamentoEscolar.Professor.Professor;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Table(name = "cursos")
@Entity(name = "Cursos")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome_curso")
    private String nomeCurso;

    @ManyToOne
    @JoinColumn(name = "professor_id", referencedColumnName = "id")
    private Professor professor;

    public Curso(DadosCadastroCurso dados) {
        this.nomeCurso = dados.nomeCurso();
        this.professor = dados.professor();
    }
}
