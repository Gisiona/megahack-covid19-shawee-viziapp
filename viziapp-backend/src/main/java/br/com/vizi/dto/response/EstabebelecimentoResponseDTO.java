package br.com.vizi.dto.response;

import javax.validation.constraints.Email;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class EstabebelecimentoResponseDTO {
	
	@JsonProperty("codigo")
	private Long id;
	
	@JsonProperty("nome_fantasia")
	private String nomeFantasia;
	
	@Email(message = "O e-mail está inválido")
	@JsonProperty("email")
	private String email;
		
	@JsonProperty("cnpj_cpf")
	private String cnpjCpf;
	
	@JsonProperty("telefone_whatsapp")
	private String whatsapp;
		
	@JsonProperty("segmento_negocio")
	private String segmento;
	
	@JsonProperty("endereco_completo")
	private String enderecoCompleto;
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCnpjCpf() {
		return cnpjCpf;
	}

	public void setCnpjCpf(String cnpjCpf) {
		this.cnpjCpf = cnpjCpf;
	}

	public String getWhatsapp() {
		return whatsapp;
	}

	public void setWhatsapp(String whatsapp) {
		this.whatsapp = whatsapp;
	}

	public String getSegmento() {
		return segmento;
	}

	public void setSegmento(String segmento) {
		this.segmento = segmento;
	}

	public String getEnderecoCompleto() {
		return enderecoCompleto;
	}

	public void setEnderecoCompleto(String enderecoCompleto) {
		this.enderecoCompleto = enderecoCompleto;
	}	
	
}
