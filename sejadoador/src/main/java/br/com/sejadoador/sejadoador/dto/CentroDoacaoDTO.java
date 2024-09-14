package br.com.sejadoador.sejadoador.dto;

import lombok.Data;

    @Data
    public class CentroDoacaoDTO {
        private Long id;
        private String nome;
        private EnderecoDTO endereco; // Reutilizando o EnderecoDTO
        private String telefone;
        private String email;
        private String horarioFuncionamento;
    }
