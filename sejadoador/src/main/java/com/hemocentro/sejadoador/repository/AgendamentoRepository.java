package com.hemocentro.sejadoador.repository;

import com.hemocentro.sejadoador.model.Agendamento;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AgendamentoRepository extends MongoRepository<Agendamento, String> {

    //O método de busca deve seguir o padrão correto: findBy + NomeDoCampo
    List<Agendamento> findByIdUsuario(String idUsuario);
}
