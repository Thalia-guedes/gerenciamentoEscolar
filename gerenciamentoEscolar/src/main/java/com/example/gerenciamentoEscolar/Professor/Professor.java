package com.example.gerenciamentoEscolar.Professor;

import com.example.gerenciamentoEscolar.Curso.Disciplina;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "professores")
@Entity(name = "Professores")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode (of = "id")
public class Professor {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    @Enumerated(EnumType.STRING)
    private Disciplina disciplina;
    public Professor( DadosCadastroProfessor dados) {
        this.nome = dados.nome();
        this.disciplina = dados.disciplina();
    }
}
