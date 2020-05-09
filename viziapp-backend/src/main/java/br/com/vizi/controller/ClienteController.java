package br.com.vizi.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.vizi.dto.request.ClienteRequestDto;
import br.com.vizi.dto.response.ClienteResponseDto;
import br.com.vizi.processor.IClienteProcessor;

@RestController
@CrossOrigin(origins = "*" , allowedHeaders = "*")
@RequestMapping("/viziapp/v1/clientes")
public class ClienteController {

	@Autowired
	private IClienteProcessor clienteProcessor;
	
	@GetMapping("/healthcheck")
	public String healthcheck(){		
		return "200 OK";
	}
	
	@PostMapping()
	public ResponseEntity<ClienteResponseDto> adicionar(@RequestBody @Valid ClienteRequestDto request) {
		ClienteResponseDto response = clienteProcessor.adicionar(request);
		return ResponseEntity.ok(response);	
	}
	
	@GetMapping()
	public ResponseEntity<List<ClienteResponseDto>> consultarTodos() {
		List<ClienteResponseDto> response = clienteProcessor.consultarTodos();
		return ResponseEntity.ok(response);	
	}
}


