package com.example.tp2.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Entity;

import javax.persistence.*;
import java.time.LocalDate;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "consultas")
public class Consulta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "data")
    private LocalDate data;
    @Column(name = "data")

    private Integer idPaciente;
    @Column(name = "data")

    private Integer idMedico;
    @Column(name = "data")

    private Boolean consultaFinalizada;
    @Column(name = "data")

    private String diagnostico;
}
