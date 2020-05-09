package br.com.vizi.dto.response;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonProperty;

import br.com.vizi.entity.Vizer;

public class VizerResponseDto {
	
	public VizerResponseDto(Vizer entity) {
		super();
		this.id = entity.getId();
		this.nomeVizer = entity.getNomeVizer();
		this.apelido = entity.getApelido();
		this.email = entity.getEmail();
		this.cpf = entity.getCpf();
		this.telefoneWhatsapp = entity.getTelefoneWhatsapp();
		this.cep = entity.getCep();
		this.enderecoCompleto = entity.getEnderecoCompleto();
		this.dataNascimento = entity.getDataNascimento();
		this.dataCadastro = entity.getDataCadastro();
		this.isAtivo = entity.getIsAtivo();
	}

	
	@JsonProperty("codigo")
	private Long id;
	
	@JsonProperty("nome_vizer")
	private String nomeVizer;
		
	@JsonProperty("apelido_vizer")
	private String apelido;
	
	@JsonProperty("email")
	private String email;
	
	@JsonProperty("cpf")	
	private String cpf;
	
	@JsonProperty("telefone_whatsapp")
	private String telefoneWhatsapp;
	
	@JsonProperty("cep")
	private String cep;
	
	@JsonProperty("endereco_completo")
	private String enderecoCompleto;
	
	@JsonProperty("data_nascimento")
	private LocalDate dataNascimento;
	
	@JsonProperty("data_cadastro")
	private LocalDate dataCadastro;
	
	@JsonProperty("ativo")
	private boolean isAtivo;
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public LocalDate getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(LocalDate dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public boolean isAtivo() {
		return isAtivo;
	}

	public void setAtivo(boolean isAtivo) {
		this.isAtivo = isAtivo;
	}
	
}
