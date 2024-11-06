package com.hemocentro.sejadoador.controller;

import com.hemocentro.sejadoador.model.Usuario;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

@SpringBootTest
@AutoConfigureMockMvc
public class UsuarioControllerTest {

@Autowired
private MockMvc mockMvc;

@Autowired
private ObjectMapper objectMapper;

    @Test
    public void testCadastrarUsuario() throws Exception {
        Usuario usuario = new Usuario();
        usuario.setNome("João Silva");
        usuario.setCpf("12345678900");
        usuario.setEmail("joao@example.com");
        usuario.setSenha("senhaSegura");

        mockMvc.perform(post("/api/usuarios/cadastrar")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(usuario)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.nome").value("João Silva"))
                .andExpect(jsonPath("$.cpf").value("12345678900"));
    }

    @Test
    public void testGetUsuarioNotFound() throws Exception {
        mockMvc.perform(get("/api/usuarios/99999")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isNotFound());
    }
}