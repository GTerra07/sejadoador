package br.com.sejadoador.sejadoador.dto;

import lombok.Data;
import java.time.LocalDate;
import br.com.sejadoador.sejadoador.model.Endereco;

    @Data
    public class UsuarioDTO {
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
        private EnderecoDTO endereco;
        private String tipoSanguineo;
        private boolean assinouTermo;
    }
