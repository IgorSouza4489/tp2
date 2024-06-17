package com.example.tp2.service;

import com.example.tp2.exception.ResourceNotFoundException;
import com.example.tp2.model.Consulta;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ConsultaService {


    List<Consulta> consultas = initValues();
    private List<Consulta> initValues(){
        ArrayList<Consulta> consultas1 = new ArrayList<>();
        consultas1.add( new Consulta(1,
                LocalDate.of(2023, 12, 12),
                1,
                1,
                false,
                "3 dias de vida"));
        return consultas1;
    }

    public List<Consulta> getAll() {
        return this.consultas;
    }

    public Consulta getById(Integer id) {
        if(id < 0){
            throw new ResourceNotFoundException("Valor Invalido - NAO PODE SER NEGATIVO");
        }else {
            Optional<Consulta> consultaOpt = consultas.stream().filter(consulta -> consulta.getId() == id).findFirst();
            if(consultaOpt.isEmpty()) throw new ResourceNotFoundException("Objeto Nao Encontrado");
            return consultaOpt.get();
        }
    }

    public void save(Consulta consulta) {
        consultas.add(consulta);
    }

    public void update(Integer id, Consulta consulta) {
        if(resourceNotFound(id)){
            throw new ResourceNotFoundException("Consulta Não Localizada");
        }
        for (int i = 0; i < consultas.size(); i++) {
            if (consultas.get(i).getId().equals(id)) {
                consultas.set(i, consulta);
                break;
            }
        }

    }

    public void deleteById(Integer id) {
        if(resourceNotFound(id)){
            throw new ResourceNotFoundException("Consulta não localizada");
        }
        //consultas.remove(consultas.get(id);
        consultas.removeIf(e -> e.getId().equals(id));
    }

    private boolean resourceNotFound(Integer id) {
        return consultas.stream().filter(consulta -> consulta.getId() == id).findFirst().isEmpty();
    }
}
