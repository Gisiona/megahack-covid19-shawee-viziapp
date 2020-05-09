package br.com.vizi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.vizi.dto.request.EstabelecimentoRequestDTO;
import br.com.vizi.dto.response.EstabebelecimentoResponseDTO;
import br.com.vizi.processor.IEstabelecimentoProcessor;

@RestController
@CrossOrigin(origins = "*" , allowedHeaders = "*")
@RequestMapping("/viziapp/v1/estabelecimentos")
public class EstabelecimentoController {

	@Autowired
	private IEstabelecimentoProcessor estabelecimentoProcessor;
	
	@GetMapping()
	public List<EstabebelecimentoResponseDTO> listaEstabelecimentos() throws Exception{		
		return estabelecimentoProcessor.listaEstabelecimentos();
	}
	
	@GetMapping("/{id}")
	public EstabebelecimentoResponseDTO listaEstabelecimentoPorId(@PathVariable("id") Long id) throws Exception{		
		return estabelecimentoProcessor.listaEstabelecimentoPorId(id);
	}
	
	@PostMapping()
	public EstabebelecimentoResponseDTO adicionarEstabelecimento(@RequestBody EstabelecimentoRequestDTO request) throws Exception{		
		return estabelecimentoProcessor.adicionar(request);
	}
		
}
