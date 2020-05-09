package br.com.vizi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import br.com.vizi.dto.request.BinarioRequestDto;
import br.com.vizi.processor.IBinarioProcessor;


@RestController
@CrossOrigin(origins = "*" , allowedHeaders = "*")
@RequestMapping("/viziapp/v1")
public class BinarioController {

	@Autowired
	private IBinarioProcessor binarioProcessor;
	
	@PostMapping("/estabelecimentos/{id}/upload")
	public ResponseEntity<String> uploadDocumento(@RequestParam("file") MultipartFile file, @PathVariable("id") Long id) throws Exception {
		BinarioRequestDto dto = new BinarioRequestDto();
		dto.setFiles(file.getBytes());
		dto.setNome(file.getOriginalFilename());
		dto.setContentType(file.getContentType());
		dto.setIdEstabelecimento(id);
		
		binarioProcessor.uploadDocumento(dto);
		
		return new ResponseEntity<>(new HttpHeaders(), HttpStatus.NO_CONTENT) ;	
	}
}
