package br.com.vizi.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class EstabelecimentoRequestDTO {
	
	@JsonProperty("nome_fantasia")
	private String nomeFantasia;
	
	@JsonProperty("email")
	private String email;
		
	@JsonProperty("cnpj_cpf")
	private String cnpjCpf;
	
	@JsonProperty("telefone_whatsapp")
	private String whatsapp;
	
	@JsonProperty("senha")
	private String senha;
	
	@JsonProperty("segmento_negocio")
	private String segmento;
	
	@JsonProperty("endereco_completo")
	private String enderecoCompleto;
	
	@JsonProperty("descricao_negocio")
	private String descricao;
	
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
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

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
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
