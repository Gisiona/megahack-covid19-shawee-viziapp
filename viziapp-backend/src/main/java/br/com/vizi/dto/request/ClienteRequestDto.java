package br.com.vizi.dto.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ClienteRequestDto {

	@NotBlank(message = "O campo [nome] é obrigatório.")
	@JsonProperty("nome")
	private String nome;

	@NotBlank(message = "O campo [email] é obrigatório.")
	@Email
	@JsonProperty("email")
	private String email;
	
	@NotBlank(message = "O campo [cpf] é obrigatório.")
	@JsonProperty("cpf")
	private String cpf;
	
	@NotBlank(message = "O campo [celular_whatsapp] é obrigatório.")
	@JsonProperty("celular_whatsapp")
	private String whatsapp;
	
	@NotBlank(message = "O campo [cep] é obrigatório.")
	@JsonProperty("cep")
	private String cep;
	
	@NotBlank(message = "O campo [endereco_completo] é obrigatório.")
	@JsonProperty("endereco_completo")
	private String enderecoCompleto;
	
	@NotBlank(message = "O campo [senha] é obrigatório.")
	@JsonProperty("senha")
	private String senha;
	
	
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

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
