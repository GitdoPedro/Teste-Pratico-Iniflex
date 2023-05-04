package br.com.projedata.Iniflex.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public abstract class Pessoa {
    private String nome;
    private LocalDate dataNascimento;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


}
