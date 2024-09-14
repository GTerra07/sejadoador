package br.com.sejadoador.sejadoador.controller;

import br.com.sejadoador.sejadoador.dto.CentroDoacaoDTO;
import br.com.sejadoador.sejadoador.model.CentroDoacao;
import br.com.sejadoador.sejadoador.service.CentroDoacaoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

    @RestController
    @RequestMapping("/api/centros-doacao")
    public class CentroDoacaoController {

        private final CentroDoacaoService centroDoacaoService;

        public CentroDoacaoController(CentroDoacaoService centroDoacaoService) {
            this.centroDoacaoService = centroDoacaoService;
        }

        @PostMapping
        public ResponseEntity<CentroDoacao> criarCentroDoacao(@RequestBody CentroDoacaoDTO centroDoacaoDTO) {
            CentroDoacao novoCentro = centroDoacaoService.criarCentroDoacao(centroDoacaoDTO);
            return ResponseEntity.ok(novoCentro);
        }

        // Outros métodos, como buscar, atualizar, deletar
    }
