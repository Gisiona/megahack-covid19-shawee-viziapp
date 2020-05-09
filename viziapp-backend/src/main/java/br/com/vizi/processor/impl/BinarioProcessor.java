package br.com.vizi.processor.impl;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import br.com.vizi.dto.request.BinarioRequestDto;
import br.com.vizi.entity.BinarioEstabelecimento;
import br.com.vizi.processor.IBinarioProcessor;
import br.com.vizi.repository.BinarioRepository;

@Component
public class BinarioProcessor implements IBinarioProcessor {

	@Autowired
	private BinarioRepository binarioRepository;
	
	@Override
	public void uploadDocumento(BinarioRequestDto binario) throws Exception {
		try {
			BinarioEstabelecimento bina = new BinarioEstabelecimento();
			bina.setBytes(binario.getFiles());
			bina.setNome(binario.getNome());
			bina.setContentType(binario.getContentType());
			bina.setDataCadastro(LocalDateTime.now());
			//bina.setIdEstabelecimento(binario.getIdEstabelecimento());
			
			binarioRepository.save(bina);
		} catch (Exception e) {
			throw new Exception("Fala ao salvar documento.");
		}		
	}

	public byte[] convertMultiPartFileToBytes(MultipartFile file) throws Exception {
		return file.getBytes();
	}

}
