package com.hemocentro.sejadoador.controller;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class RecuperaSenhaBody {
    @NotEmpty(message = "O Usuário é obrigatório")
    String cpf;
    @NotEmpty(message = "A nova senha é obrigatório")
    String novaSenha;
}
