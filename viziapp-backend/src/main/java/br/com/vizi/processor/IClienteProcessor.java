package br.com.vizi.processor;

import java.util.List;

import br.com.vizi.dto.request.ClienteRequestDto;
import br.com.vizi.dto.response.ClienteResponseDto;

public interface IClienteProcessor {

	ClienteResponseDto adicionar(ClienteRequestDto request);
	List<ClienteResponseDto> consultarTodos();
}
