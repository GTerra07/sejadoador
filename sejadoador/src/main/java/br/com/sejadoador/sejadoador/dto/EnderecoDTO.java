package br.com.sejadoador.sejadoador.dto;

import lombok.Data;

@Data
public class EnderecoDTO {
    private String rua;
    private int numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;
}
