package com.example.tp2.repository;


import java.util.List;

import com.example.tp2.model.Consulta;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.Id;


public interface ConsultaRepository extends JpaRepository<Consulta, Integer> {

}