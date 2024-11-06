package com.hemocentro.sejadoador.controller;

import com.hemocentro.sejadoador.model.Usuario;
import com.hemocentro.sejadoador.service.UsuarioService;
import com.hemocentro.sejadoador.exception.UsuarioExistenteException;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    // Método para cadastrar novo usuário
    @PostMapping("/cadastrar")
    public ResponseEntity<Usuario> cadastrar(@RequestBody Usuario usuario) {
        try {
            Usuario novoUsuario = usuarioService.cadastrarUsuario(usuario);
            return ResponseEntity.ok(novoUsuario);
        } catch (UsuarioExistenteException e) {
            return ResponseEntity.badRequest().body(null);  // Retorne null se ocorrer erro de duplicação de CPF
        } catch (Exception e) {
            return ResponseEntity.status(500).body(null);  // Erro inesperado
        }
    }

    @Autowired
    private AuthenticationManager authenticationManager;
    // Método para realizar login
    @PostMapping("/login")
    public ResponseEntity<Usuario> login(@RequestParam String email, @RequestParam String senha) {
        return usuarioService.login(email, senha)
                .map(usuario -> ResponseEntity.ok(usuario))
                .orElseGet(() -> ResponseEntity.status(401).body(null));  // Retorne null para credenciais inválidas
    }

    @PostMapping("/recuperar-senha")
    public ResponseEntity<String> recuperarSenha(@RequestBody @Valid RecuperaSenhaBody recuperaSenha) {
        System.out.println("PASSOU");
        try {
            boolean sucesso = usuarioService.recuperarSenha(recuperaSenha.getCpf(), recuperaSenha.getNovaSenha());
            if (sucesso) {
                return ResponseEntity.ok("Senha alterada com sucesso.");
            } else {
                return ResponseEntity.status(404).body("Usuário não encontrado.");
            }
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Erro ao alterar a senha.");
        }
    }
}
