package com.example.tp2;

import com.example.tp2.model.Consulta;
import com.example.tp2.service.ConsultaService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class ConsultaServiceTests {
    @Autowired
    private ConsultaService consultaService;

    @Test
    @DisplayName("Deve inserir uma consulta no banco.")
    public void testarInsert() {
        List<Consulta> all = consultaService.getAll();
        int estadoInicial = all.size();

        Consulta consulta = new Consulta();
        consulta.setData(LocalDate.of(2024, 6, 17));
        consulta.setIdPaciente(1);
        consulta.setIdMedico(1);
        consulta.setConsultaFinalizada(true);
        consulta.setDiagnostico("Gripe");

        consultaService.save(consulta);

        all = consultaService.getAll();
        int estadoFinal = all.size();

        assertEquals(estadoInicial+1, estadoFinal);
    }
}
