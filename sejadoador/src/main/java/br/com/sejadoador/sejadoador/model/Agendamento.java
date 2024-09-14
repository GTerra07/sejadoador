package br.com.sejadoador.sejadoador.model;

import lombok.Data;
import java.time.LocalDate;

    @Data
    public class Agendamento {
        private Long id;
        private Long idUsuario;
        private Long idCentroDoacao;
        private LocalDate data;
        private String hora;
        private String local;
        private String status;
        private String hemograma;
    }
