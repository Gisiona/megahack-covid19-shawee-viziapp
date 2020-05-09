package br.com.vizi.processor.impl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import br.com.vizi.dto.request.ClienteRequestDto;
import br.com.vizi.dto.response.ClienteResponseDto;
import br.com.vizi.entity.Cliente;
import br.com.vizi.processor.IClienteProcessor;
import br.com.vizi.repository.ClienteRepository;

@Component
public class ClienteProcessor implements IClienteProcessor {

	@Autowired
	private ClienteRepository clienteRepository;
	
	@Override
	@Transactional(propagation=Propagation.REQUIRES_NEW)
	public ClienteResponseDto adicionar(ClienteRequestDto request) {
		Cliente cli = new Cliente();
		cli.setNome(request.getNome());
		cli.setAtivo(true);
		cli.setCep(request.getCep());
		cli.setCpf(request.getCpf());
		cli.setDataCadastro(LocalDate.now());
		cli.setEmail(request.getEmail());
		cli.setEnderecoCompleto(request.getEnderecoCompleto());
		cli.setWhatsapp(request.getWhatsapp());
		
		Cliente resp = clienteRepository.save(cli);
		
		ClienteResponseDto response = new ClienteResponseDto();
		response.setCep(resp.getCep());
		response.setCpf(resp.getCpf());
		response.setEmail(resp.getEmail());
		response.setEnderecoCompleto(resp.getEnderecoCompleto());
		response.setId(resp.getId());
		response.setNome(resp.getNome());
		response.setWhatsapp(resp.getWhatsapp());
		
		return response;
	}

	@Override
	public List<ClienteResponseDto> consultarTodos() {
		ClienteResponseDto resp = null;
		List<ClienteResponseDto> response = new ArrayList<ClienteResponseDto>();
		
		List<Cliente> clientes = clienteRepository.findAll();
		
		for (Cliente cliente : clientes) {
			resp = new ClienteResponseDto();
			resp.setCep(cliente.getCep());
			resp.setCpf(cliente.getCpf());
			resp.setEmail(cliente.getEmail());
			resp.setEnderecoCompleto(cliente.getEnderecoCompleto());
			resp.setId(cliente.getId());
			resp.setNome(cliente.getNome());
			resp.setWhatsapp(cliente.getWhatsapp());
			response.add(resp);
		}
		return response;
	}

}
