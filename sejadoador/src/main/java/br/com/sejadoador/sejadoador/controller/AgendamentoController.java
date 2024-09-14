package br.com.sejadoador.sejadoador.controller;

import br.com.sejadoador.sejadoador.dto.AgendamentoDTO;
import br.com.sejadoador.sejadoador.model.Agendamento;
import br.com.sejadoador.sejadoador.service.AgendamentoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

    @RestController
    @RequestMapping("/api/agendamentos")
    public class AgendamentoController {

        private final AgendamentoService agendamentoService;

        public AgendamentoController(AgendamentoService agendamentoService) {
            this.agendamentoService = agendamentoService;
        }

        @PostMapping
        public ResponseEntity<Agendamento> criarAgendamento(@RequestBody AgendamentoDTO agendamentoDTO) {
            Agendamento novoAgendamento = agendamentoService.criarAgendamento(agendamentoDTO);
            return ResponseEntity.ok(novoAgendamento);
        }

        // Outros métodos, como buscar, atualizar, deletar
    }
