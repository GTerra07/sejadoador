package br.com.sejadoador.sejadoador.service;

import br.com.sejadoador.sejadoador.dto.CentroDoacaoDTO;
import br.com.sejadoador.sejadoador.dto.EnderecoDTO;
import br.com.sejadoador.sejadoador.model.CentroDoacao;
import br.com.sejadoador.sejadoador.model.Endereco;
import org.springframework.stereotype.Service;

@Service
public class CentroDoacaoService {

    public CentroDoacao criarCentroDoacao(CentroDoacaoDTO centroDoacaoDTO) {
        CentroDoacao centroDoacao = new CentroDoacao();
        centroDoacao.setId(centroDoacaoDTO.getId());
        centroDoacao.setNome(centroDoacaoDTO.getNome());
        centroDoacao.setEndereco(converterEnderecoDTOParaEndereco(centroDoacaoDTO.getEndereco())); // Conversão de EnderecoDTO para Endereco
        centroDoacao.setTelefone(centroDoacaoDTO.getTelefone());
        centroDoacao.setEmail(centroDoacaoDTO.getEmail());
        centroDoacao.setHorarioFuncionamento(centroDoacaoDTO.getHorarioFuncionamento());
        return centroDoacao;
    }

    // Método para converter EnderecoDTO para Endereco
    private Endereco converterEnderecoDTOParaEndereco(EnderecoDTO enderecoDTO) {
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
