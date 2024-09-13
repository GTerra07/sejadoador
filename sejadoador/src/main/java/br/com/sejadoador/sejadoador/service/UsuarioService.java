package br.com.sejadoador.sejadoador.service;

import br.com.sejadoador.sejadoador.dto.UsuarioDTO;
import br.com.sejadoador.sejadoador.model.Usuario;
import br.com.sejadoador.sejadoador.model.Endereco;
import br.com.sejadoador.sejadoador.dto.EnderecoDTO;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    public Usuario criarUsuario(UsuarioDTO usuarioDTO) {
        Usuario usuario = new Usuario();
        usuario.setId(usuarioDTO.getId());
        usuario.setNome(usuarioDTO.getNome());
        usuario.setEmail(usuarioDTO.getEmail());
        usuario.setSenha(usuarioDTO.getSenha());
        usuario.setTelefone(usuarioDTO.getTelefone());
        usuario.setCpf(usuarioDTO.getCpf());
        usuario.setRg(usuarioDTO.getRg());
        usuario.setDataNascimento(usuarioDTO.getDataNascimento());
        usuario.setPeso(usuarioDTO.getPeso());
        usuario.setSexo(usuarioDTO.getSexo());
        usuario.setTipoSanguineo(usuarioDTO.getTipoSanguineo());
        usuario.setAssinouTermo(usuarioDTO.isAssinouTermo());

        // Convertendo EnderecoDTO para Endereco antes de setar
        usuario.setEndereco(convertToEndereco(usuarioDTO.getEndereco()));

        return usuario;
    }

    private Endereco convertToEndereco(EnderecoDTO enderecoDTO) {
        Endereco endereco = new Endereco();
        endereco.setRua(enderecoDTO.getRua());
        endereco.setNumero(enderecoDTO.getNumero());
        endereco.setComplemento(enderecoDTO.getComplemento());
        endereco.setBairro(enderecoDTO.getBairro());
        endereco.setCidade(enderecoDTO.getCidade());
        endereco.setEstado(enderecoDTO.getEstado());
        endereco.setCep(enderecoDTO.getCep());
        return endereco;
    }
}
