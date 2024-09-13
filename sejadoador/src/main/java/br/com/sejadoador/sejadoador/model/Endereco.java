package br.com.sejadoador.sejadoador.model;

import lombok.Data;

    @Data
    public class Endereco {
        private String rua;
        private int numero;
        private String complemento;
        private String bairro;
        private String cidade;
        private String estado;
        private String cep;

        // Getters e Setters
        // Construtores (se necessário)
    }