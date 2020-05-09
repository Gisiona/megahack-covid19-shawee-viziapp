package br.com.vizi.processor;

import java.util.List;

import br.com.vizi.dto.request.EstabelecimentoRequestDTO;
import br.com.vizi.dto.response.EstabebelecimentoResponseDTO;

public interface IEstabelecimentoProcessor {
		
	EstabebelecimentoResponseDTO adicionar(EstabelecimentoRequestDTO request) throws Exception;
	EstabebelecimentoResponseDTO listaEstabelecimentoPorId(Long id) throws Exception;
	List<EstabebelecimentoResponseDTO> listaEstabelecimentos() throws Exception;
}
