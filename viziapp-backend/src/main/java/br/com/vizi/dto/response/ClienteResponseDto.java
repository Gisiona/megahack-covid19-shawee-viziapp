package br.com.vizi.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ClienteResponseDto {

	@JsonProperty("codigo")
	private Long id;
	
	@JsonProperty("nome")
	private String nome;
	
	@JsonProperty("email")
	private String email;
	
	@JsonProperty("cpf")
	private String cpf;
	
	@JsonProperty("celular_whatsapp")
	private String whatsapp;
	
	@JsonProperty("cep")
	private String cep;
	
	@JsonProperty("endereco_completo")
	private String enderecoCompleto;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getWhatsapp() {
		return whatsapp;
	}

	public void setWhatsapp(String whatsapp) {
		this.whatsapp = whatsapp;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getEnderecoCompleto() {
		return enderecoCompleto;
	}

	public void setEnderecoCompleto(String enderecoCompleto) {
		this.enderecoCompleto = enderecoCompleto;
	}

}
