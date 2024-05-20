package com.example.tp2.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Usuario {
    private Integer id;
    private String nome;
    private String email;
    private String senha;
    private boolean isDoctor;
    private String especialidade;
}