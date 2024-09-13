package br.com.sejadoador.sejadoador.model;

import java.time.LocalDate;
import lombok.Data;

    @Data //utilizado para getters e setters
    public class Usuario {
        private Long id;
        private String nome;
        private String email;
        private String senha;
        private String telefone;
        private String cpf;
        private String rg;
        private LocalDate dataNascimento;
        private int peso;
        private String sexo;
        private Endereco endereco;
        private String tipoSanguineo;
        private boolean assinouTermo;

        // Getters e Setters
        // Construtores (se necessário)
    }
