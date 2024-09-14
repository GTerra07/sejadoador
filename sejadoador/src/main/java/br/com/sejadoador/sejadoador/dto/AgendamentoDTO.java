package br.com.sejadoador.sejadoador.dto;

import lombok.Data;
import java.time.LocalDate;

    @Data
    public class AgendamentoDTO {
        private Long id;
        private Long idUsuario;
        private Long idCentroDoacao;
        private LocalDate data;
        private String hora;
        private String local;
        private String status;
        private String hemograma; // PDF armazenado como string (pode ser caminho ou base64)
    }
