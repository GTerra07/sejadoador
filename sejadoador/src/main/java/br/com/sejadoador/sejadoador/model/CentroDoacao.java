package br.com.sejadoador.sejadoador.model;

import lombok.Data;

    @Data
    public class CentroDoacao {
        private Long id;
        private String nome;
        private Endereco endereco; // Reutilizando o modelo Endereco
        private String telefone;
        private String email;
        private String horarioFuncionamento;
    }
