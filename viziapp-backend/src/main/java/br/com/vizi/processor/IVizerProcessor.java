package br.com.vizi.processor;

import java.util.List;

import br.com.vizi.dto.request.VizerRequestDto;
import br.com.vizi.dto.response.VizerResponseDto;

public interface IVizerProcessor {

	VizerResponseDto adicionar(VizerRequestDto request) throws Exception;

	VizerResponseDto consultarPorId(Long id) throws Exception;

	List<VizerResponseDto> consultarTodos() throws Exception;

	VizerResponseDto atualizar(VizerRequestDto request, Long id) throws Exception;

}
