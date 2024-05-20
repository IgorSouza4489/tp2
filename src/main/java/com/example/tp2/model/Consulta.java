package com.example.tp2.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Consulta {
    private Integer id;
    private LocalDate data;
    private Integer idPaciente;
    private Integer idMedico;
    private Boolean consultaFinalizada;
    private String diagnostico;
}
