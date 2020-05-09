package br.com.vizi.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.vizi.dto.request.VizerRequestDto;
import br.com.vizi.dto.response.VizerResponseDto;
import br.com.vizi.processor.IVizerProcessor;

@RestController
@CrossOrigin(origins = "*" , allowedHeaders = "*")
@RequestMapping("/viziapp/v1/vizers")
public class VizerController {

	@Autowired
	private IVizerProcessor vizerProcessor;
	
	@PostMapping()
	public ResponseEntity<VizerResponseDto> adicionarVizer(@RequestBody VizerRequestDto request) throws Exception{		
		return new ResponseEntity<>(vizerProcessor.adicionar(request), new HttpHeaders(), HttpStatus.CREATED);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<VizerResponseDto> consultarPorId(@PathVariable("id") Long id) throws Exception{		
		return new ResponseEntity<>(vizerProcessor.consultarPorId(id), new HttpHeaders(), HttpStatus.OK);
	}

	@GetMapping()
	public ResponseEntity<List<VizerResponseDto>> consultarTodos() throws Exception{		
		return new ResponseEntity<>(vizerProcessor.consultarTodos(), new HttpHeaders(), HttpStatus.OK);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<VizerResponseDto> atualizarVizer(@PathVariable("id") Long id, @RequestBody VizerRequestDto request) throws Exception{		
		return new ResponseEntity<>(vizerProcessor.atualizar(request, id), new HttpHeaders(), HttpStatus.OK);
	}
	
}
