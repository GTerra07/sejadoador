package br.com.sejadoador.sejadoador.service;

import br.com.sejadoador.sejadoador.dto.AgendamentoDTO;
import br.com.sejadoador.sejadoador.model.Agendamento;
import org.springframework.stereotype.Service;

    @Service
    public class AgendamentoService {

        public Agendamento criarAgendamento(AgendamentoDTO agendamentoDTO) {
            Agendamento agendamento = new Agendamento();
            agendamento.setId(agendamentoDTO.getId());
            agendamento.setIdUsuario(agendamentoDTO.getIdUsuario());
            agendamento.setIdCentroDoacao(agendamentoDTO.getIdCentroDoacao());
            agendamento.setData(agendamentoDTO.getData());
            agendamento.setHora(agendamentoDTO.getHora());
            agendamento.setLocal(agendamentoDTO.getLocal());
            agendamento.setStatus(agendamentoDTO.getStatus());
            agendamento.setHemograma(agendamentoDTO.getHemograma());
            return agendamento;
        }
    }
