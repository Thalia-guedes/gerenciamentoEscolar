package com.example.gerenciamentoEscolar.Matricula;

import com.example.gerenciamentoEscolar.Aluno.Aluno;
import com.example.gerenciamentoEscolar.Curso.Curso;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@Table(name = "matriculas")
@Entity(name = "Matriculas")
@Getter
@NoArgsConstructor
@EqualsAndHashCode (of = "id")
public class Matricula {
    @Id @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "IDAluno")
    private Aluno aluno;
    @ManyToOne
    @JoinColumn(name = "IDCurso")
    private Curso curso;
    @Column(name = "DataMatricula")
    @Temporal(TemporalType.DATE)
    private Date dataMatricula;

    public Matricula(DadosMatricula dados) {
        this.aluno = dados.aluno();
        this.curso = dados.curso();
        this.dataMatricula = dados.dataMatricula();
    }
}
