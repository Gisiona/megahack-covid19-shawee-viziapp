package br.com.vizi.dto.request;

import java.time.LocalDate;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonProperty;

public class VizerRequestDto {
	
	@NotBlank(message = "O campo [nome_vizer] é obrigatório.")	
	@JsonProperty("nome_vizer")
	private String nomeVizer;
		
	@JsonProperty("apelido_vizer")
	private String apelido;
	
	@NotBlank(message = "O campo [email] é obrigatório.")	
	@JsonProperty("email")
	@Email
	private String email;
	
	@NotBlank(message = "O campo [cpf_cnpj] é obrigatório.")	
	@JsonProperty("cpf")	
	private String cpf;
	
	@NotBlank(message = "O campo [telefone_whatsapp] é obrigatório.")	
	@JsonProperty("telefone_whatsapp")
	private String telefoneWhatsapp;
	
	@NotBlank(message = "O campo [cep_residencia] é obrigatório.")	
	@JsonProperty("cep")
	private String cep;
	
	@NotBlank(message = "O campo [endereco_completo] é obrigatório.")	
	@JsonProperty("endereco_completo")
	private String enderecoCompleto;
	
	@NotBlank(message = "O campo [data_nascimento] é obrigatório.")	
	@JsonProperty("data_nascimento")
	private LocalDate dataNascimento;
	
	@JsonProperty("senha")
	private String senha;
	
	
	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getNomeVizer() {
		return nomeVizer;
	}

	public void setNomeVizer(String nomeVizer) {
		this.nomeVizer = nomeVizer;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
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

	public String getTelefoneWhatsapp() {
		return telefoneWhatsapp;
	}

	public void setTelefoneWhatsapp(String telefoneWhatsapp) {
		this.telefoneWhatsapp = telefoneWhatsapp;
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

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

}
