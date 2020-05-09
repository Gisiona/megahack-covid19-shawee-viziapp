package br.com.vizi.dto.request;

public class BinarioRequestDto {
	
	private String nome;
	private String contentType;
	private byte[] files;
	private Long idEstabelecimento;
	
	public Long getIdEstabelecimento() {
		return idEstabelecimento;
	}
	public void setIdEstabelecimento(Long idEstabelecimento) {
		this.idEstabelecimento = idEstabelecimento;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getContentType() {
		return contentType;
	}
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}
	public byte[] getFiles() {
		return files;
	}
	public void setFiles(byte[] files) {
		this.files = files;
	}	
}
