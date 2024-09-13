package br.com.sejadoador.sejadoador.controller;

import br.com.sejadoador.sejadoador.dto.UsuarioDTO;
import br.com.sejadoador.sejadoador.model.Usuario;
import br.com.sejadoador.sejadoador.service.UsuarioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

    @RestController
    @RequestMapping("/api/usuarios")
    public class UsuarioController {

        private final UsuarioService usuarioService;

        public UsuarioController(UsuarioService usuarioService) {
            this.usuarioService = usuarioService;
        }

        @PostMapping
        public ResponseEntity<Usuario> criarUsuario(@RequestBody UsuarioDTO usuarioDTO) {
            Usuario novoUsuario = usuarioService.criarUsuario(usuarioDTO);
            return ResponseEntity.ok(novoUsuario);
        }

        // Outros métodos, como buscar, atualizar, deletar
    }