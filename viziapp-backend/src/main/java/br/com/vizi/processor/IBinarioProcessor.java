package br.com.vizi.processor;

import org.springframework.web.multipart.MultipartFile;

import br.com.vizi.dto.request.BinarioRequestDto;

public interface IBinarioProcessor {
	
	void uploadDocumento(BinarioRequestDto binario) throws Exception;
	byte[] convertMultiPartFileToBytes(MultipartFile file) throws Exception;
}
