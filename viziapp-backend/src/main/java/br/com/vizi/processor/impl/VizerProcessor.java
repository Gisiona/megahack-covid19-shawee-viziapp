package br.com.vizi.processor.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpClientErrorException.BadRequest;

import br.com.vizi.dto.request.VizerRequestDto;
import br.com.vizi.dto.response.VizerResponseDto;
import br.com.vizi.entity.Vizer;
import br.com.vizi.processor.IVizerProcessor;
import br.com.vizi.repository.VizerRepository;

@Component
public class VizerProcessor implements IVizerProcessor {

	@Autowired
	private VizerRepository vizerRepository;
	
	@Override
	public VizerResponseDto adicionar(VizerRequestDto request) throws Exception {
		try {
			Vizer vizer = new Vizer(request);						
			vizer = vizerRepository.save(vizer);
			return new VizerResponseDto(vizer);
		} catch (Exception e) {
			throw new Exception("Erro ao salvar vizer. ERRO: " + e.getMessage());
		}
	}

	@Override
	public VizerResponseDto consultarPorId(Long id) throws Exception {
		try {
			Optional<Vizer> vizer = vizerRepository.findById(id);
			
			if(vizer.isPresent()) {
				return new VizerResponseDto(vizer.get());
			}
			throw null;
		} catch (Exception e) {
			throw new Exception("Erro ao consultar vizer. ERRO: " + e.getMessage());
		}
	}

	@Override
	public List<VizerResponseDto> consultarTodos() throws Exception {
		try {
			List<Vizer> vizers = vizerRepository.findAll();
			List<VizerResponseDto> dtos = new ArrayList<VizerResponseDto>();
			
			if(vizers.size() >= 1) {
				for (Vizer vizer : vizers) {
					dtos.add(new VizerResponseDto(vizer));
				}
				return dtos;
			}
			
			return null;
		} catch (Exception e) {
			throw new Exception("Erro ao consultar vizer. ERRO: " + e.getMessage());
		}
	}

	@Override
	public VizerResponseDto atualizar(VizerRequestDto request, Long id) throws Exception {
		try {
			Optional<Vizer> vizer = vizerRepository.findById(id);
			Vizer viz = null;
			
			if(vizer.isPresent()) {
				viz = vizer.get();
				viz = new Vizer(request);
				viz = vizerRepository.saveAndFlush(viz);
			}else {
				throw new Exception("Registro não localizado");
			}
			
			return new VizerResponseDto(viz);
			
		} catch (Exception e) {
			throw new Exception("Erro ao atualizar vizer. ERRO: " + e.getMessage());
		}
	}

}
